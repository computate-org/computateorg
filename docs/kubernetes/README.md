
# Setup GKE

Download the right GKE architecture here: https://cloud.google.com/sdk/docs/install

```bash
~/Downloads/google-cloud-cli-444.0.0-linux-x86_64/google-cloud-sdk/install.sh
gcloud components install gke-gcloud-auth-plugin
gcloud auth login
gcloud container clusters get-credentials computate --region us-west3 --project civic-karma-397903
gcloud config set project computate
```

```bash
git clone git@github.com:computate-org/computateorg.git
cd computateorg/
```

## Install the GKE networking

```bash
oc apply -k kustomize/overlays/prod/networking/
```

## Reserve a static IP address

```
gcloud compute addresses create computate --global
```

## Install cert-manager

See [Deploy cert-manager on Google Kubernetes Engine (GKE) and create SSL certificates for Ingress using Let's Encrypt](https://www.google.com/url?sa=t&rct=j&q=&esrc=s&source=web&cd=&cad=rja&uact=8&ved=2ahUKEwiniNyrjJGBAxXeMUQIHT8tBnAQFnoECBQQAQ&url=https%3A%2F%2Fcert-manager.io%2Fdocs%2Ftutorials%2Fgetting-started-with-cert-manager-on-google-kubernetes-engine-using-lets-encrypt-for-ingress-ssl%2F&usg=AOvVaw0Qr4JC3dBHY_qkiWv8HwDB&opi=89978449)

```bash
# oc apply -f https://github.com/cert-manager/cert-manager/releases/download/v1.12.4/cert-manager.yaml

oc apply -f https://github.com/cert-manager/cert-manager/releases/download/v1.12.0/cert-manager.crds.yaml
helm repo add jetstack https://charts.jetstack.io
helm repo update
helm install \
  cert-manager jetstack/cert-manager \
  --namespace cert-manager \
  --create-namespace \
  --version 1.12.4 --set global.leaderElection.namespace=cert-manager
```

## Install Crunchy PostgreSQL Operator to the cluster

```bash
oc create -k kustomize/bundles/postgres/base/
oc create -k kustomize/bundles/postgres/app/
```

## Install Keycloak Operator to the cluster

```bash
oc apply -f https://raw.githubusercontent.com/keycloak/keycloak-k8s-resources/22.0.1/kubernetes/keycloaks.k8s.keycloak.org-v1.yml
oc apply -f https://raw.githubusercontent.com/keycloak/keycloak-k8s-resources/22.0.1/kubernetes/keycloakrealmimports.k8s.keycloak.org-v1.yml
oc create namespace keycloak
oc -n keycloak apply -f https://raw.githubusercontent.com/keycloak/keycloak-k8s-resources/22.0.1/kubernetes/kubernetes.yml
```

## Install Keycloak to the cluster

```bash
oc apply -k kustomize/bundles/keycloak/app/
```

## Create secrets
```bash
POSTGRES_EXTERNAL_ADDRESS="postgres-cluster-ha.postgres.svc.cluster.local"
POSTGRES_EXTERNAL_PORT="5432"
POSTGRES_HOST="postgres-cluster-ha.postgres.svc.cluster.local"
POSTGRES_DATABASE="$(oc -n postgres get secrets/postgres-cluster-pguser-keycloak -o jsonpath={.data.dbname} | base64 -d)"
POSTGRES_USERNAME="$(oc -n postgres get secrets/postgres-cluster-pguser-keycloak -o jsonpath={.data.user} | base64 -d)"
POSTGRES_PASSWORD="$(oc -n postgres get secrets/postgres-cluster-pguser-keycloak -o jsonpath={.data.password} | base64 -d)"
POSTGRES_SUPERUSER="true"

oc -n keycloak create secret generic keycloak-db-secret \
    --from-literal="POSTGRES_EXTERNAL_ADDRESS=${POSTGRES_EXTERNAL_ADDRESS}" \
    --from-literal="POSTGRES_EXTERNAL_PORT=${POSTGRES_EXTERNAL_PORT}" \
    --from-literal="POSTGRES_HOST=${POSTGRES_HOST}" \
    --from-literal="POSTGRES_DATABASE=${POSTGRES_DATABASE}" \
    --from-literal="POSTGRES_USERNAME=${POSTGRES_USERNAME}" \
    --from-literal="POSTGRES_PASSWORD=${POSTGRES_PASSWORD}" \
    --from-literal="POSTGRES_SUPERUSER=${POSTGRES_SUPERUSER}"
```


## Install Keycloak Operator to the cluster

```bash
oc create -k kustomize/bundles/keycloak/app/
```

## Install Apache Solr Operator to the cluster

```bash
helm repo add apache-solr https://solr.apache.org/charts
helm repo add pravega https://charts.pravega.io
oc create namespace solr
oc create -f https://solr.apache.org/operator/downloads/crds/v0.7.1/all-with-dependencies.yaml

helm install zookeeper-operator pravega/zookeeper-operator \
  -n solr \
   --set disableFinalizer=true \
   --set hooks.delete=false \
   --set hooks.backoffLimit=1 \
   --set crd.create=false \
   --set rbac.create=false \
   --set watchNamespace=solr

helm install solr-operator apache-solr/solr-operator --version 0.7.1 \
  -n solr \
  --set leaderElection.enable=false \
  --set rbac.create=false \
  --set serviceAccount.create=true \
  --set serviceAccount.name=solr \
  --set podOptions.serviceAccountName=solr \
  --set watchNamespaces=solr \
  --set zookeeper-operator.install=false \
  --set zookeeper-operator.use=true

```


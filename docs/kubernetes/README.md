
## Install the Operator SDK locally

```bash
export ARCH=$(case $(uname -m) in x86_64) echo -n amd64 ;; aarch64) echo -n arm64 ;; *) echo -n $(uname -m) ;; esac)
export OS=$(uname | awk '{print tolower($0)}')
export OPERATOR_SDK_DL_URL=https://github.com/operator-framework/operator-sdk/releases/download/v1.28.1
curl -LO ${OPERATOR_SDK_DL_URL}/operator-sdk_${OS}_${ARCH}
gpg --keyserver keyserver.ubuntu.com --recv-keys 052996E2A20B5C7E
curl -LO ${OPERATOR_SDK_DL_URL}/checksums.txt
curl -LO ${OPERATOR_SDK_DL_URL}/checksums.txt.asc
gpg -u "Operator SDK (release) <cncf-operator-sdk@cncf.io>" --verify checksums.txt.asc
grep operator-sdk_${OS}_${ARCH} checksums.txt | sha256sum -c -
sudo chmod +x operator-sdk_${OS}_${ARCH} && sudo mv operator-sdk_${OS}_${ARCH} /usr/bin/operator-sdk
```

## Install the Operator SDK to the cluster

```bash
operator-sdk olm install
```

## Install Crunchy PostgreSQL Operator to the cluster

```bash
oc create -k kustomize/bundles/postgres/base/
oc create -k kustomize/bundles/postgres/app/
```

## Install Keycloak Operator to the cluster

```bash
oc create -k kustomize/bundles/keycloak/base/
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


# Install resources to OpenShift Local

```

```

## Copy secrets to individual namespaces

### Copy the `scorpiobroker` secrets to the `scorpiobroker` namespace. 

```bash
oc -n postgres get secret postgres-pguser-scorpiobroker -o json \
    | jq 'del(.metadata["namespace","creationTimestamp","resourceVersion","selfLink","uid","ownerReferences"])' \
    | oc -n scorpiobroker apply -f -
oc -n kafka get secret scorpiobroker-kafka -o json \
    | jq 'del(.metadata["namespace","creationTimestamp","resourceVersion","selfLink","uid","ownerReferences"])' \
    | oc -n scorpiobroker apply -f -
oc -n kafka get secret default-cluster-ca-cert -o json \
    | jq 'del(.metadata["namespace","creationTimestamp","resourceVersion","selfLink","uid","ownerReferences"])' \
    | oc -n scorpiobroker apply -f -
```

### Copy the `iotagent-json` secrets to the `iotagent` namespace. 

```bash
oc -n mongodb get secret mongodb -o json \
    | jq 'del(.metadata["namespace","creationTimestamp","resourceVersion","selfLink","uid","ownerReferences"])' \
    | oc -n iotagent apply -f -
oc -n rabbitmq get secret default-rabbitmq -o json \
    | jq 'del(.metadata["namespace","creationTimestamp","resourceVersion","selfLink","uid","ownerReferences"])' \
    | oc -n iotagent apply -f -
```

### Copy the `sso` secrets to the `sso` namespace. 

Install Keycloak operator

```bash
oc -n sso apply -f https://raw.githubusercontent.com/keycloak/keycloak-k8s-resources/22.0.4/kubernetes/kubernetes.yml
```

```bash
oc -n postgres get secret postgres-cluster-pguser-sso -o json \
    | jq 'del(.metadata["namespace","creationTimestamp","resourceVersion","selfLink","uid","ownerReferences"])' \
    | oc -n sso apply -f -

SSO_ADMIN_PASSWORD=...
oc -n sso create secret generic sso-admin --from-literal password="$SSO_ADMIN_PASSWORD"
oc -n sso create secret generic keycloak-service --from-literal user=service --from-literal password="$SSO_ADMIN_PASSWORD"
oc -n sso create secret generic sso-db-secret --from-literal POSTGRES_USERNAME=sso --from-literal POSTGRES_PASSWORD="$(oc -n postgres get secret/postgres-cluster-pguser-sso -o jsonpath={.data.password} | base64 -d)"
```

### Copy the `smartvillage` secrets to the `smartvillage` namespace. 

```bash
oc -n rabbitmq get secret default-rabbitmq -o json \
    | jq 'del(.metadata["namespace","creationTimestamp","resourceVersion","selfLink","uid","ownerReferences"])' \
    | oc -n smartvillage apply -f -
```

# Install Ansible dependencies

```bash
ansible-galaxy collection install community.hashi\_vault
pip3 install hvac
```

# Obtain postgres password

```bash
# Get JDBC_PASSWORD: 
oc -n postgres get secret/postgres-cluster-pguser-smartvillage -o jsonpath='{.data.password}' | base64 -d; echo
```

# Obtain kafka secrets

```bash

# Get KAFKA_SSL_KEYSTORE_LOCATION: 
oc extract -n smart-village-view secret/smartvillage-kafka --to=$HOME/.local/src/smartabyar-smartvillage/config/ --keys=user.p12 --confirm

# Get KAFKA_SSL_KEYSTORE_PASSWORD: 
oc -n smart-village-view get secret/smartvillage-kafka -o jsonpath='{.data.user\.password}' | base64 -d; echo

# Get KAFKA_SSL_TRUSTSTORE_LOCATION: 
oc extract -n smart-village-view secret/smartvillage-kafka-cluster-ca-cert --to=$HOME/.local/src/smartabyar-smartvillage/config/ --keys=ca.p12 --confirm

# Get KAFKA_SSL_TRUSTSTORE_PASSWORD: 
oc -n smart-village-view get secret/smartvillage-kafka-cluster-ca-cert -o jsonpath='{.data.ca\.password}' | base64 -d; echo
```

# Setup computateorg development environment on MacOSX or Linux (Fedora, RHEL, CentOS, Ubuntu)

## Install Ansible dependencies on Linux

```bash
pkcon install -y git
pkcon install -y python3
pkcon install -y python3-pip
pip install virtualenv psycopg2-binary openshift
```

## Install Ansible dependencies on MacOSX

```bash
brew install git python gnu-tar
pip3 install virtualenv
```

## Install the latest Python and setup a new Python virtualenv

This step might be virtualenv-3 for you. 

```bash
virtualenv ~/python

source ~/python/bin/activate
echo "source ~/python/bin/activate" | tee -a ~/.bashrc
source ~/.bashrc
```

## Install the latest Ansible

```bash
pip install setuptools_rust wheel
pip install --upgrade pip
pip install ansible
```

## Update the Ansible Galaxy collections for kubernetes.core

```bash
ansible-galaxy collection install kubernetes.core
```

## Update the Ansible Galaxy collections for kubernetes.core

```bash
ansible-galaxy collection install kubernetes.core
```

# Setup the project

## Setup the directory for the project and clone the git repository into it 

```bash
install -d ~/.local/src/computateorg
git clone git@github.com:computate-org/computateorg.git ~/.local/src/computateorg
```

## Setup the Ansible Galaxy roles for installing the complete project locally. 

```bash
install -d ~/.ansible/roles
git clone git@github.com:computate-org/computate_project.git ~/.ansible/roles/computate.computate_project
```

## Run the Ansible Galaxy roles to install the complete project locally. 

```bash
ansible-playbook ~/.ansible/roles/computate.computate_project/install.yml -e SITE_NAME=computateorg -e ENABLE_CODE_GENERATION_SERVICE=true
```

## Running the project build and test suite

The computateorg project uses Maven to build and test the software. 
You can run the build and test suite with this command: 

```
cd ~/.local/src/computateorg
mvn clean install
```

## Running the project install to override secret variables

You can also inject your own secret variables with an Ansible Vault into the project install automation if you want to override any values. 

Here is an example of creating a vault directory and creating a new vault, it will ask for a password. 
Be sure to not commit your vault to source control, it should be ignored by default in the .gitignore file that is created in the project. 

```bash
install -d ~/.local/src/computateorg-ansible/vault
ansible-vault create ~/.local/src/computateorg-ansible/vault/$USER-local
```

You can edit the vault, it will ask for the password. 

```bash
ansible-vault edit ~/.local/src/computateorg-ansible/vault/$USER-local
```

You can then run the project install automation again with the secrets in the vault, it will ask for the password. 

```bash
ansible-playbook ~/.ansible/roles/computate.computate_project/install.yml -e SITE_NAME=computateorg -e ENABLE_CODE_GENERATION_SERVICE=true -e @~/.local/src/computateorg-ansible/vault/$USER-local --vault-id @prompt
```

# Configure Eclipse IDE 

You can download Eclipse Installer here: 

https://www.eclipse.org/downloads/packages/

After you download the Eclipse installer, create a directory for it and extract it with this command: 

```bash
install -d ~/.local/opt/eclipse-installer
tar xvf ~/Downloads/eclipse-inst-jre-linux64.tar.gz -C ~/.local/opt/eclipse-installer --strip-components=1
```

Now run the Eclipse installer: 

```bash
~/.local/opt/eclipse-installer/eclipse-inst
```

- Select [ Eclipse IDE for Java Developers ]
- I recommend installing Eclipse in the following subdirectory of your home directory: .local/opt/eclipse
- Click [ Accept Now ] for the User Agreement

When you run Eclipse Studio, I suggest you create your workspace here: ~/.local/src

## Install these update sites: 

In Eclipse, go to Help -> Install New Software...

Add these update sites and install these useful plugins: 

### Vrapper Vim Plugin
- http://vrapper.sourceforge.net/update-site/stable
    - Choose the "Vrapper" plugin if you want to be able to edit code with Vim commands
    - Vrapper keys to unbind in Window -> Preferences -> General -> Keys: 
        - ctrl+d, ctrl+u, ctrl+r, shift+ctrl+v, alt+v
    - Vrapper keys to set: 
        - and search for "Vrapper" and set the keys to alt+v

### DevStyle for dark theme

- http://www.genuitec.com/updates/devstyle/ci/
    - Choose "DevStyle Features" for themes

### YAML Editor

- http://www.genuitec.com/updates/devstyle/ci/
    - Choose "DevStyle Features" for themes

## Import the computateorg project into Eclipse

* In Eclipse, go to File -> Import...
* Select Maven -> Existing Maven Projects
* Click [ Next > ]
* Browse to the directory: ~/.local/src/computateorg
* Click [ Finish ]

## Setup a Eclipse Debug/Run configuration to generate the OpenAPI 3 spec and the SQL create and drop scripts in computateorg

* In Eclipse, go to File -> Debug Configurations...
* Right click on Java Application -> New Configuration
* Name: computateorg-OpenAPIGenerator
* Project: computateorg
* Main class: org.computate.site.enus.vertx.MainVerticle

### In the Environment tab

Setup the following variables to setup the Vert.x verticle. 

* CONFIG_PATH: ~/.local/src/computateorg/config/computateorg.yml
* RUN_OPENAPI3_GENERATOR: true
* RUN_SQL_GENERATOR: true
* RUN_FIWARE_GENERATOR: true

Click [ Apply ] and [ Debug ] to debug the generation of the OpenAPI Spec src/main/resources/webroot and the SQL create and drop scripts in src/main/resources/sql. 

## Setup a Eclipse Debug/Run configuration to run and debug computateorg

* In Eclipse, go to File -> Debug Configurations...
* Right click on Java Application -> New Configuration
* Name: computateorg
* Project: computateorg
* Main class: org.computate.site.enus.vertx.MainVerticle

### In the "Arguments" tab

Setup the following VM arguments to disable caching for easier web development: 

```
-DfileResolverCachingEnabled=false -Dvertx.disableFileCaching=true
```

### In the Environment tab

Setup the following variables to setup the Vert.x verticle. 

* CONFIG_PATH: ~/.local/src/computateorg/config/computateorg.yml
* VERTXWEB_ENVIRONMENT: dev

Click [ Apply ] and [ Debug ] to debug the application. 

# Deploy computateorg to OpenShift with Ansible

To deploy computateorg to OpenShift with Ansible, you will want to follow the instructions to install Ansible on your system first above "Install Ansible dependencies on Linux". 

## Setup ~/.ansible/roles directory

A default place to install Ansible roles from Ansible Galaxy is in ~/.ansible/roles. Make sure this directory exists: 

```bash
install -d ~/.ansible/roles
```

## Clone the Ansible roles for deploying the applications to OpenShift

```bash
git clone git@github.com:computate-org/computate_postgres_openshift.git ~/.ansible/roles/computate.computate_postgres_openshift
git clone git@github.com:computate-org/computate_zookeeper_openshift.git ~/.ansible/roles/computate.computate_zookeeper_openshift
git clone git@github.com:computate-org/computate_solr_openshift.git ~/.ansible/roles/computate.computate_solr_openshift
git clone git@github.com:computate-org/computate_project_openshift.git ~/.ansible/roles/computate.computate_project_openshift
```

## Create an ansible vault for your OpenShift.

You can create and edit an encrypted ansible vault with a password for the host secrets for your shared OpenShift inventory to deploy computateorg.
It will have you create a password when you save the file for the first time, like using vim to exit. 

```bash
install -d ~/.local/src/computateorg-ansible
install -d ~/.local/src/computateorg-ansible/vault/$USER-staging/vault
ansible-vault create ~/.local/src/computateorg-ansible/vault/$USER-staging/vault
ansible-vault edit ~/.local/src/computateorg-ansible/vault/$USER-staging/vault
```

Here is an example of a vault that I have used to deploy the computateorg application. 
You will want to update these values to reflect your OpenShift environment, like the REDHAT_OPENSHIFT_TOKEN which you will need to obtain after logging into OpenShift. 
Or the REDHAT_OPENSHIFT_STORAGE_CLASS_NAME which might be different than gp2 for you. 
If so, try creating a persistent volume in the UI to figure out a good storage class for your environment: 

```yaml
SITE_NAME: computateorg

REDHAT_OPENSHIFT_HOST: https://api.rh-us-east-1.openshift.com
REDHAT_OPENSHIFT_TOKEN: OcrtrXzKNKVj0riR2FvfqORgGfnURx98G8zRPd2MUvs
REDHAT_OPENSHIFT_NAMESPACE: rh-impact
REDHAT_OPENSHIFT_STORAGE_CLASS_NAME: gp2

POSTGRES_DB_NAME: sampledb
POSTGRES_DB_USER: computate
POSTGRES_DB_PASSWORD: qVTaaa23aIkLmw
POSTGRES_VOLUME_SIZE: 1Gi
POSTGRES_STORAGE_CLASS_NAME: "{{ REDHAT_OPENSHIFT_STORAGE_CLASS_NAME }}"

ZOOKEEPER_VOLUME_SIZE: 1Gi
ZOOKEEPER_STORAGE_CLASS_NAME: "{{ REDHAT_OPENSHIFT_STORAGE_CLASS_NAME }}"

SOLR_VOLUME_SIZE: 2Gi
SOLR_STORAGE_CLASS_NAME: "{{ REDHAT_OPENSHIFT_STORAGE_CLASS_NAME }}"

AUTH_REALM: SMARTVILLAGE
AUTH_CLIENT: smartvillage
AUTH_SECRET: ...
AUTH_HOST_NAME: sso.computate.org
AUTH_PORT: 443
AUTH_SSL: true
AUTH_TOKEN_URI: "/auth/realms/SMARTVILLAGE/protocol/openid-connect/token"
```

## Run the Ansible automation to deploy the applications to OpenShift

```bash

ansible-playbook --vault-id @prompt -e @~/.local/src/computateorg-ansible/vault/$USER-staging/vault ~/.ansible/roles/computate.computate_postgres_openshift/install.yml -e SITE_NAME=computateorg

ansible-playbook --vault-id @prompt -e @~/.local/src/computateorg-ansible/vault/$USER-staging/vault ~/.ansible/roles/computate.computate_zookeeper_openshift/install.yml -e SITE_NAME=computateorg

ansible-playbook --vault-id @prompt -e @~/.local/src/computateorg-ansible/vault/$USER-staging/vault ~/.ansible/roles/computate.computate_solr_openshift/install.yml -e SITE_NAME=computateorg

ansible-playbook --vault-id @prompt -e @~/.local/src/computateorg-ansible/vault/$USER-staging/vault ~/.ansible/roles/computate.computate_project_openshift/install.yml -e SITE_NAME=computateorg
```

## How to run the application as a Podman container

### Install the prerequiste packages for buildah and podman

```bash
pkcon install -y buildah
pkcon install -y podman
```

### Build the container with podman

```bash
cd ~/.local/src/computateorg
podman build -t computateorg/computateorg:latest .
```

### Push the container up to quay.io
```bash
podman login quay.io
podman push computateorg/computateorg:latest quay.io/computateorg/computateorg:latest
```

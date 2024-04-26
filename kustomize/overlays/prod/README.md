
```bash
oc -n keycloak create secret generic sso-admin --from-literal=password=...

oc -n keycloak create secret generic sso-service --from-literal=user=service --from-literal=password=...

oc -n postgres get secret postgres-cluster-pguser-sso -o json \
    | jq 'del(.metadata["namespace","creationTimestamp","resourceVersion","selfLink","uid","ownerReferences"])' \
    | oc -n keycloak apply -f -
```
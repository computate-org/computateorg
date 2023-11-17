
```bash

ansible-playbook apply-trafficsimulation.yaml -e enable_dev_nodeports=true -e crd_path=kustomize/overlays/openshift-local/app/trafficsimulations/veberod-intersection-1/trafficsimulation.yaml

ansible-playbook apply-trafficflowobserved.yaml -e enable_dev_nodeports=true -e crd_path=kustomize/overlays/openshift-local/app/trafficflowobserveds/sweden-veberod-1-lakaregatan-ne/trafficflowobserved.yaml

ansible-playbook apply-trafficflowobserved.yaml -e enable_dev_nodeports=true -e crd_path=kustomize/overlays/openshift-local/app/trafficflowobserveds/sweden-veberod-1-sjobovagen-se/trafficflowobserved.yaml
```
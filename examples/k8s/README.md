


```shell
kubectl apply -f dashboard-adminuser.yaml
kubectl apply -f dashboard-clusterrolebinding.yaml
```


```shell
kubectl -n kubernetes-dashboard create token admin-user
```

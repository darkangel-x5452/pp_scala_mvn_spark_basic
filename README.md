# pp_scala_mvn_spark_basic

# Python
``` 
RUN apt-get update && \
#     apt install -y python python-pip && \
    apt install -y python3 python3-pip && \
```
kubectl get node minikube -o jsonpath='{.status.capacity}'

minikube stop
minikube delete
minikube start --memory 4096 --cpus 3

kubectl config view

- ./bin/docker-image-tool.sh -r example/repo -t spark-app build
- ./bin/docker-image-tool.sh -r example/repo -t spark-app push
- ./bin/docker-image-tool.sh -r name.rego.io/example/repo -t latest push
- docker image tag example/repo/spark:spark-app name.rego.io/example/repo/spark:latest

- spark-submit --master k8s://https://127.0.0.1:53867 --deploy-mode cluster --name spark-pi --class org.apache.spark.examples.SparkPi --conf spark.executor.instances=1 --conf spark.kubernetes.container.image=apache/spark:v3.1.3 local://///opt/spark/examples/jars/spark-examples_2.12-3.1.3.jar

    - spark-submit --master k8s://https://api-server.io:api-port --deploy-mode cluster --name spark-pi --class org.apache.spark.examples.SparkPi --conf spark.executor.instances=1 --conf spark.kubernetes.container.image=name.rego.io/example/repo/spark:latest local://///opt/spark/examples/jars/spark-examples_2.11-2.4.7.jar

- localhost:5000/example/repo
- example/repo/spark:spark-app
- file:///C:/_portable_apps/spark/spark-2.4.7-bin-hadoop2.7/examples/jars/spark-examples_2.11-2.4.7.jar
- file:///mnt/path/to/file
- local:////c/_portable_apps/spark/spark-2.4.7-bin-hadoop2.7/examples/jars/spark-examples_2.11-2.4.7.jar
- local:////C:/_portable_apps/spark/spark-2.4.7-bin-hadoop2.7/examples/jars/spark-examples_2.11-2.4.7.jar

- 23/02/21 15:11:06 WARN DependencyUtils: Local jar /c/_portable_apps/spark/spark-2.4.7-bin-hadoop2.7/examples/jars/spark-examples_2.11-2.4.7.jar does not exist, skipping.
- 23/02/21 15:17:31 WARN DependencyUtils: Local jar /opt/spark/work-dir/null does not exist, skipping.


- C:\_portable_apps\spark\spark-2.4.7-bin-hadoop2.7\examples\jars

`kubectl config unset users.clusterUser_rg_trial_work_1_TrialKubesClusterV1`
`kubectl config unset contexts.TrialKubesClusterV1`
`kubectl config unset clusters.TrialKubesClusterV1`

`kubectl get configmap spark-pi-1676991729721-driver-conf-map`
`kubectl get pods`
`kubectl logs spark-pi-1676991729721-driver`


https://stackoverflow.com/questions/62543646/why-external-scheduler-cannot-be-instantiated-running-spark-on-minikube-kubernet
- kubectl create clusterrolebinding default --clusterrole=edit --serviceaccount=default:default --namespace=default

spark-submit --master k8s://https://api-server.io:api-port --deploy-mode cluster --name spark-pi --class org.apache.spark.examples.SparkPi --conf spark.executor.instances=1 --conf spark.kubernetes.container.image=name.rego.io/example/repo/spark:latest local://///opt/spark/examples/jars/spark-examples_2.11-2.4.7.jar


kubectl get pods
kubectl logs spark-pi-44234234-driver
kubectl logs spark-pi-86578876-exec-1


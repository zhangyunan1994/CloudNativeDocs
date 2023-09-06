# Java: App Order

## 开发步骤

jdk8 + maven

## Docker 打包

```shell
mvn clean package -Dmaven.test.skip=true -DskipTests=true
```

```shell
docker build -t zyndev/app-order:1.0 .
```

```shell
docker build .
```

```shell
docker build -t zyndev/app-order:1.2 -f Dockerfile2 .
```

## Docker 运行

默认运行
```shell
docker run -p 30001:30000 -d --name app-order zyndev/app-order:1.0
```

设置启动参数并启动
```shell
docker run -e "JAVA_ARGS=--spring.profiles.active=prod" -p 30002:30000 -d --name app-order-prod zyndev/app-order:1.0
```

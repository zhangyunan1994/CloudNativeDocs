FROM openjdk:8u342-oracle
LABEL authors="zhangyunan"

ENV TZ=Asia/Shanghai
ENV LC_ALL en_US.utf8

WORKDIR /app

COPY target/*.jar /app/app.jar
COPY docker-entrypoint.sh /app

RUN chmod +x docker-entrypoint.sh

EXPOSE 30000

ENTRYPOINT ["docker-entrypoint.sh"]
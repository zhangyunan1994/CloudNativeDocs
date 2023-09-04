FROM alpine:3.18.3
LABEL authors="zhangyunan"

WORKDIR /app

COPY dist/web-console /app
COPY docker-entrypoint.sh /app

RUN chmod +x docker-entrypoint.sh

EXPOSE 20000

ENTRYPOINT ["docker-entrypoint.sh"]

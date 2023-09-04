FROM python:3.9-slim
LABEL authors="zhangyunan"

WORKDIR /app

COPY requirements.txt /app
COPY app.py /app
COPY docker-entrypoint.sh /app

RUN pip install -r requirements.txt && chmod +x docker-entrypoint.sh

EXPOSE 20000

ENTRYPOINT ["./docker-entrypoint.sh"]

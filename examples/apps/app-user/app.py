from flask import Flask

app = Flask(__name__)

users = {
    1: {
        "name": '小明',
        "age": 10,
        "sex": "男"
    },
    2: {
        "name": '小红',
        "age": 20,
        "sex": "女"
    },
}


@app.get("/user/<id>")
def userinfo(id: int):
    return users.get(int(id))


if __name__ == '__main__':
    app.run(host='0.0.0.0', port=20000)

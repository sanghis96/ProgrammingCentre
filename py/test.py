from flask import Flask       #import flask module
app = Flask(__name__)         #make this a flask application

@app.route("/") # route the "/" url to this function.
def index():
    return "oiuhygf"

if __name__=="__main__":
    app.run(host='0.0.0.0', port=8000)      #run app on own IP


#app.run()      #run app on localhost


from flask import request, render_template, Flask

.
.
.
.
.
.
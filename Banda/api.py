from flask import Flask, render_template, request
import Banda as bn


app = Flask(__name__)

banda = bn.Banda()

@app.route('/')
def home():
    return render_template('index.html', texto="", lon=0)

@app.route('/accion/<nombre>', methods=['GET','POST'])
def accion(nombre):

    global banda
    
    preparar = banda.devolverPreparar()
    tocar = banda.devolverTocar()
    imagen = banda.devolverImagen()
    longitud = len(imagen)

    if nombre=="preparar":
        return render_template('index.html', texto=preparar, imagen=imagen, lon=longitud)
    if nombre=="tocar":
        return render_template('index.html', texto=tocar, imagen=imagen, lon=longitud)
    if nombre=="generar":
        banda = bn.Banda()
        enviar = ["Banda generada"]
        return render_template('index.html', texto=enviar, imagen="", lon = 0) 
    





    


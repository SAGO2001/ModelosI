import random


class Banda():
    musicos = []
    preparar = []
    tocar = []
    imagen = []
    def __init__(self):
        alea = random.randint(5, 10)

        self.musicos = list(range(alea))
        self.preparar = list(range(alea))
        self.tocar = list(range(alea))
        self.imagen = list(range(alea))

        for i in range(alea):
            self.musicos[i] = Musico()
            self.musicos[i].asignarInstrumento()

        for i in range(alea):
            self.preparar[i] = self.musicos[i].prepararInstrumento()
            self.tocar[i] = self.musicos[i].tocarInstrumento()
            self.imagen[i] = self.musicos[i].devolverImagen()
        

    def devolverPreparar(self):
        return self.preparar
    def devolverTocar(self):
        return self.tocar
    def devolverImagen(self):
        return self.imagen
        
class Instrumento():
    def tocar(self):
        return "Tocando instrumento"
    def preparar(self):
        return "Preparando instrumento"
    def imagen(self):
        return "imagen"

class Guitarra(Instrumento):
    def tocar(self):
        return "Tocando guitarra"
    def preparar(self):
        return "Templando cuerdas"
    def imagen(self):
        return 'img/guitarra.png'

class Arpa(Instrumento):
    def tocar(self):
        return "Tocando arpa"
    def preparar(self):
        return "Templando cuerdas"
    def imagen(self):
        return 'img/arpa.png'

class Acordeon(Instrumento):
    def tocar(self):
        return "Tocando acordeon"
    def preparar(self):
        return "Ajustando teclas"
    def imagen(self):
        return 'img/acordeon.jpg'

class Flauta(Instrumento):
    def tocar(self):
        return "Tocando flauta"
    def preparar(self):
        return "Afinando flauta"
    def imagen(self):
        return 'img/flauta.jpg'

class Tambor(Instrumento):
    def tocar(self):
        return "Tocando tambor"
    def preparar(self):
        return "Preparando tambor"
    def imagen(self):
        return 'img/tambor.jpg'

class Guaracha(Instrumento):
    def tocar(self):
        return "Tocando guaracha"
    def preparar(self):
        return "Preparando guaracha"
    def imagen(self):
        return 'img/guaracha.jpg'

class Musico():
    instrumento = Instrumento()
    def tocarInstrumento(self):
        return self.instrumento.tocar()
    def prepararInstrumento(self):
        return self.instrumento.preparar()
    def devolverImagen(self):
        return self.instrumento.imagen()

    def asignarInstrumento(self):
        alea = random.randint(1, 6)
        if alea==1:
            self.instrumento = Guitarra()
        elif alea==2:
            self.instrumento = Arpa()
        elif alea==3:
            self.instrumento = Acordeon()
        elif alea==4:
            self.instrumento = Flauta()
        elif alea==5:
            self.instrumento = Tambor()
        else:
            self.instrumento = Guaracha()






    

Director director;
Sprites sprite;
Personaje personaje;

String derecha[], izquierda[], arriba[], morir[], quieto[], poder[];
String imagePrefix[][] = new String [6][10];
PImage[][] images = new PImage[6][10];
int frame, k=1, j=0, indice = 0;
int tam[] = new int[6];
float xpos = 170;
float ypos = 170;
boolean empezar;

void setup() {
  //Tamaño de la pantalla
  size(1000, 600);
  
  //Background de la pantalla
  background(255, 204, 0);
  
  //Cuadros por segundo
  frameRate(20);
  
  empezar = true;
}

void draw() { 
  // Display the sprite at the position xpos, ypos
  background(255, 255, 255);
  
  if(empezar){
    background(0, 0, 0);
    textSize(20);
    text("Presione 1 para Ninja",100,200);
    text("Presione 2 para Vaquera",100,400);
    
    
      if(key=='1'){
        personaje(new ConstructorNinja(), 1);
        empezar = false;
      }
      if(key=='2'){
        personaje(new ConstructorVaquera(), 2);
        empezar = false;
      }
    
  }
  else{
    cargar(indice);  
    textSize(20);
    if(keyPressed && key == CODED){
      if (keyCode==LEFT){
        if(k==1){
          indice = 3;
          k=0;
        }
        xpos = xpos-20;
      } 
      else if (keyCode==RIGHT){
        if(k==1){
          indice = 2;
          k=0;
        }
        xpos = xpos+20;
      } 
      else if (keyCode==UP){
        if(k==1){
          indice = 1;
          k=0;
        }
        ypos = ypos-20;
      } 
      else if (keyCode==DOWN){
        if(k==1){
          indice = 1;
          k=0;
        }
        ypos = ypos+20;
      }
      else if (keyCode==SHIFT){
        if(k==1 && j<2){
          indice = 5;
          k=0;
          j++;
        }
      }
    }
    else{
    if(k==0){
      indice = 0;
      j=0;
      k=1;
    }
  }
  }
  
}


void cargar(int indice){
  frame = (frame+1) % tam[indice];
  image(images[indice][frame], xpos, ypos);
}

void personaje(Constructor cons, int c){
  //Llamado al director del constructor
  director = new Director();
  
  //Construyendo el personaje
  director.setConstructor(cons);
  
  if(c==1){
    //Retornando el personaje
    personaje = director.devNinja();
  }
  else{
    personaje = director.devVaquera();
  }
  
  //Guardando los sprites devueltos
  sprite = personaje.getSprites();
  
  //Los sprites de derecha
  derecha = sprite.getDerecha();
  
  //Los sprites de izquierda
  izquierda = sprite.getIzquierda();
  
  //Los sprites de arriba
  arriba = sprite.getSubir();
  
  //Los sprites de morir
  morir = sprite.getMorir();
  
  //Los sprites de quieto
  quieto = sprite.getQuieto();
  
  //Los sprites de poder
  poder = sprite.getPoder();
  
  imagePrefix[0] = quieto;
  imagePrefix[1] = arriba;
  imagePrefix[2] = derecha;
  imagePrefix[3] = izquierda;
  imagePrefix[4] = morir;
  imagePrefix[5] = poder;

  tam[0] = quieto.length;
  tam[1] = arriba.length;
  tam[2] = derecha.length;
  tam[3] = izquierda.length;
  tam[4] = morir.length;
  tam[5] = poder.length;
  
  for (int i = 0; i < 6; i++) {
    for (int j=0; j < tam[i]; j++){
      images[i][j] = loadImage(imagePrefix[i][j]);
    }
  }
}

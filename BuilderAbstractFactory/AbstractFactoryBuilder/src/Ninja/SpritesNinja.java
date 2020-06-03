package Ninja;
import Productos.Sprites;

public class SpritesNinja extends Sprites{

	@Override
	public String[] getIzquierda() {
		// TODO Auto-generated method stub
		String [] izquierda = new String[10];
		for(int i=0; i<10; i++) {
			izquierda[i] = "Ninja/Izquierda/Run__00"+i+".png";
		}
		return izquierda;
	}

	@Override
	public String[] getDerecha() {
		// TODO Auto-generated method stub
		String [] derecha = new String[10];
		for(int i=0; i<10; i++) {
			derecha[i] = "Ninja/Derecha/Run__00"+i+".png";
		}
		return derecha;
	}

  @Override
  public String[] getSubir() {
    // TODO Auto-generated method stub
    String [] derecha = new String[10];
    for(int i=0; i<10; i++) {
      derecha[i] = "Ninja/Arriba/Climb_00"+i+".png";
    }
    return derecha;
  }
    
  @Override
  public String[] getMorir() {
    // TODO Auto-generated method stub
    String [] derecha = new String[10];
    for(int i=0; i<10; i++) {
      derecha[i] = "Ninja/Morir/Dead__00"+i+".png";
    }
    return derecha;
  }
  
  @Override
  public String[] getQuieto() {
    // TODO Auto-generated method stub
    String [] derecha = new String[10];
    for(int i=0; i<10; i++) {
      derecha[i] = "Ninja/Quieto/Idle__00"+i+".png";
    }
    return derecha;
  }
  
  @Override
  public String[] getPoder() {
    // TODO Auto-generated method stub
    String [] derecha = new String[10];
    for(int i=0; i<10; i++) {
      derecha[i] = "Ninja/Poder/Jump_Attack__00"+i+".png";
    }
    return derecha;
  }
}

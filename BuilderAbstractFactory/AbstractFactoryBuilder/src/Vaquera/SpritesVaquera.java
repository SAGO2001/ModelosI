package Vaquera;
import Productos.Sprites;

public class SpritesVaquera extends Sprites{

	@Override
	public String[] getIzquierda() {
		// TODO Auto-generated method stub
		String [] izquierda = new String[8];
		for(int i=0; i<8; i++) {
			izquierda[i] = "Vaquera/Izquierda/Run ("+(i+1)+").png";
		}
		return izquierda;
	}

	@Override
	public String[] getDerecha() {
		// TODO Auto-generated method stub
		String [] derecha = new String[8];
		for(int i=0; i<8; i++) {
			derecha[i] = "Vaquera/Derecha/Run ("+(i+1)+").png";
		}
		return derecha;
	}

  @Override
  public String[] getSubir() {
	// TODO Auto-generated method stub
	String [] derecha = new String[8];
	for(int i=0; i<8; i++) {
		derecha[i] = "Vaquera/Derecha/Run ("+(i+1)+").png";
	}
	return derecha;
  }
    
  @Override
  public String[] getMorir() {
    // TODO Auto-generated method stub
    String [] derecha = new String[10];
    for(int i=0; i<10; i++) {
      derecha[i] = "Vaquera/Morir/Dead ("+(i+1)+").png";
    }
    return derecha;
  }
  
  @Override
  public String[] getQuieto() {
    // TODO Auto-generated method stub
    String [] derecha = new String[10];
    for(int i=0; i<10; i++) {
      derecha[i] = "Vaquera/Quieto/Idle ("+(i+1)+").png";
    }
    return derecha;
  }
  
  @Override
  public String[] getPoder() {
    // TODO Auto-generated method stub
    String [] derecha = new String[10];
    for(int i=0; i<10; i++) {
      derecha[i] = "Vaquera/Poder/Jump ("+(i+1)+").png";
    }
    return derecha;
  }
}

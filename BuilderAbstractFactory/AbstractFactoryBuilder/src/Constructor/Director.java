package Constructor;
import Ninja.*;
import Vaquera.Vaquera;

public class Director {
	protected Constructor builder;
	
	public void setConstructor(Constructor cons) {
		builder = cons;
	}
	
	public Ninja devNinja() {
		Ninja personaje = new Ninja();
		personaje.setNombre(builder.getNombre());
		personaje.setMovimiento(builder.getMovimiento());
		personaje.setSprites(builder.getSprites());
		
		return personaje;
	}
	
	public Vaquera devVaquera() {
		Vaquera personaje = new Vaquera();
		personaje.setNombre(builder.getNombre());
		personaje.setMovimiento(builder.getMovimiento());
		personaje.setSprites(builder.getSprites());
		
		return personaje;
	}
}

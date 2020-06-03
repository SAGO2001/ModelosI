package Vaquera;

import Productos.Movimiento;
import Productos.Nombre;
import Productos.Personaje;
import Productos.Sprites;

public class Vaquera extends Personaje{

	private Nombre nombre;
	private Movimiento movimiento;
	private Sprites sprites;
	
	public void setNombre(Nombre nombre) {
		this.nombre = nombre;
	}
	
	public void setMovimiento(Movimiento movimiento) {
		this.movimiento = movimiento;
	}
	
	public void setSprites(Sprites sprite) {
		this.sprites = sprite;
	}
	
	public Nombre getNombre() {
		return nombre;
	}
	
	public Movimiento getMovimiento() {
		return movimiento;
	}
	
	public Sprites getSprites() {
		return sprites;
	}

}

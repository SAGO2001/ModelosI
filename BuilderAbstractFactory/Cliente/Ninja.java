public class Ninja extends Personaje{
	
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

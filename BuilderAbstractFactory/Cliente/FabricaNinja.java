public class FabricaNinja extends Fabrica{
	
	
	@Override
	public Nombre crearNombre() {
		// TODO Auto-generated method stub 
		return new NombreNinja();
	}

	@Override
	public Movimiento crearMovimiento() {
		// TODO Auto-generated method stub
		return new MovimientoNinja();
	}

	@Override
	public Sprites crearSprites() {
		// TODO Auto-generated method stub
		return new SpritesNinja();
	}

}

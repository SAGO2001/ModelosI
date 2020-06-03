public class FabricaVaquera extends Fabrica{

	@Override
	public Nombre crearNombre() {
		// TODO Auto-generated method stub
		return new NombreVaquera();
	}

	@Override
	public Movimiento crearMovimiento() {
		// TODO Auto-generated method stub
		return new MovimientoVaquera();
	}

	@Override
	public Sprites crearSprites() {
		// TODO Auto-generated method stub
		return new SpritesVaquera();
	}

}

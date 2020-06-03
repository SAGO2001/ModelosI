public class ConstructorNinja extends Constructor{
	
	protected FabricaNinja fabrica;
	
	public ConstructorNinja() {
		fabrica = new FabricaNinja(); 
	}
	
	@Override
	public Nombre getNombre() {
		// TODO Auto-generated method stub
		return fabrica.crearNombre();
	}

	@Override
	public Movimiento getMovimiento() {
		// TODO Auto-generated method stub
		return fabrica.crearMovimiento();
	}

	@Override
	public Sprites getSprites() {
		// TODO Auto-generated method stub
		return fabrica.crearSprites();
	}
	
	

}

package Constructor;

import Fabricas.FabricaVaquera;
import Productos.Movimiento;
import Productos.Nombre;
import Productos.Sprites;

public class ConstructorVaquera extends Constructor{
	
	protected FabricaVaquera fabrica;
	
	public ConstructorVaquera() {
		fabrica = new FabricaVaquera();
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

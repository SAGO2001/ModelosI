package Fabricas;

import Productos.*;

public abstract class Fabrica {
	public abstract Nombre crearNombre();
	public abstract Movimiento crearMovimiento();
	public abstract Sprites crearSprites();
}

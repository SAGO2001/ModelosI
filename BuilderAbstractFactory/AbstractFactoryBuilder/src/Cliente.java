import Constructor.*;
import Ninja.*;
import Vaquera.*;

public class Cliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Director director = new Director();
		director.setConstructor(new ConstructorVaquera());
		
		Vaquera ninja = director.devVaquera();
		
		System.out.println(ninja.getSprites().getPoder()[2]);
	}

}

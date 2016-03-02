package ducks;

import interfaces.BeSilnet;
import interfaces.ICannotFly;

public class DuckPrototype extends Duck {
	
	public DuckPrototype() {
		fi = new ICannotFly();
		qi = new BeSilnet();
	}

	@Override
	public void display() {
		System.out.println("It's a prototype of new duck.");

	}

}

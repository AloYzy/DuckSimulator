package ducks;

import interfaces.ICanFly;
import interfaces.Quack;

public class WildDuck extends Duck {
	
	public WildDuck(){
		fi = new ICanFly();
		qi = new Quack();
	}

	@Override
	public void display() {
		System.out.println("It looks like a real wild duck.");

	}

}

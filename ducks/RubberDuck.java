package ducks;

import interfaces.ICannotFly;
import interfaces.Squeak;

public class RubberDuck extends Duck {
	
	public RubberDuck() {
		fi = new ICannotFly();
		qi = new Squeak();
	}

	@Override
	public void display() {
		System.out.println("Yellow and rubbery.");

	}

}

package ducks;
import interfaces.Flyable;
import interfaces.Quackable;

public abstract class Duck {

	protected Flyable fi;
	protected Quackable qi;

	public abstract void display();

	public void swim() {
		System.out.println("All ducks can swim. Even the artificial ones.");
	}

	public void performFly() {
		fi.fly();
	}

	public void performQuack() {
		qi.quack();
	}

	public void setFlyInterface(Flyable fi) {
		this.fi = fi;
	}

	public void setQuackInterface(Quackable qi) {
		this.qi = qi;
	}

}

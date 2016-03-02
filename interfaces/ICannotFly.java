package interfaces;

public class ICannotFly implements Flyable {

	@Override
	public void fly() {
		System.out.println("I can't fly.");

	}

}

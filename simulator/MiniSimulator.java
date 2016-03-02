package simulator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import ducks.Duck;
import ducks.DuckPrototype;
import ducks.RubberDuck;
import ducks.WildDuck;
import interfaces.RocketFlight;

public class MiniSimulator {

	public static void main(String args[]) {

		// tworzenie nowych kaczek
		List<Duck> ducks = Arrays.asList(new WildDuck(), new DuckPrototype(), new RubberDuck());

		// tworzenie iteratora
		Iterator<Duck> it = ducks.iterator();

		// wyœwietlanie kaczek przy u¿yciu iteratora
		while (it.hasNext()) {
			Duck duck = it.next();
			System.out.print(duck.getClass().getSimpleName() + " - ");
			duck.display();
		}
		System.out.print("\n");

		// tworzenie listIteratora
		ListIterator<Duck> lit = ducks.listIterator();

		// wywo³anie p³ywania kaczek
		while (lit.hasNext()) {
			Duck duck = lit.next();
			System.out.print(duck.getClass().getSimpleName() + " - ");
			duck.swim();
		}
		System.out.print("\n");

		// wywo³anie latania kaczek z iteracj¹ wstecz
		while (lit.hasPrevious()) {
			Duck duck = lit.previous();
			System.out.print(duck.getClass().getSimpleName() + " - ");
			duck.performFly();
		}
		System.out.print("\n");

		// wywo³anie kwakania kaczek
		while (lit.hasNext()) {
			Duck duck = lit.next();
			System.out.print(duck.getClass().getSimpleName() + " - ");
			duck.performQuack();
		}
		System.out.print("\n");

		// zmiana zachowania kaczki w czasie dzia³anie programu
		for (Duck d : ducks) {
			if (d instanceof DuckPrototype) {
				System.out.println("Before change:");
				System.out.print(d.getClass().getSimpleName() + " - ");
				d.performFly();
				System.out.println("After change:");
				System.out.print(d.getClass().getSimpleName() + " - ");
				d.setFlyInterface(new RocketFlight());
				d.performFly();
			}
		}
	}
}

package be.pxl.ja.opgave2;

import java.util.Arrays;
import java.util.List;

public class BoontaEveClassic {

	public static void main(String[] args) throws InterruptedException {
		Podrace race = new Podrace("Boonta Eve Classic", 10000);
		List<Podracer> racers = Arrays.asList(
				new Podracer("Anakin Skywalker", race),
				new Podracer("Aldar Beedo", race),
				new Podracer("Neva Kee", race),
				new Podracer("Sebulba", race),
				new Podracer("Ody Mandrell", race),
				new Podracer("Ark Roose", race),
				new Podracer("Elan Mask", race));

		System.out.println("1-2-3...GO");
		// TODO: start all podracers
		// TODO: when all podracers are ready (finished or crashed), print the ranking
		System.out.println("Result for " + race.getName());
		// TODO: print the name of the drivers in the order they finished, use a stream
		System.out.println("Not finished");
		// TODO: print the name of the drivers that didn't finish (use a stream)

	}
}

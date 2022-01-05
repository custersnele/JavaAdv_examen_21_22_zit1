package be.pxl.ja.solution.opgave2;

import java.util.HashMap;
import java.util.Map;

public class Podrace implements Race<Podracer> {

	private Map<Podracer, Integer> racers = new HashMap<>();
	private double distance;
	private String name;
	private int nextFinisher = 1;

	public Podrace(String name, double distance) {
		this.name = name;
		this.distance = distance;
	}

	public void register(Podracer racer) {
		racers.put(racer, -1);
	}

	@Override
	public synchronized void finish(Podracer racer) {
		racers.put(racer, nextFinisher++);
	}

	@Override
	public double getDistance() {
		return distance;
	}


	public void printRanking() {
		System.out.println("Results for " + name);
		racers.entrySet().stream()
				.filter(e -> e.getValue() != -1)
				.sorted((e1, e2) -> e1.getValue() - e2.getValue())
				.forEach(e -> System.out.println(e.getValue() + ". " + e.getKey().getDriver()));
		System.out.println("Not finished");
		racers.entrySet().stream().filter(e -> e.getValue() == -1)
				.map(e -> e.getKey().getDriver())
				.forEach(System.out::println);
	}
}

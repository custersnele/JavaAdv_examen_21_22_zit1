package be.pxl.ja.solution.opgave2;

import java.util.HashMap;
import java.util.Map;

public class Podrace implements Race<Podracer> {
	private double distance;
	private String name;
	private int nextFinisher = 1;

	public Podrace(String name, double distance) {
		this.name = name;
		this.distance = distance;
	}

	public String getName() {
		return name;
	}

	@Override
	public synchronized void finish(Podracer racer) {
		racer.setPosition(nextFinisher++);
	}

	@Override
	public double getDistance() {
		return distance;
	}

}

package be.pxl.ja.opgave2;

public class Podrace {
	private String name;
	private double distance;

	public Podrace(String name, double distance) {
		this.name = name;
		this.distance = distance;
	}
	public String getName() {
		return name;
	}

	public double getDistance() {
		return distance;
	}
}

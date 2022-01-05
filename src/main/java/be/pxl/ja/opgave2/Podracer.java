package be.pxl.ja.opgave2;

import java.util.Random;

public class Podracer {
	private static final Random RANDOM = new Random();
	private static final int MAX_SPEED = 900;
	private String driver;
	private Podrace race;

	public Podracer(String driver, Podrace race) {
		this.driver = driver;
		this.race = race;
	}

	public String getDriver() {
		return driver;
	}

}

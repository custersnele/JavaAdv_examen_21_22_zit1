package be.pxl.ja.solution.opgave2;

import java.util.Random;

public class Podracer extends Thread {
	private static final Random RANDOM = new Random();
	private static final int MAX_SPEED = 900;
	private String driver;
	private Podrace race;
	private int distanceRaced;
	private int position;

	public Podracer(String title, Podrace race) {
		this.driver = title;
		this.race = race;
	}

	public String getDriver() {
		return driver;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public int getPosition() {
		return position;
	}

	@Override
	public void run() {
		while (distanceRaced < race.getDistance()) {
			if (RANDOM.nextDouble() < 0.02) {
				throw new CrashException(this);
			}
			distanceRaced += (RANDOM.nextDouble() / 2 + 0.5) * MAX_SPEED;
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		race.finish(this);
	}

}

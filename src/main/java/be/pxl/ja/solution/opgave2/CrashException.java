package be.pxl.ja.solution.opgave2;

public class CrashException extends RuntimeException {

	public CrashException(Podracer podracer) {
		super(podracer.getDriver() + " crashed....");
	}
}

package be.pxl.ja.solution.opgave1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LocationTest {

	@Test
	public void testLocationWithDouble() {
		Location<Double> location = new Location<>("Hasselt", "Belgium", 50.93106, 5.33781);
		Assertions.assertEquals(location.getLatitude(), 50.93106);
		Assertions.assertEquals(location.getLongitude(), 5.33781);
	}

}

package be.pxl.ja.solution.opgave1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DmsCoordinateTest {

	@Test
	public void validDmsCoordinate() {
		DmsCoordinate dms = new DmsCoordinate("25°11'50.0\"N");
		assertEquals(25, dms.getDegree());
		assertEquals(11, dms.getMinute());
		assertEquals(50.0, dms.getSecond());
		assertEquals(Direction.NORTH, dms.getDirection());
	}

	@Test
	public void invalidDmsCoordinateThrowsInvalidDmsCoordinateException() {
		assertThrows(InvalidDmsCoordinateException.class, () -> new DmsCoordinate("25°11'50.0\"F"));
	}

	@Test
	public void getDecimalValueTest() {
		DmsCoordinate dms = new DmsCoordinate("25°11'51.09\"N");
		assertEquals(25.197525, dms.getDecimalValue());
	}
}

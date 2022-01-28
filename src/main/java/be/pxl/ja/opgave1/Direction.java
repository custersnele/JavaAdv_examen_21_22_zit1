package be.pxl.ja.opgave1;

public enum Direction {
	WEST,
	SOUTH,
	NORTH,
	EAST;

	public static Direction fromCharacter(char letter) {
		// The following switch only works in java 14 and later.
		// IntelliJ can help you to fix it if you use an older version.
		return switch (letter) {
			case 'W' -> WEST;
			case 'S' -> SOUTH;
			case 'N' -> NORTH;
			case 'E' -> EAST;
			default -> throw new IllegalArgumentException("Unexpected value: " + letter);
		};
	}

}

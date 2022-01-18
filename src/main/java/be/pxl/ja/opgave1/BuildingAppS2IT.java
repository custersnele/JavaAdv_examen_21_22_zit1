package be.pxl.ja.opgave1;

import java.util.List;

public class BuildingAppS2IT {

	private List<Building> buildings;

	public BuildingAppS2IT() {
		// TODO: read data from file buildings.csv and assign to buildings
	}

	// 1. Geef het aantal buildings in totaal
	public long solution1() {
		// TODO
		throw new UnsupportedOperationException();
	}

	// 2. Geef het aantal buildings van vóór het jaar 1970 (1970 excl.)
	public long solution2() {
		// TODO
		throw new UnsupportedOperationException();
	}

	// 3. Geef de naam van de hoogste building
	public String solution3() {
		// TODO
		throw new UnsupportedOperationException();
	}

	// 4. Hoeveel van de buildings worden gebruikt als hotel?
	public long solution4() {
		return buildings.stream().filter(b -> b.getUsage().contains("hotel"))
				.count();
		// TODO
		// throw new UnsupportedOperationException();
	}

	// 5. Geef een tekst met de verschillende landen van de buildings: geen dubbels, alfabetisch gesorteerd en gescheiden met een komma.
	public String solution5() {
		// TODO
		throw new UnsupportedOperationException();
	}

	// 6. Geef een lijst van de 5 recenst opgetrokken buildings.
	public List<Building> solution6() {
		// TODO
		throw new UnsupportedOperationException();
	}

	// 7. Geef een lijst van alle buildings met type SKYSCRAPER van het jaar 2000. Sorteer de buildings alfabetisch (A -> Z) op city.
	public List<Building> solution7() {
		// TODO
		throw new UnsupportedOperationException();
	}

	// 8. Geef de naam van de stad met het meeste buildings in de lijst
	public String solution8() {
		// TODO
		throw new UnsupportedOperationException();
	}

}

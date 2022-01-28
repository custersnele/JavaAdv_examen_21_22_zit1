package be.pxl.ja.solution.opgave1;

import java.nio.file.Path;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class BuildingApp {

	private List<Building> buildings;

	public static void main(String[] args) {
		BuildingApp buildingApp = new BuildingApp();
	}

	public BuildingApp() {
		// TODO: read data from file buildings.csv and assign to buildings
		buildings = BuildingsReader.loadBuildings(Path.of("src/main/resources/buildings.csv"));
	}

	// 1. Geef het aantal buildings in totaal
	public long solution1() {
		return buildings.size();
		// TODO
		//throw new UnsupportedOperationException();
	}

	// 2. Geef het aantal buildings van vóór het jaar 1970 (1970 excl.)
	public long solution2() {
		return buildings.stream().filter(b -> b.getYear() < 1970).count();
		// TODO
		//throw new UnsupportedOperationException();
	}

	// 3. Geef de naam van de hoogste building
	public String solution3() {
		return buildings.stream()
				.max((b1, b2) -> Double.compare(b1.getHeight(), b2.getHeight()))
				.map(Building::getName).get();
		// TODO
		//throw new UnsupportedOperationException();
	}

	// 4. Hoeveel van de buildings worden gebruikt als hotel?
	public long solution4() {
		return buildings.stream().filter(b -> b.getUsage().contains("restaurant"))
				.peek(s -> System.out.println(s))
				.count();
		// TODO
		// throw new UnsupportedOperationException();
	}

	// 5. Geef een tekst met de verschillende landen van de buildings: geen dubbels, alfabetisch gesorteerd en gescheiden met een komma.
	public String solution5() {
		return buildings.stream().map(b -> b.getLocation().getCountry())
				.distinct()
				.sorted()
				.collect(Collectors.joining(","));
		// TODO
		//throw new UnsupportedOperationException();
	}

	// 6. Geef een lijst van de 5 recenste opgetrokken buildings.
	public List<Building> solution6() {
		return buildings.stream().sorted((s1, s2) -> s2.getYear() - s1.getYear())
				.limit(5)
				.collect(Collectors.toList());
		// TODO
		//throw new UnsupportedOperationException();
	}

	// 7. Geef een lijst van alle buildings met type SKYSCRAPER van het jaar 2000. Sorteer de buildings alfabetisch (A -> Z) op city.
	public List<Building> solution7() {
		return buildings.stream().filter(s -> s.getType() == BuildingType.SKYSCRAPER)
				.filter(s -> s.getYear() == 2000)
				.sorted((s1, s2) -> s1.getLocation().getCity().compareTo(s2.getLocation().getCity()))
				.collect(Collectors.toList());
		// TODO
		//throw new UnsupportedOperationException();
	}

	// 8. Geef de naam van de stad met het meeste buildings in de lijst
	public String solution8() {
		Map<String, Long> cityCount = new HashMap<>();
		buildings.stream().map(b -> b.getLocation().getCity())
				.distinct()
				.forEach(c -> cityCount.put(c, buildings.stream().filter(b -> b.getLocation().getCity().equals(c)).count()));
		return cityCount.entrySet().stream().max((e1, e2) -> Long.compare(e1.getValue(), e2.getValue()))
				.map(Map.Entry::getKey)
				.get();
		// TODO
		//throw new UnsupportedOperationException();
	}

}

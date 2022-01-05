package be.pxl.ja.solution.opgave1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class BuildingAppTest {

	private BuildingApp buildingApp;

	@BeforeEach
	void setUp() {
		buildingApp = new BuildingApp();
	}

	@Test
	void solution1() {
		assertEquals(68, buildingApp.solution1());
	}

	@Test
	void solution2() {
		assertEquals(5, buildingApp.solution2());
	}

	@Test
	void solution3() {
		assertEquals("Burj Khalifa", buildingApp.solution3());
	}

	@Test
	void solution4() {
		assertEquals(9, buildingApp.solution4());
	}

	@Test
	void solution5() {
		assertEquals("Canada,China,Germany,Iran,Japan,Kazakhstan,Kuwait,Latvia,Malaysia,Romania,Russia,Saudi Arabia,Slovenia,South Korea,Spain,Sri Lanka,Taiwan,Ukraine,United Arab Emirates,United States,Uzbekistan", buildingApp.solution5());
	}

	@Test
	void solution6() {
		List<Building> actual = buildingApp.solution6();
		assertEquals(5, actual.size());
		List<String> validBuildings = Arrays.asList("Goldin Finance 117", "Haeundae LCT The Sharp Landmark Tower", "Colombo Lotus Tower", "Ping An International Finance Center", "Lotte World Tower");
		for (Building structure : actual) {
			assertTrue(validBuildings.contains(structure.getName()));
		}
	}

	@Test
	void solution7() {
		List<Building> actual = buildingApp.solution7();
		assertEquals(2, actual.size());
		assertEquals("Dubai", actual.get(0).getLocation().getCity());
		assertEquals("Shenzhen", actual.get(1).getLocation().getCity());
	}

	@Test
	void solution8() {
		assertEquals("New York City", buildingApp.solution8());
	}


}

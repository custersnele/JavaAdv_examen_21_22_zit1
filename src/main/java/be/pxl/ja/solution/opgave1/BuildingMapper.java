package be.pxl.ja.solution.opgave1;

import java.util.Arrays;
import java.util.stream.Collectors;

public class BuildingMapper {

	public static Building mapDataToBuilding(String[] data) {
		Building structure = new Building();
		structure.setName(data[0]);
		structure.setHeight(Double.parseDouble(data[1]));
		structure.setYear(Integer.parseInt(data[2]));
		structure.setType(toStructureType(data[3]));
		structure.setUsage(Arrays.stream(data[4].split(",")).map(s -> s.trim().toLowerCase()).collect(Collectors.toList()));
		structure.setRemarks(data[7]);
		String[] coordinates = data[8].split(" ");
		structure.setLocation(getLocationMapper().mapLocation(data[6], data[5], coordinates[0], coordinates[1]));
		return structure;
	}

	private static LocationMapper<DmsCoordinate> getLocationMapper() {
		return (city, country, lat, lon) -> new Location<>(city, country, new DmsCoordinate(lat), new DmsCoordinate(lon));
	}

	private static BuildingType toStructureType(String value) {
		return BuildingType.valueOf(value.replaceAll(" ", "_").replaceAll("/", "_").toUpperCase());
	}

}

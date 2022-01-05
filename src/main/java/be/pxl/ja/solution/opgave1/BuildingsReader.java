package be.pxl.ja.solution.opgave1;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class BuildingsReader {

	public static List<Building> loadBuildings(Path path) {
		List<Building> buildings = new ArrayList<>();
		try (BufferedReader reader = Files.newBufferedReader(path)) {
			String line;
			reader.readLine(); // skip first line
			while ( (line = reader.readLine()) != null) {
				String[] data = line.split(";");
				buildings.add(BuildingMapper.mapDataToBuilding(data));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return buildings;
	}

}

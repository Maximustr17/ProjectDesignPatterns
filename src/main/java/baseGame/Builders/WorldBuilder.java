package baseGame.Builders;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import baseGame.Helpers.FileHelper;
import baseGame.interfaces.IElement;

public class WorldBuilder {

	public static IElement[][] BuildWorld(String mapPath) {
		deserializeMap(LoadMap(mapPath));

		return null;
	}

	private static String[][] deserializeMap(String rawMap) {
		TypeReference<String[][]> typeRef = new TypeReference<String[][]>() {
		};
		ObjectMapper mapper = new ObjectMapper();
		String[][] map = null;
		try {
			map = mapper.readValue(rawMap, typeRef);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return map;
	}

	private static String LoadMap(String mapPath) {
		return new FileHelper().getFileWithUtil(mapPath);
	}

}

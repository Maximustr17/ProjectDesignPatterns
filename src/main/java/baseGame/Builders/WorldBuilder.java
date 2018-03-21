package baseGame.Builders;

import com.fasterxml.jackson.core.type.TypeReference;

import baseGame.Enums.BeanEnum;
import baseGame.Helpers.FileHelper;
import baseGame.Helpers.Serializer;
import baseGame.beans.GroundTerrain;
import baseGame.beans.HeroCharacter;
import baseGame.beans.HospitalBuilding;
import baseGame.beans.WallTerrain;
import baseGame.interfaces.IElement;

public class WorldBuilder {

	public static IElement[][] BuildWorld(String mapPath) {
		String[][] rawElements = deserializeMap(LoadMap(mapPath));
		int longOfTheMap = rawElements[0].length;
		int hightOfTheMap = rawElements.length;
		IElement[][] map = new IElement[rawElements.length][rawElements[0].length];
		for (int i = 0; i < hightOfTheMap; i++) {
			for (int j = 0; j < longOfTheMap; j++) {
				map[i][j] = BuildElement(rawElements[i][j]);
			}
		}
		return map;
	}

	private static IElement BuildElement(String rawElement) {
		switch (BeanEnum.GetEnum(rawElement.toUpperCase())) {
		case WALL_TERRAIN:
			return new WallTerrain();
		case GROUND_TERRAIN:
			return new GroundTerrain();
		case HOSPITAL_BUILDING:
			return new HospitalBuilding();
		case HERO_CHARACTER:
			return new HeroCharacter();
		default:
			return null;
		}
	}

	private static String[][] deserializeMap(String rawMap) {
		TypeReference<String[][]> typeRef = new TypeReference<String[][]>() {
		};
		return Serializer.Desserialize(typeRef, rawMap);
	}

	private static String LoadMap(String mapPath) {
		return new FileHelper().getFileWithUtil(mapPath);
	}
}

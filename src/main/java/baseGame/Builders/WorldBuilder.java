package baseGame.Builders;

import com.fasterxml.jackson.core.type.TypeReference;

import baseGame.Enums.Element;
import baseGame.Helpers.FileHelper;
import baseGame.Helpers.Serializer;
import baseGame.beans.Ground;
import baseGame.beans.Hospital;
import baseGame.beans.PersonajeHeroe;
import baseGame.beans.Wall;
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
		switch (Element.GetEnum(rawElement.toUpperCase())) {
		case Wall:
			return new Wall();
		case Ground:
			return new Ground();
		case Hospital:
			return new Hospital();
		case PersonajePrincipal:
			return new PersonajeHeroe();
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

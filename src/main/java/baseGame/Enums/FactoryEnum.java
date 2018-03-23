package baseGame.Enums;

import java.util.HashMap;
import java.util.Map;

public enum FactoryEnum {
	BUILDING_FACTORY("building_factory"), TERRAIN_FACTORY("terrain_factory"), CHARACTER_FACTORY(
			"character_factory"), ITEM_FACTORY("item_factory"), HABILITY_FACTORY(
					"hability_factory"), RACE_FACTORY("race_factory"), WORLD_FACTORY("world_factory");

	private static Map<String, FactoryEnum> map = new HashMap<String, FactoryEnum>();

	static {
		for (FactoryEnum elemEnum : FactoryEnum.values()) {
			map.put(elemEnum.ElementName, elemEnum);
		}
	}

	private String ElementName;

	private FactoryEnum(String pElementNumber) {
		this.ElementName = pElementNumber;
	}

	public static FactoryEnum GetEnum(String pElementName) {
		return map.get(pElementName) != null ? map.get(pElementName) : map.get("0");
	}

	@Override
	public String toString() {
		return map.entrySet().stream().filter(s -> s.getKey().equalsIgnoreCase(ElementName)).findFirst().get().getKey();
	}
}

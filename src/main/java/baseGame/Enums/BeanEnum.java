package baseGame.Enums;

import java.util.HashMap;
import java.util.Map;

public enum BeanEnum {
	HOSPITAL_BUILDING("H"), GROUND_TERRAIN("0"), WALL_TERRAIN("X"), NEUTRAL_CHARACTER("N"), ENEMY_CHARACTER(
			"E"), HERO_CHARACTER("U"), HEALTH_ITEM(
					"i"), STEALTH_HABILITY("stealth_hability"), STEALTH_RACE("stealth_race");

	private static Map<String, BeanEnum> map = new HashMap<String, BeanEnum>();

	static {
		for (BeanEnum elemEnum : BeanEnum.values()) {
			map.put(elemEnum.ElementName, elemEnum);
		}
	}

	private String ElementName;

	private BeanEnum(String pElementNumber) {
		this.ElementName = pElementNumber;
	}

	public static BeanEnum GetEnum(String pElementName) {
		return map.get(pElementName) != null ? map.get(pElementName) : map.get("0");
	}

	@Override
	public String toString() {
		return map.entrySet().stream().filter(s -> s.getKey().equalsIgnoreCase(ElementName)).findFirst().get().getKey();
	}
}

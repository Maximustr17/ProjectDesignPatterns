package baseGame.Enums;

import java.util.HashMap;
import java.util.Map;

public enum WorldEnum {
	WORLD_ONE("world_one");

	private static Map<String, WorldEnum> map = new HashMap<String, WorldEnum>();

	static {
		for (WorldEnum elemEnum : WorldEnum.values()) {
			map.put(elemEnum.ElementName, elemEnum);
		}
	}

	private String ElementName;

	private WorldEnum(String pElementNumber) {
		this.ElementName = pElementNumber;
	}

	public static WorldEnum GetEnum(String pElementName) {
		return map.get(pElementName) != null ? map.get(pElementName) : map.get("0");
	}

	@Override
	public String toString() {
		return map.entrySet().stream().filter(s -> s.getKey().equalsIgnoreCase(ElementName)).findFirst().get().getKey();
	}
}

package baseGame.Enums;

import java.util.HashMap;
import java.util.Map;

public enum MissionEnum {
	MISSION_ONE("mission_1");

	private static Map<String, MissionEnum> map = new HashMap<String, MissionEnum>();

	static {
		for (MissionEnum elemEnum : MissionEnum.values()) {
			map.put(elemEnum.ElementName, elemEnum);
		}
	}

	private String ElementName;

	private MissionEnum(String pElementNumber) {
		this.ElementName = pElementNumber;
	}

	public static MissionEnum GetEnum(String pElementName) {
		return map.get(pElementName) != null ? map.get(pElementName) : map.get("0");
	}

	@Override
	public String toString() {
		return map.entrySet().stream().filter(s -> s.getKey().equalsIgnoreCase(ElementName)).findFirst().get().getKey();
	}
}

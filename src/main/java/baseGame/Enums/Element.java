package baseGame.Enums;

import java.util.HashMap;
import java.util.Map;

public enum Element {
	Hospital("H"), Ground("0"), Wall("X");

	private static Map<String, Element> map = new HashMap<String, Element>();

	static {
		for (Element elemEnum : Element.values()) {
			map.put(elemEnum.ElementNumber, elemEnum);
		}
	}

	private String ElementNumber;

	private Element(String pElementNumber) {
		this.ElementNumber = pElementNumber;
	}

	public static Element GetEnum(String pElementNumber) {
		return map.get(pElementNumber) != null ? map.get(pElementNumber) : map.get("0");
	}
}

package baseGame.Enums;

import java.util.HashMap;
import java.util.Map;

public enum Element {
	Hospital("H"), Ground("0"), Wall("X"), PersonajeNeutral("N"), PersonajeEnemigo("E");

	private static Map<String, Element> map = new HashMap<String, Element>();

	static {
		for (Element elemEnum : Element.values()) {
			map.put(elemEnum.ElementName, elemEnum);
		}
	}

	private String ElementName;

	private Element(String pElementNumber) {
		this.ElementName = pElementNumber;
	}

	public static Element GetEnum(String pElementName) {
		return map.get(pElementName) != null ? map.get(pElementName) : map.get("0");
	}

	@Override
	public String toString() {
		return map.entrySet().stream().filter(s -> s.getKey().equalsIgnoreCase(ElementName)).findFirst().get().getKey();
	}
}

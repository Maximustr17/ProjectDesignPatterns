package baseGame.Enums;

import java.util.HashMap;
import java.util.Map;

public enum MapEnum {
    GROUND_TERRAIN("  "),
    WALL_TERRAIN("||"),
    NEO_CHARACTER("N"),
    DOGGO_CHARACTER("D"),
    CATZURA_CHARACTER("C"),
    HEALTH_ITEM("H"),
    MERCHANT_BUILDING("M");

    private static Map<String, MapEnum> map = new HashMap<String, MapEnum>();

    static {
        for (MapEnum elemEnum : MapEnum.values()) {
            map.put(elemEnum.ElementName, elemEnum);
        }
    }

    private String ElementName;

    MapEnum(String pElementNumber) {
        this.ElementName = pElementNumber;
    }

    public static MapEnum GetEnum(String pElementName) {
        return map.get(pElementName) != null ? map.get(pElementName) : map.get("0");
    }

    @Override
    public String toString() {
        return map.entrySet().stream().filter(s -> s.getKey().equalsIgnoreCase(ElementName)).findFirst().get().getKey();
    }
}

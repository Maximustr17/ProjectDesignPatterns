package baseGame.Helpers;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Serializer {

	public static <T> T Desserialize(TypeReference<?> typeRef, String rawString) {
		ObjectMapper mapper = new ObjectMapper();
		T result = null;
		try {
			result = mapper.readValue(rawString, typeRef);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
}

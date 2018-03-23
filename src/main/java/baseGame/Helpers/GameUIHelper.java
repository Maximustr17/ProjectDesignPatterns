package baseGame.Helpers;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class GameUIHelper {
	
	 private static GameUIHelper instance = null;
	   private GameUIHelper() {
	      // Exists only to defeat instantiation.
	   }
	   public static GameUIHelper getInstance() {
	      if(instance == null) {
	         instance = new GameUIHelper();
	      }
	      return instance;
	   }

	public String getFile(String fileName) {

		StringBuilder result = new StringBuilder("");

		//Get file from resources folder
		ClassLoader classLoader = getClass().getClassLoader();
		File file = new File(classLoader.getResource(fileName).getFile());

		try (Scanner scanner = new Scanner(file)) {

			while (scanner.hasNextLine()) {
				String line = scanner.nextLine();
				result.append(line).append("\n");
			}

			scanner.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
			
		return result.toString();

	  }
}

package baseGame.Helpers;

import org.apache.commons.io.IOUtils;

public class FileHelper {

    public String getFileWithUtil(String fileName) {

        String result = "";

        ClassLoader classLoader = getClass().getClassLoader();
        try {
            result = IOUtils.toString(classLoader.getResourceAsStream(fileName));
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }
}

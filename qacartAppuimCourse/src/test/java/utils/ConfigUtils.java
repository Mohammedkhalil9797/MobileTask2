package utils;

import java.io.*;
import java.util.Properties;

public class ConfigUtils {
    private Properties properties;
    public static ConfigUtils configUtils;

    public static ConfigUtils getInstance() {
        if (configUtils == null) {
            configUtils = new ConfigUtils();
        }
        return configUtils;
    }

    public String getAUTOMATION_NAME() {
        String prop = properties.getProperty("AUTOMATION_NAME");
        if (prop != null)
            return prop;
        throw new RuntimeException("could not find url in file");
    }
    public String getPLATFORM_NAME() {
        String prop = properties.getProperty("PLATFORM_NAME");
        if (prop != null)
            return prop;
        throw new RuntimeException("could not find url in file");
    }

    public String getUDID() {
        String prop = properties.getProperty("UDID");
        if (prop != null)
            return prop;
        throw new RuntimeException("could not find email in file");
    }

    public String getAPP_PACKAGE() {
        String prop = properties.getProperty("APP_PACKAGE");
        if (prop != null)
            return prop;
        throw new RuntimeException("could not find pass in file");
    }

    public String getAPP_ACTIVITY() {
        properties = loadProperties("src/main/resources/productions.properties");
        String prop = properties.getProperty("APP_ACTIVITY");
        if (prop != null)
            return prop;
        throw new RuntimeException("could not find pass in file");
    }



    public static Properties loadProperties(String filePath) {
        File file = new File(filePath);

        try {
            InputStream inputStream = new FileInputStream(file);
            Properties properties = new Properties();
            properties.load(inputStream);
            inputStream.close();
            return properties;
        } catch (FileNotFoundException e) {
            throw new RuntimeException("File is Not Found");
        } catch (IOException e) {
            throw new RuntimeException("Error while loading properties");
        }
    }
}

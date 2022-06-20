package config;

import constants.TestConstants;
import logger.TestLogger;
import property.PropertyUtil;

import java.io.File;
import java.util.Properties;

import static constants.TestConstants.DIRECTORY_ENV_CONFIG;
import static constants.TestConstants.USER_DIR;

/**
 * Singleton Design Pattern is implemented here
 */
public class ConfigLoader {

    private Properties properties = new Properties();

    private static ConfigLoader configLoader;

    private ConfigLoader() {



        File directoryPath = new File(TestConstants.RESOURCE_PATH);

        File[] filesList = directoryPath.listFiles();

        for(File file : filesList) {
            PropertyUtil.propertyLoader(properties,TestConstants.RESOURCE_PATH + file.getName());
        }
    }

    public static ConfigLoader getInstance() {
        if (configLoader == null) {
            configLoader = new ConfigLoader();
        }
        return configLoader;
    }


    public String get(String propertyKey) {
        String prop = properties.getProperty(propertyKey);
        if (prop != null) {
            return prop.trim();
        } else {
            throw new RuntimeException("Property " + propertyKey + " is not specified in the config.properties file");
        }
    }


}

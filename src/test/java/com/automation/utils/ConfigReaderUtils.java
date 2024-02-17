package com.automation.utils;

import java.io.FileInputStream;
import java.io.FileReader;
import java.util.Properties;

public class ConfigReaderUtils {

    private static Properties prop;
    private static String configFilePath = "/src/test/resources/config/config.properties";

    public static void initConfig() {
        try {
            prop = new Properties();
            prop.load(new FileInputStream(System.getProperty("user.dir") + configFilePath));
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
    }

    public static String getProperty(String key) {
        return prop.getProperty(key);
    }
}

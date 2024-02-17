package com.automation.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HelperUtils {

    public static String readDataFromFile(String filePath) {
        File file = new File(filePath);
        String content = null;
        try {
            content = new Scanner(file).useDelimiter("\\Z").next();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return content;
    }
}

package com.codewithazam.com.codewithazam.review11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptionDemo {
    public static void main(String[] args) {
        String projectPath = System.getProperty("user.dir");
        String filePath = projectPath + "/extra/demo.properties";

        String[] pathArray = {"path1", "path2", filePath};

        for (int i = 0; i < pathArray.length; i++) {
            try {
                FileInputStream fis = new FileInputStream(pathArray[i]);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Happy ending!!!");
    }
}

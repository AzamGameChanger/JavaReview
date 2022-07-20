package com.codewithazam.com.codewithazam.review10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {
    public static void main(String[] args) throws IOException {
        String projectPath = System.getProperty("user.dir");
        String filePath = projectPath + "/extra/demo.properties";


        FileInputStream fileIS = new FileInputStream(filePath);
        Properties prop = new Properties();
        prop.load(fileIS);
        System.out.println(prop);

        // 1st way
        Object lastName =  prop.get("LastName");
        System.out.println(lastName);

        // 2nd way, the correct way
        String firstName = prop.getProperty("FirstName");
        System.out.println(firstName);

        // Add more key/value pairs
        prop.setProperty("StudentNumber","A123");
        System.out.println(prop);

        // OR I can re-assign the value
        prop.setProperty("Age","25");
        System.out.println(prop);

        // Now let us save into a new file
        String newPath = projectPath + "/extra/NewFile.txt";
        FileOutputStream fos = new FileOutputStream(newPath);

        prop.store(fos,"Cali asked for the comment");



    }
}

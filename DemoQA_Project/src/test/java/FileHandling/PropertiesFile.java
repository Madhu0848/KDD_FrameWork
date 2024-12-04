package FileHandling;

import java.io.*;
import java.util.Properties;

public class PropertiesFile {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\Qapitol QA\\IdeaProjects\\DemoQA_Project\\src\\main\\Repository\\config.properties");

        if (!file.exists()) {
            file.createNewFile(); // Creates the file
            System.out.println("File created: " + file.getAbsolutePath());
        }
        /* Writting the data from Properties file */
        // Create a new Properties object and add default key-value pairs
        Properties pro = new Properties();

        pro.setProperty("username", "admin");
        pro.setProperty("password", "12345");
        pro.setProperty("url", "https://example.com");
        pro.setProperty("address", "blr");

        FileOutputStream fos = new FileOutputStream(file);
        pro.store(fos, "all data fixed");
        fos.close();

        /* Reading the data from Properties File */
        FileInputStream fis = new FileInputStream(file);
        pro.load(fis);
        // Step 4: Retrieve a single property value
        System.out.println("Single Value:");
        System.out.println("username = " + pro.getProperty("username"));
        fis.close();

        // Step 5: Retrieve and print all properties
        System.out.println("\nAll Properties:");
        for (String key : pro.stringPropertyNames()) {
            System.out.println(key + " = " + pro.getProperty(key));

        }

    }
}

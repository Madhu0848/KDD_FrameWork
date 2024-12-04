package FileHandling;

import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class JSONFile {

    public static void main(String[] args) throws IOException {

        /*WRITE THE FROM JSON FILE*/

        File file = new File("C:\\Users\\Qapitol QA\\IdeaProjects\\DemoQA_Project\\src\\main\\Repository\\FileJson.json");

        // Check if the file exists, and create it if it doesn't
        if (!file.exists()) {
            file.createNewFile(); // Creates the file
            System.out.println("File created: " + file.getAbsolutePath());
        }
        Map<String, Object> jsonData = new HashMap();
        jsonData.put("name", "madhu");
        jsonData.put("age", "27");
        jsonData.put("address", "blr");

        ObjectMapper mapper = new ObjectMapper();
        //  mapper.writeValue(file,map);
        mapper.writerWithDefaultPrettyPrinter().writeValue(file, jsonData);

        System.out.println("Formatted JSON data written to file successfully!");



        /*READ THE DATA FROM JSON FILE */
        File file1 = new File("C:\\Users\\Qapitol QA\\IdeaProjects\\DemoQA_Project\\src\\main\\Repository\\FileJson.json");

        // Create ObjectMapper
        ObjectMapper mapper1 = new ObjectMapper();

        // Read JSON data from the file and assign it to a Map
        Map<String, Object> jsonData1 = mapper1.readValue(file1, Map.class);

        // Convert the map back to a formatted JSON string
        String formattedJson = mapper1.writerWithDefaultPrettyPrinter().writeValueAsString(jsonData);

        // Print the formatted JSON to the console
        System.out.println("Read JSON data in formatted JSON format:");
        System.out.println(formattedJson);

        // Access individual values from the map
        System.out.println("Name: " + jsonData1.get("name"));
        System.out.println("Age: " + jsonData1.get("age"));
        System.out.println("Address: " + jsonData1.get("address"));
    }
}


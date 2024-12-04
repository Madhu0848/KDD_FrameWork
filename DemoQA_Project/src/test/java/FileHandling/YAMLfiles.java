package FileHandling;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class YAMLfiles {
    public static void main(String[] args) throws IOException {

        File file = new File("C:\\Users\\Qapitol QA\\IdeaProjects\\DemoQA_Project\\src\\main\\Repository\\yamlFile.yaml");

        if(!file.exists()){
            file.createNewFile();
            System.out.println("Creating new file"+file.getAbsolutePath());
        }
        Map<String ,Object> yamlData= new HashMap();
        yamlData.put("id","1");
        yamlData.put("name","neha");
        yamlData.put("age",23);
        yamlData.put("gender","female");
        yamlData.put("address","blr");

        ObjectMapper mapperObj = new ObjectMapper(new YAMLFactory());
        //mapperObj.writeValue(file,yamlData);
        mapperObj.writerWithDefaultPrettyPrinter().writeValue(file, yamlData);

        /* Reading The Data From YAML */
        Map<String, Object> yamlData1 = mapperObj.readValue(file, Map.class);

        // Convert the map back to a formatted yml string
        String formattedJson = mapperObj.writerWithDefaultPrettyPrinter().writeValueAsString(yamlData1);
        System.out.println(formattedJson);
        System.out.println("Name: " + yamlData1.get("name"));
        System.out.println("Age: " + yamlData1.get("age"));
        System.out.println("Address: " + yamlData1.get("address"));


    }
}

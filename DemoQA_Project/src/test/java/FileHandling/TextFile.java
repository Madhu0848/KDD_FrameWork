package FileHandling;

import java.io.*;

public class TextFile {

    public static void main(String[] args) throws IOException {
        String fileNmae = "Temp.txt";
        File file = new File("C:\\Users\\Qapitol QA\\IdeaProjects\\DemoQA_Project\\src\\main\\Repository\\"+fileNmae);

        if(!file.exists()) {
            file.createNewFile();
        }
        /* Writting data from text file */
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            bw.write("Hello World");
            bw.newLine();
            bw.write("hello world");
            bw.close();

        /* Reading  data from text file */

       // FileOutputStream fos = new FileOutputStream(file);
        BufferedReader br = new BufferedReader(new FileReader(file));
        String data ;
        while((data = br.readLine()) != null) {
            System.out.println(data);

        }
      br.close();
        //System.out.println(data);

    }
}

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.lang.StringBuilder;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.io.File;

public class Utils {
    public static String readContentFromFile(String path) throws IOException{
        BufferedReader reader = new BufferedReader(new FileReader (path));
        String line = null;
        StringBuilder stringBuilder = new StringBuilder();
        String ls = System.getProperty("line.separator");

    try {
        while((line = reader.readLine()) != null) {
            stringBuilder.append(line);
            stringBuilder.append(ls);
        }

        return stringBuilder.toString();
    } finally {
        reader.close();
        }
    }

    public static void writeContentToFile(String path) throws IOException{
        try (var fr = new FileWriter(path, StandardCharsets.UTF_8)) {
            fr.write("Today is Friday");
        }
    }

    public static void updateContentToFile(String path) throws IOException{
        try (var fr = new FileWriter(path, StandardCharsets.UTF_8, true)) {
            fr.write("Tomorrow will be cloudy.");
        }
    }

    public static File findFileByName(String folderPath, String fileName) throws IOException{
        File folder = new File(folderPath);
        if (folder.isDirectory()) {
         File[] listOfFiles = folder.listFiles();
         if (listOfFiles.length < 1)System.out.println(
            "There is no File inside Folder");
         else System.out.println("List of Files & Folder");
         for (File file : listOfFiles) {
            if(!file.isDirectory()){
                if(file.getName().isEqual(fileName)){
                    System.out.println(file.getName()+ '\N');
                }
            }
         } 
      } 
      else System.out .println("There is no Folder @ given path :" + folderPath);
    }
}
import java.util.List;
import java.nio.file.Files;
import java.io.IOException;

public class Week10 {
    List<String> getAllFunctions(File path) throws IOException{
        List<String> result = new ArrayList<String>(); 
        List<String> lines = Files.readAllLines(path, encoding);
        for(int i = 0 ; i < lines.size(); i++){
            String line = lines.get(i);
            int index = line.indexOf('static')
            if(index != -1){
                result.add(line);
            }
        }
        return result;
    }

    public String findFunctionByName(String name) throws IOException{
        //todo
    }

}

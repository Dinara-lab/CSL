package sample;
//simple test class, just for personal purposes
import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test {


    public static void main(String[] args) throws FileNotFoundException {
        String path = "/Users/buciladinara/Desktop/audit/SecurityPoliciesProject/src/sample/file.json";
        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
        Gson gson = new Gson();
        HashMap<String, HashMap> json = gson.fromJson(bufferedReader, HashMap.class);
        Map<String, HashMap> map = json;

        Set keys = map.keySet();
        for (Object key: keys) {
           Map<String, String> object = map.get(key);
            System.out.println(object);
        }


    }
}
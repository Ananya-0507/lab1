package SampleJSON.SampleJSON;

import java.io.FileReader;
import java.io.IOException;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadJSON {

    public static void main(String[] args) throws IOException, ParseException {

        JSONParser jsonParser = new JSONParser();

        FileReader reader = new FileReader(".\\JSON\\student.json");

        Object obj = jsonParser.parse(reader);

        JSONObject studentObj = (JSONObject) obj;

        String fname = (String) studentObj.get("firstname");
        String lname = (String) studentObj.get("lastname");

        System.out.println("Firstname: " + fname);
        System.out.println("Lastname: " + lname);
    }
}

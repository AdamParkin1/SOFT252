import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class SOFT252 {

    public static void main(String[] args) throws IOException, ParseException {
        
        //JSONObject patObj = patientToJSON(p);
        
        //try (FileWriter file = new FileWriter("jsonStores\\patients.txt")) {
        //    file.write(patObj.toJSONString());
        //    System.out.println("Successfully Copied JSON Object to File...");
        //    System.out.println("\nJSON Object: " + patObj);
        //}
        
        JSONParser parser = new JSONParser();
        
        Object obj = parser.parse(new FileReader("jsonStores\\patients.txt"));
        JSONObject userJSON = (JSONObject) obj;
        
        patient decodedPat = JSONToPatient(userJSON);
        
        System.out.println("Successfully Read JSON File to Object...");
        System.out.println(decodedPat.getName());
        System.out.println(decodedPat.getUserId());
        System.out.println(decodedPat.getAge());
    }
    
    private static JSONObject patientToJSON(patient inPat) {
        JSONObject obj = new JSONObject();

        obj.put("name", inPat.getName());
        obj.put("address", inPat.getAddress());
        obj.put("email", inPat.getEmail());
        obj.put("phoneNumber", inPat.getPhoneNumber());
        obj.put("userId", "p");
        obj.put("password", inPat.getPassword());
        obj.put("age", (int) inPat.getAge());
        obj.put("sex", inPat.getSex());
        return obj;
    }
    
    private static patient JSONToPatient(JSONObject inObj) {
        patient newPat = new patient();
        
        newPat.setName((String)inObj.get("name"));
        newPat.setAddress((String)inObj.get("address"));
        newPat.setEmail((String)inObj.get("email"));
        newPat.setPhoneNumber((String)inObj.get("phoneNumber"));
        newPat.setupUserId((String)inObj.get("userId"));
        newPat.setPassword((String)inObj.get("password"));
        newPat.setSex((String)inObj.get("sex"));
        
        newPat.setAge((int) (long) inObj.get("age"));
        
        return newPat;
    }
}

package source;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

import java.util.Arrays;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public final class Data {

    private static Data instance;

    public static Patient[] patients;
    public static Doctor[] doctors;
    public static Admin[] admins;
    public static Secretary[] secretaries;
    
    public static String activeID;

    private static int[] nextID;
    
    public static User[] requests;

    private Data() {

    }

    public static void setup() throws FileNotFoundException, IOException, ParseException {
        nextID = new int[4];   
        
        loadUsers();
        
        saveUsers();
        
        
        
        


    }
    
    private static Object[] appendList(Object[] arr1, Object[] arr2){
        
        int aLen = arr1.length;
        int bLen = arr2.length;
        
        Object[] result = new Object[aLen + bLen];
        
        System.arraycopy(arr1, 0, result, 0, aLen);
        System.arraycopy(arr2, 0, result, aLen, bLen);
        
        return result;
    }
    
    public static void saveUsers() throws IOException{

        
        BufferedWriter file = new BufferedWriter(new FileWriter("jsonStores\\admins.txt"));
        
        if (admins != null){
            for (int i = 0; i < admins.length; i++){       // save the admins
                if (admins[i] != null){
                JSONObject item = AdminToJSON(admins[i]);
                file.write(item.toJSONString()); 
                file.newLine();
                }
            }
        }
        
        file.close();
        
        file = new BufferedWriter(new FileWriter("jsonStores\\secretaries.txt"));
        
        if (secretaries != null){
            for (int i = 0; i < secretaries.length; i++){       // secondly the secretaries
                if (secretaries[i] != null){
                JSONObject item = SecretaryToJSON(secretaries[i]);
                file.write(item.toJSONString()); 
                }
            }
        }
        
        file.close();
        
        file = new BufferedWriter(new FileWriter("jsonStores\\doctors.txt"));
        
        if (doctors != null){
            for (int i = 0; i < doctors.length; i++){       // then the doctors
                if (doctors[i] != null){
                JSONObject item = DoctorToJSON(doctors[i]);
                file.write(item.toJSONString()); 
                }
            }
        }
        
        file.close();
        
        file = new BufferedWriter(new FileWriter("jsonStores\\patients.txt"));
        
        if (patients != null){
            for (int i = 0; i < patients.length; i++){       // lastly the patients
                if (patients[i] != null){
                JSONObject item = PatientToJSON(patients[i]);
                file.write(item.toJSONString()); 
                }
            }
        
        }
        file.close();
    }
    
    
    private static void loadUsers() throws FileNotFoundException, IOException, ParseException{
        
        
        JSONParser parser = new JSONParser();
        
        
        try (BufferedReader reader = new BufferedReader(new FileReader("jsonStores\\admins.txt"))) {
            String line;
            while ((line = reader.readLine()) != null){ // admins
              Object tempObj = parser.parse(line);
              if (tempObj == null){
                  break;
              }
              JSONObject userJSON = (JSONObject) tempObj; 

              Admin newAdmin = JSONToAdmin(userJSON);
              createAdmin(newAdmin);
            };
        }
        
        
        try (BufferedReader reader = new BufferedReader(new FileReader("jsonStores\\secretaries.txt"))) {
            String line;
            while ((line = reader.readLine()) != null){ // secretaries
              Object tempObj = parser.parse(line);
              if (tempObj == null){
                  break;
              }
              JSONObject userJSON = (JSONObject) tempObj; 

              Secretary newSec = JSONToSecretary(userJSON);
              createSecretary(newSec);
            };
        }
        
        try (BufferedReader reader = new BufferedReader(new FileReader("jsonStores\\doctors.txt"))) {
            String line;
            while ((line = reader.readLine()) != null){ // doctors
              Object tempObj = parser.parse(line);
              if (tempObj == null){
                  break;
              }
              JSONObject userJSON = (JSONObject) tempObj; 

              Doctor newDoc = JSONToDoctor(userJSON);
              createDoctor(newDoc);
            };
        }
        
        try (BufferedReader reader = new BufferedReader(new FileReader("jsonStores\\patients.txt"))) {
            String line;
            while ((line = reader.readLine()) != null){ // patients
              Object tempObj = parser.parse(line);
              if (tempObj == null){
                  break;
              }
              JSONObject userJSON = (JSONObject) tempObj; 

              Patient newPat = JSONToPatient(userJSON);
              createPatient(newPat);
            };
        }
        
        System.out.println("Successfully Read JSON File to Object...");
    }

    private static JSONObject AdminToJSON(Admin inObj) {
        JSONObject obj = new JSONObject();

        obj.put("name", inObj.getName());
        obj.put("address", inObj.getAddress());
        obj.put("email", inObj.getEmail());
        obj.put("phoneNumber", inObj.getPhoneNumber());
        obj.put("userId", inObj.getId());
        obj.put("password", inObj.getPassword());
        return obj;
    }
    
    private static JSONObject SecretaryToJSON(Secretary inObj) {
        JSONObject obj = new JSONObject();

        obj.put("name", inObj.getName());
        obj.put("address", inObj.getAddress());
        obj.put("email", inObj.getEmail());
        obj.put("phoneNumber", inObj.getPhoneNumber());
        obj.put("userId", inObj.getId());
        obj.put("password", inObj.getPassword());
        return obj;
    }
    
    private static JSONObject DoctorToJSON(Doctor inObj) {
        JSONObject obj = new JSONObject();

        obj.put("name", inObj.getName());
        obj.put("address", inObj.getAddress());
        obj.put("email", inObj.getEmail());
        obj.put("phoneNumber", inObj.getPhoneNumber());
        obj.put("userId", inObj.getId());
        obj.put("password", inObj.getPassword());
        return obj;
    }
    
    private static JSONObject PatientToJSON(Patient inObj) {
        JSONObject obj = new JSONObject();

        obj.put("name", inObj.getName());
        obj.put("address", inObj.getAddress());
        obj.put("email", inObj.getEmail());
        obj.put("phoneNumber", inObj.getPhoneNumber());
        obj.put("userId", inObj.getId());
        obj.put("password", inObj.getPassword());
        return obj;
    }
    
    private static Admin JSONToAdmin(JSONObject inObj) {
        Admin newUser = new Admin();
        
        newUser.setName((String)inObj.get("name"));
        newUser.setAddress((String)inObj.get("address"));
        newUser.setEmail((String)inObj.get("email"));
        newUser.setPhoneNumber((String)inObj.get("phoneNumber"));
        newUser.setId((String)inObj.get("userId"));
        newUser.setPassword((String)inObj.get("password"));
        
        return newUser;
    }
    
    private static Secretary JSONToSecretary(JSONObject inObj) {
        Secretary newUser = new Secretary();
        
        newUser.setName((String)inObj.get("name"));
        newUser.setAddress((String)inObj.get("address"));
        newUser.setEmail((String)inObj.get("email"));
        newUser.setPhoneNumber((String)inObj.get("phoneNumber"));
        newUser.setId((String)inObj.get("userId"));
        newUser.setPassword((String)inObj.get("password"));
        
        return newUser;
    }
    
    private static Doctor JSONToDoctor(JSONObject inObj) {
        Doctor newUser = new Doctor();
        
        newUser.setName((String)inObj.get("name"));
        newUser.setAddress((String)inObj.get("address"));
        newUser.setEmail((String)inObj.get("email"));
        newUser.setPhoneNumber((String)inObj.get("phoneNumber"));
        newUser.setId((String)inObj.get("userId"));
        newUser.setPassword((String)inObj.get("password"));
        
        return newUser;
    }
    
    private static Patient JSONToPatient(JSONObject inObj) {
        Patient newUser = new Patient();
        
        newUser.setName((String)inObj.get("name"));
        newUser.setAddress((String)inObj.get("address"));
        newUser.setEmail((String)inObj.get("email"));
        newUser.setPhoneNumber((String)inObj.get("phoneNumber"));
        newUser.setId((String)inObj.get("userId"));
        newUser.setPassword((String)inObj.get("password"));
        
        return newUser;
    }
    
    public static void setActiveID(String id) {
        activeID = id;
    }
    
    public static void requestAccount(User user) {
        createUser(requests, user);
    }
    
    public static int findByID(String ID) {
        char firstLetter = ID.charAt(0);
        int pos = -1;
        String compare;
        
        if (firstLetter == 'P') {
            
            for (int i = 0; i < patients.length; i++) {
                compare = patients[i].getId();
                if (compare.equals(ID)) {
                    pos = i;
                }
            }
            return pos;
        }
        else if (firstLetter == 'D') {
            for (int i = 0; i < doctors.length; i++) {
                compare = doctors[i].getId();
                if (compare.equals(ID)) {
                    pos = i;
                }
            }
            return pos;
        }
        else if (firstLetter == 'S') {
            for (int i = 0; i < secretaries.length; i++) {
                compare = secretaries[i].getId();
                if (compare.equals(ID)) {
                    pos = i;
                }
            }
            return pos;
        }
        else if (firstLetter == 'A') {
            for (int i = 0; i < admins.length; i++) {
                compare = admins[i].getId();
                if (compare.equals(ID)) {
                    pos = i;
                }
            }
            return pos;
        }
        
        return pos;
    }
    
    public static String checkLogin() {
        String type = "";
        
        return type;
    }
    
    public static void increment(int num) {
        nextID[num]++;
    }

    public static int getNextID(int num) {
        return nextID[num];
    }

    public static int[] getNextIDArray() {
        return nextID;
    }

    public static User[] popObject(User[] array, User item) {
        if (array == null) {
            return array;
        }

        User[] newArray = new User[array.length - 1];
        int position = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == item) {
                position = i;
            }
        }

        for (int i = 0, k = 0; i < array.length; i++) {
            if (i == position) {
                continue;
            }

            newArray[k++] = array[i];
        }

        return newArray;
    }

    public static Data getInstance() {
        if (instance == null) {
            instance = new Data();
        }
        return instance;
    }
    
    public static User[] createUser(User[] array, User user) {
        int Length;
        if (array == null) {
            Length = 0;
        }
        else {
            Length = array.length;
        }

        User[] newArray = new User[Length + 1];
        for (int i = 0; i < Length; i++) {
            newArray[i] = array[i];
        }
        newArray[Length] = user;
        return newArray;


    }
    
    public static void createAdmin(Admin user) {
        int Length;
        if (admins == null) {
            Length = 0;
        }
        else {
            Length = admins.length;
        }

        Admin[] newArray = new Admin[Length + 1];
        for (int i = 0; i < Length; i++) {
            newArray[i] = admins[i];
        }
        newArray[Length] = user;
        admins = newArray;

    }
    
    public static void createSecretary(Secretary user) {
        int Length;
        if (secretaries == null) {
            Length = 0;
        }
        else {
            Length = secretaries.length;
        }

        Secretary[] newArray = new Secretary[Length + 1];
        for (int i = 0; i < Length; i++) {
            newArray[i] = secretaries[i];
        }
        newArray[Length] = user;
        secretaries = newArray;


    }
    
    public static void createDoctor(Doctor user) {
        int Length;
        if (doctors == null) {
            Length = 0;
        }
        else {
            Length = doctors.length;
        }

        Doctor[] newArray = new Doctor[Length + 1];
        for (int i = 0; i < Length; i++) {
            newArray[i] = doctors[i];
        }
        newArray[Length] = user;
        doctors = newArray;


    }
    
    public static void createPatient(Patient user) {
        int Length;
        if (patients == null) {
            Length = 0;
        }
        else {
            Length = patients.length;
        }

        Patient[] newArray = new Patient[Length + 1];
        for (int i = 0; i < Length; i++) {
            newArray[i] = patients[i];
        }
        newArray[Length] = user;
        patients = newArray;


    }

    public static Prescription[] pushObject(Prescription[] array, Prescription prescription) {
        int Length;
        if (array == null) {
            Length = 0;
        }
        else {
            Length = array.length;
        }

        Prescription[] newArray = new Prescription[Length + 1];
        for (int i = 0; i < Length; i++) {
            newArray[i] = array[i];
        }
        newArray[Length] = prescription;
        return newArray;


    }

    public static void setInstance(Data instance) {
        Data.instance = instance;
    }

    public static Patient[] getPatients() {
        return patients;
    }

    public static int[] getNextID() {
        return nextID;
    }

}

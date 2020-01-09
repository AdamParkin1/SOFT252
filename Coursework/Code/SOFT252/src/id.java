public class id {
    private static id instance;
    
    private int nextID;

    private id(){}
    
    public static id getInstance() {
        if (instance == null) {
            instance = new id();
        }
        return instance;
    }
    
    public String getNewID(String userCode) {
        String id = userCode + String.valueOf(nextID);
        nextID++;
        return id;
    }
    
    public void setID(int newID) {
        nextID = newID;
    }
}

public class id {

    private int nextID;

    public String getNewID(String userCode) {
        String id = userCode + String.valueOf(nextID);
        nextID++;
        return id;
    }
    
    public void setID(int newID) {
        nextID = newID;
    }
}

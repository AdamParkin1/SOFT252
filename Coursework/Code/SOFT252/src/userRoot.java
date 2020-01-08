/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aparkin1
 */
public class userRoot {
    private static userRoot instance;
    
    private patient[] allPatients;
    private doctor[] allDoctors;
    private secretary[] allSecretaries;
    private admin[] allAdmins;
    
    private userRoot(){}
    
    public static userRoot getInstance(){
        if (instance == null) {
            instance = new userRoot();
        }
        return instance;
    }
    
    public Object findUserByID(String inputID) {
        Object foundUser = null;
        
        String userIDLetter = this.getUserIdLetter(inputID);
        
        switch (idLetter) { // MAKE THIS INTO A STRATEGY OR TEMPLATE PATTERN
            case "p":
                
        }
        
        
        return foundUser;
    }
    
    public Object[] findAllUsersInGroup(String inputID) {
        Object[] foundUsers = null;
        
        return foundUsers;
    }
    
    public patient[] getAllPatients () {
        return instance.allPatients;
    }
    
    public doctor[] getAllDoctors () {
        return instance.allDoctors;
    }
    
    public secretary[] getAllSecretaries () {
        return instance.allSecretaries;
    }
    
    public admin[] getAllAdmins () {
        return instance.allAdmins;
    }
    
    private String getUserIdLetter(String inputID) {
        String userID = null;
        if ((inputID != null) && (inputID.length() > 0)) { // get the ID letter
            String trimmedID = inputID.substring(0, 1);
        }
        return userID;
    }
}


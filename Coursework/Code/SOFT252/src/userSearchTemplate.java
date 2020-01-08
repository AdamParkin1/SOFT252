/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aparkin1
 */
public class userSearchTemplate {
    public final Object searchByID(String inputID){
        int idNumber = getUserIdNumber(inputID);
        if (idNumber == -1) {
            return null;
        }

        Object userFound = searchInUserGroup(strippedID);
        return userFound;
    }
    

    
    protected int getUserIdNumber(String inputID) {
        int userID = -1;
        if ((inputID != null) && (inputID.length() > 0)) { // get the ID letter
            String trimmedID = inputID.substring(1, (inputID.length() - 1));
            userID = Integer.parseInt(trimmedID);
        }
        return userID;
    }
}

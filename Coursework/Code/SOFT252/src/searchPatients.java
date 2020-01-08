/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aparkin1
 */
public class searchPatients extends userSearchTemplate {
        protected Object searchUserInGroup(int strippedUserID) {
            Object foundUser = null;
            userRoot rootInstance = userRoot.getInstance();
            patient[] allUsersOfGroup = rootInstance.getAllPatients();
            
            for (int i = 0; i < allUsersOfGroup.length; i++) {
                String idOfI = allUsersOfGroup[i].getUserID();
                String trimmedID = idOfI.substring(1, idOfI.length() - 1);
                int intID = Integer.parseInt(trimmedID);

                if (intID == strippedUserID) {
                    return allUsersOfGroup[i];
                }
            }
            
            return foundUser;
        }  
    }

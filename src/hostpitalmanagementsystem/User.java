/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hostpitalmanagementsystem;

/**
 *
 * @author Nadeeshan Weerawarna
 */
public class User {
    private int userId;
    private String userNICnumber;
    private String userName;
    private String passWord;   
    private String privilage;

    /**
     * @return the userId
     */
    public int getUserId() {
        return userId;
    }

    /**
     * @param userId the userId to set
     */
    public void setUserId(int userId) {
        this.userId = userId;
    }

    /**
     * @return the userNICnumber
     */
    public String getUserNICnumber() {
        return userNICnumber;
    }

    /**
     * @param userNICnumber the userNICnumber to set
     */
    public void setUserNICnumber(String userNICnumber) {
        this.userNICnumber = userNICnumber;
    }

    /**
     * @return the userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName the userName to set
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return the passWord
     */
    public String getPassWord() {
        return passWord;
    }

    /**
     * @param passWord the passWord to set
     */
    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    /**
     * @return the privilage
     */
    public String getPrivilage() {
        return privilage;
    }

    /**
     * @param privilage the privilage to set
     */
    public void setPrivilage(String privilage) {
        this.privilage = privilage;
    }
}

package hostpitalmanagementsystem;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Nadeeshan Weerawarna
 */
public class LoginDetails {

    private String userName;
    private String passWord;
    private String date;
    private int logId;
    private String logIntime;
    private String logOuttime;
    private String userNicNumber;

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
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return the userNicNumber
     */
    public String getUserNicNumber() {
        return userNicNumber;
    }

    /**
     * @param userNicNumber the userNicNumber to set
     */
    public void setUserNicNumber(String userNicNumber) {
        this.userNicNumber = userNicNumber;
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
     * @return the logId
     */
    public int getLogId() {
        return logId;
    }

    /**
     * @param logId the logId to set
     */
    public void setLogId(int logId) {
        this.logId = logId;
    }

    /**
     * @return the logIntime
     */
    public String getLogIntime() {
        return logIntime;
    }

    /**
     * @param logIntime the logIntime to set
     */
    public void setLogIntime(String logIntime) {
        this.logIntime = logIntime;
    }

    /**
     * @return the logOuttime
     */
    public String getLogOuttime() {
        return logOuttime;
    }

    /**
     * @param logOuttime the logOuttime to set
     */
    public void setLogOuttime(String logOuttime) {
        this.logOuttime = logOuttime;
    }
}

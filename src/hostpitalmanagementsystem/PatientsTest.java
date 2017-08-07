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
public class PatientsTest {
    private int patientId;
    private String patientNICnumber;
    private String nameOftesting;
    private String date;
    private String time;
    private int testId;
    private String testResult;

    /**
     * @return the patientNICnumber
     */
    public String getPatientNICnumber() {
        return patientNICnumber;
    }

    /**
     * @param patientNICnumber the patientNICnumber to set
     */
    public void setPatientNICnumber(String patientNICnumber) {
        this.patientNICnumber = patientNICnumber;
    }

    /**
     * @return the nameOftesting
     */
    public String getNameOftesting() {
        return nameOftesting;
    }

    /**
     * @param nameOftesting the nameOftesting to set
     */
    public void setNameOftesting(String nameOftesting) {
        this.nameOftesting = nameOftesting;
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
     * @return the testId
     */
    public int getTestId() {
        return testId;
    }

    /**
     * @param testId the testId to set
     */
    public void setTestId(int testId) {
        this.testId = testId;
    }

    /**
     * @return the patientId
     */
    public int getPatientId() {
        return patientId;
    }

    /**
     * @param patientId the patientId to set
     */
    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    /**
     * @return the time
     */
    public String getTime() {
        return time;
    }

    /**
     * @param time the time to set
     */
    public void setTime(String time) {
        this.time = time;
    }

    /**
     * @return the testResult
     */
    public String getTestResult() {
        return testResult;
    }

    /**
     * @param testResult the testResult to set
     */
    public void setTestResult(String testResult) {
        this.testResult = testResult;
    }
}

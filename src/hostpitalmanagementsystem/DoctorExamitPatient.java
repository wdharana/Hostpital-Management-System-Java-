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
public class DoctorExamitPatient {
    private int regId;
    private String doctorNICnumber;
    private int patientId;
    private String patientNICnumber;
    private String result;
    private String doctorName;
    private String patientName;
    private String examitTime;
    private String examitDate;

    /**
     * @return the regId
     */
    public int getRegId() {
        return regId;
    }

    /**
     * @param regId the regId to set
     */
    public void setRegId(int regId) {
        this.regId = regId;
    }

    /**
     * @return the doctorNICnumber
     */
    public String getDoctorNICnumber() {
        return doctorNICnumber;
    }

    /**
     * @param doctorNICnumber the doctorNICnumber to set
     */
    public void setDoctorNICnumber(String doctorNICnumber) {
        this.doctorNICnumber = doctorNICnumber;
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
     * @return the result
     */
    public String getResult() {
        return result;
    }

    /**
     * @param result the result to set
     */
    public void setResult(String result) {
        this.result = result;
    }

    /**
     * @return the doctorName
     */
    public String getDoctorName() {
        return doctorName;
    }

    /**
     * @param doctorName the doctorName to set
     */
    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    /**
     * @return the patientName
     */
    public String getPatientName() {
        return patientName;
    }

    /**
     * @param patientName the patientName to set
     */
    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    /**
     * @return the examitTime
     */
    public String getExamitTime() {
        return examitTime;
    }

    /**
     * @param examitTime the examitTime to set
     */
    public void setExamitTime(String examitTime) {
        this.examitTime = examitTime;
    }

    /**
     * @return the examitDate
     */
    public String getExamitDate() {
        return examitDate;
    }

    /**
     * @param examitDate the examitDate to set
     */
    public void setExamitDate(String examitDate) {
        this.examitDate = examitDate;
    }
}

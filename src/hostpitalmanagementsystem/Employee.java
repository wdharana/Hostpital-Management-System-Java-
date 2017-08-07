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
public class Employee {
private int regId;
private String firstName;
private String lastName;
private int age;
private String gender;
private String dateOfbirth;
private String address;
private int contactNumber;
private String nicNumber;
private String typeOfEmployee;





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
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the typeOfEmployee
     */
    public String getTypeOfEmployee() {
        return typeOfEmployee;
    }

    /**
     * @param typeOfEmployee the typeOfEmployee to set
     */
    public void setTypeOfEmployee(String typeOfEmployee) {
        this.typeOfEmployee = typeOfEmployee;
    }

    

    /**
     * @return the contactNumber
     */
    public int getContactNumber() {
        return contactNumber;
    }

    /**
     * @param contactNumber the contactNumber to set
     */
    public void setContactNumber(int contactNumber) {
        this.contactNumber = contactNumber;
    }

    /**
     * @return the nicNumber
     */
    public String getNicNumber() {
        return nicNumber;
    }

    /**
     * @param nicNumber the nicNumber to set
     */
    public void setNicNumber(String nicNumber) {
        this.nicNumber = nicNumber;
    }

    /**
     * @return the dateOfbirth
     */
    public String getDateOfbirth() {
        return dateOfbirth;
    }

    /**
     * @param dateOfbirth the dateOfbirth to set
     */
    public void setDateOfbirth(String dateOfbirth) {
        this.dateOfbirth = dateOfbirth;
    }


}

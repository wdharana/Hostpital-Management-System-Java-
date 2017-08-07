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
public class Ward {
    private int wardId;
    private String wardName;

    /**
     * @return the wardId
     */
    public int getWardId() {
        return wardId;
    }

    /**
     * @param wardId the wardId to set
     */
    public void setWardId(int wardId) {
        this.wardId = wardId;
    }

    /**
     * @return the wardName
     */
    public String getWardName() {
        return wardName;
    }

    /**
     * @param wardName the wardName to set
     */
    public void setWardName(String wardName) {
        this.wardName = wardName;
    }
}

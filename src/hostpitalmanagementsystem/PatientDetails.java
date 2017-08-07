/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hostpitalmanagementsystem;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Nadeeshan Weerawarna
 */
public class PatientDetails extends AbstractTableModel{

    private static final String[] COLUMN_NAME = {"First name", "Last name", "Age", "Gender"};  // table column names
    private  static ArrayList<Patients> list;

    public PatientDetails(ArrayList<Patients> palst) {
        list = palst;
    }
    
    
    
    
    @Override
    public int getRowCount() {
        return list.size();
    }
    @Override
    public String getColumnName(int columnIndex){
        return COLUMN_NAME[columnIndex];
    }

    @Override
    public int getColumnCount() {
       return COLUMN_NAME.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {  // add data to the table
        switch(columnIndex){
            case 0:
                return list.get(rowIndex).getFirstName();
            case 1:
                return list.get(rowIndex).getLastName();
            case 2:
                return list.get(rowIndex).getAge();
            case 3:
                return list.get(rowIndex).getGender();
            default:
                return "Error";
        }
    }
    
}

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
public class EmployeeDetails extends AbstractTableModel {

    private static final String[] COLUMN_NAME = {"Reg Id", "First name", "Last name", "Age", "Gender", "Date of birth", "Address", "Contact number"};  // column name
    private static ArrayList<Employee> list;

    public EmployeeDetails(ArrayList<Employee> emplist) {
        list = emplist;
    }

    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public String getColumnName(int columnIndex) {
        return COLUMN_NAME[columnIndex];
    }

    @Override
    public int getColumnCount() {
        return COLUMN_NAME.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {   // add data to the table
        switch (columnIndex) {
            case 0:
                return list.get(rowIndex).getRegId();
            case 1:
                return list.get(rowIndex).getFirstName();
            case 2:
                return list.get(rowIndex).getLastName();
            case 3:
                return list.get(rowIndex).getAge();
            case 4:
                return list.get(rowIndex).getGender();
            case 5:
                return list.get(rowIndex).getDateOfbirth();
            case 6:
                return list.get(rowIndex).getAddress();
            case 7:
                return list.get(rowIndex).getContactNumber();
            default:
                return "Error";
        }
    }

}

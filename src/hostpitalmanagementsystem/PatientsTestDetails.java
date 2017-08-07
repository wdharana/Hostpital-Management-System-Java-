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
public class PatientsTestDetails extends AbstractTableModel {

    private static final String[] COLUMN_NAME = {"Test name", "Result", "Date", "Time"};
    private static ArrayList<PatientsTest> list;

    public PatientsTestDetails(ArrayList<PatientsTest> tstlist) {
        list = tstlist;
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
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return list.get(rowIndex).getNameOftesting();
            case 1:
                return list.get(rowIndex).getTestResult();
            case 2:
                return list.get(rowIndex).getDate();
            case 3:
                return list.get(rowIndex).getTime();

            default:
                return "Error";
        }
    }

}

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
public class DoctorExamitPatientDetails extends AbstractTableModel {

    private static final String[] COLUMN_NAME = {"Patient name", "Doctor name", "Report", "Examit date", "Examit time"};
    private static ArrayList<DoctorExamitPatient> list;

    public DoctorExamitPatientDetails(ArrayList<DoctorExamitPatient> deplist) {
        list = deplist;
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
                return list.get(rowIndex).getPatientName();
            case 1:
                return list.get(rowIndex).getDoctorName();
            case 2:
                return list.get(rowIndex).getResult();
            case 3:
                return list.get(rowIndex).getExamitDate();
            case 4:
                return list.get(rowIndex).getExamitTime();

            default:
                return "Error";
        }
    }

}

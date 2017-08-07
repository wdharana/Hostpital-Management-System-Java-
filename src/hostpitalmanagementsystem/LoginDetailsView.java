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
public class LoginDetailsView extends AbstractTableModel{
    
     private static final String[] COLUMN_NAME = {"LogIn Id", "Date", "LogIn time", "LogOut time", "User NIC number"};
    private static ArrayList<LoginDetails> list;
    
    public LoginDetailsView(ArrayList<LoginDetails> loglist) {
        list = loglist;
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
                return list.get(rowIndex).getLogId();
            case 1:
                return list.get(rowIndex).getDate();
            case 2:
                return list.get(rowIndex).getLogIntime();
            case 3:
                return list.get(rowIndex).getLogOuttime();
            case 4:
                return list.get(rowIndex).getUserNicNumber();
            default:
                return "Error";
        }
    }
    
}

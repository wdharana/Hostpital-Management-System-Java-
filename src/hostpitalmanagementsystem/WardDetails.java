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
public class WardDetails extends AbstractTableModel{
    
    private static final String[] COLUMN_NAME = {"Ward id", "Ward name"};
    private  static ArrayList<Ward> list;
    
    public WardDetails(ArrayList<Ward> wadlst) {
        list = wadlst;
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
    public Object getValueAt(int rowIndex, int columnIndex) {
         switch(columnIndex){
            case 0:
                return list.get(rowIndex).getWardId();
            case 1:
                return list.get(rowIndex).getWardName();
            default:
                return "Error";
        }
    }
    
}

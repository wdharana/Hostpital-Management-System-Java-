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
public class PaymentDetails extends AbstractTableModel {

    private static final String[] COLUMN_NAME = {"PaymentId", "Amount", "Date", "Time"};
    private static ArrayList<Payment> list;

    public PaymentDetails(ArrayList<Payment> paylst) {
        list = paylst;
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
                return list.get(rowIndex).getPaymentId();
            case 1:
                return list.get(rowIndex).getPayment();
            case 2:
                return list.get(rowIndex).getDate();
            case 3:
                return list.get(rowIndex).getTime();
            default:
                return "Error";
        }
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.model;

import BLL.Revistat;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author hp
 */
public class RevistatTable extends AbstractTableModel{
    
    List<Revistat> list;
    String[] columns = {"ID", "Emri:", "Botuesi:", "ISSN:" };

    public RevistatTable() {
    }

    public RevistatTable(List<Revistat> list) {
        this.list = list;
    }

    public void add(List<Revistat> list) {
        this.list = list;
    }

    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }

    public Revistat getRevistat(int i) {
        return list.get(i);
    }
    
    @Override
    public String getColumnName(int column) {
        return columns[column];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Revistat r = getRevistat(rowIndex);
        switch (columnIndex) {
            case 0:
                return r.getRevistatid();
            case 1:
                return r.getEmri();
                
            case 2:
                return r.getBotuesi();
            case 3:
                return r.getIssn();
           
             default:
                 return null;
        }
    }
}

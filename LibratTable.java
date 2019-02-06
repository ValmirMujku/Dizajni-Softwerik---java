/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.model;

import BLL.Librat;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author hp
 */
public class LibratTable extends AbstractTableModel{
    
    List<Librat> list;
    String[] columns = {"ID", "Emri:", "Autori:", "ISSN:", "Aksioni" };

    public LibratTable() {
    }

    public LibratTable(List<Librat> list) {
        this.list = list;
    }

    public void add(List<Librat> list) {
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

    public Librat getLibrat(int i) {
        return list.get(i);
    }
    
    @Override
    public String getColumnName(int column) {
        return columns[column];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Librat l = getLibrat(rowIndex);
        switch (columnIndex) {
            case 0:
                return l.getLibratID();
            case 1:
                return l.getEmri();
            case 2:
                return l.getAutori();
            case 3:
                return l.getIssn();
            case 4:
                return l.getLexo();
           
             default:
                 return null;
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.model;

import BLL.Drejtimi;
import java.util.List;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;

/**
 *
 * @author hp
 */
public class DrejtimiCombobox extends AbstractListModel<Drejtimi> implements ComboBoxModel<Drejtimi>{
        private Drejtimi drejtimi;
    private List<Drejtimi> data;
    
    public  DrejtimiCombobox (List arrayList){
        data = arrayList;
    }

    public  DrejtimiCombobox () {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }



    @Override
    public int getSize() {
        return data.size();
    }

    @Override
    public Drejtimi getElementAt(int index) {
        return data.get(index);
    }

    @Override
    public void setSelectedItem(Object anItem) {
        drejtimi = (Drejtimi)anItem;
    }

    @Override
    public Object getSelectedItem() {
        return drejtimi;
    }
}

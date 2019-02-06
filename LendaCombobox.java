/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.model;

import BLL.Lenda;
import java.util.List;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;

/**
 *
 * @author hp
 */
public class LendaCombobox extends AbstractListModel<Lenda> implements ComboBoxModel<Lenda>{
        private Lenda lenda;
    private List<Lenda> data;
    
    public  LendaCombobox (List arrayList){
        data = arrayList;
    }

    public  LendaCombobox () {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }



    @Override
    public int getSize() {
        return data.size();
    }

    @Override
    public Lenda getElementAt(int index) {
        return data.get(index);
    }

    @Override
    public void setSelectedItem(Object anItem) {
        lenda = (Lenda)anItem;
    }

    @Override
    public Object getSelectedItem() {
        return lenda;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.model;

import BLL.Profesori;
import java.util.List;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;

/**
 *
 * @author hp
 */
public class ProfesoriCombobox extends AbstractListModel<Profesori> implements ComboBoxModel<Profesori>{
        private Profesori profesori;
    private List<Profesori> data;
    
    public  ProfesoriCombobox (List arrayList){
        data = arrayList;
    }

    public  ProfesoriCombobox () {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }



    @Override
    public int getSize() {
        return data.size();
    }

    @Override
    public Profesori getElementAt(int index) {
        return data.get(index);
    }

    @Override
    public void setSelectedItem(Object anItem) {
        profesori = (Profesori)anItem;
    }

    @Override
    public Object getSelectedItem() {
        return profesori;
    }
}

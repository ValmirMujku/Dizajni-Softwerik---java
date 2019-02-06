/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gui.view;

import BLL.Drejtimi;
import BLL.Eventi;
import BLL.Lenda;
import BLL.Profesori;
import DAL.DrejtimiRepository;
import DAL.EventiRepository;
import DAL.LendaRepository;
import DAL.ProfesoriRepository;
import gui.model.DrejtimiCombobox;
import gui.model.LendaCombobox;
import gui.model.ProfesoriCombobox;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author hp
 */
public class EventiForma extends javax.swing.JInternalFrame {

    EventiRepository er = new EventiRepository();
    DrejtimiRepository dr = new DrejtimiRepository();
    LendaRepository lr = new LendaRepository();
    ProfesoriRepository pr = new ProfesoriRepository();
    
    public EventiForma() {
        initComponents();
        loadbox();
        loadboxlenda(); 
        loadboxProfesori();
    }
    
    public void pastrofushat(){
    DrejtimiCom.setSelectedItem(-1);
    LendaCom.setSelectedItem(-1);
    ProfesoriCom.setSelectedItem(-1);
      loadbox();
        loadboxlenda(); 
        loadboxProfesori();
    AnetaretTextF.setText("");
    }

     public void loadbox()   {
        DrejtimiCombobox dc;
        List<Drejtimi> lista = dr.findAll();
        dc = new DrejtimiCombobox(lista);
        DrejtimiCom.setModel(dc);
    }
     
      public void loadboxlenda()   {
        LendaCombobox lc;
        List<Lenda> lista = lr.findAll();
        lc = new LendaCombobox(lista);
        LendaCom.setModel(lc);
    }
      
       public void loadboxProfesori()   {
        ProfesoriCombobox pc;
        List<Profesori> lista = pr.findAll();
        pc = new ProfesoriCombobox(lista);
        ProfesoriCom.setModel(pc);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DrejtimiCom = new javax.swing.JComboBox();
        LendaCom = new javax.swing.JComboBox();
        ProfesoriCom = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        AnetaretTextF = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        LendaCom.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "" }));
        LendaCom.setSelectedIndex(-1);

        ProfesoriCom.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "" }));
        ProfesoriCom.setSelectedIndex(-1);

        AnetaretTextF.setColumns(20);
        AnetaretTextF.setRows(5);
        jScrollPane1.setViewportView(AnetaretTextF);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 0, 51));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/comp/Stock-Index-Up-icon.png"))); // NOI18N
        jButton1.setText("SUBMIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Drejtimi");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Lenda");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Profesori");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Anetaret");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel5.setText("EVENTI");

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/comp/Generate-tables-icon.png"))); // NOI18N
        jButton2.setText("CLEAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ProfesoriCom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LendaCom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DrejtimiCom, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(478, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))))
            .addGroup(layout.createSequentialGroup()
                .addGap(290, 290, 290)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {DrejtimiCom, LendaCom, ProfesoriCom});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel1, jLabel2, jLabel3, jLabel4});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DrejtimiCom, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LendaCom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(ProfesoriCom, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2))
                        .addGap(22, 22, 22))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(jLabel4)))
                        .addContainerGap(33, Short.MAX_VALUE))))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {DrejtimiCom, LendaCom, ProfesoriCom});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel1, jLabel2, jLabel3, jLabel4});

        DrejtimiCom.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

     public boolean simboletFushaAnetaret(){
        int count = 0;
        char[] shkronjat = AnetaretTextF.getText().toCharArray();
        for(char c:shkronjat){
            int code = (int)c;
            if(code >=65 && code <=90){
                count++;
            }
        }
        if(count == AnetaretTextF.getText().length()){
            return true;
        }
        return false;
    }
     
    public boolean validimi(){
    if(DrejtimiCom.getSelectedItem() == null && LendaCom.getSelectedItem() == null && ProfesoriCom.getSelectedItem() == null 
            && AnetaretTextF.getText().equals("")){
        JOptionPane.showMessageDialog(this, "Ju nuk keni plotësuar asnjë rubrikë.");
        
    }else if(DrejtimiCom.getSelectedItem() == null){
        JOptionPane.showMessageDialog(this, "Zgjedhni Drejtimin.");
    }else if(LendaCom.getSelectedItem() == null){
        JOptionPane.showMessageDialog(this, "Zgjedhni Lenden.");
    }else if(ProfesoriCom.getSelectedItem() == null){
        JOptionPane.showMessageDialog(this, "Zgjedhni Profesorin.");
    }else if(AnetaretTextF.getText().equals("")){
        JOptionPane.showMessageDialog(this, "Zgjedhni Anetaret.");
    }else if(DrejtimiCom.getSelectedItem() == null && LendaCom.getSelectedItem() == null && ProfesoriCom.getSelectedItem() == null 
            && AnetaretTextF.getText().equals("")){
        JOptionPane.showMessageDialog(this, "Plotesoni te gjitha rubrikat.");
    }else if(simboletFushaAnetaret()==true){
        JOptionPane.showMessageDialog(this, "Anetaret permbajne simbole te pa lejuara..");
    }else{
        return true;
    }
    return false;
    }
    
   
    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       if(validimi()==true  ){
        Eventi e = new Eventi();
         
         e.setDrejtimie((Drejtimi)DrejtimiCom.getSelectedItem());
         e.setLendae((Lenda)LendaCom.getSelectedItem());
         e.setProfesorie((Profesori)ProfesoriCom.getSelectedItem());
         e.setAnetaret(AnetaretTextF.getText());
         e.setData(new Date());
         er.create(e);
         pastrofushat(); 
         JOptionPane.showMessageDialog(this, "Eventi u Krijua ne lenden: " + e.getLendae());
       }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        pastrofushat();
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea AnetaretTextF;
    private javax.swing.JComboBox DrejtimiCom;
    private javax.swing.JComboBox LendaCom;
    private javax.swing.JComboBox ProfesoriCom;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

}

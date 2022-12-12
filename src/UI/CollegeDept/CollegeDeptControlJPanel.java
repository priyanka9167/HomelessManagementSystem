/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.CollegeDept;

import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author pikku
 */
public class CollegeDeptControlJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CollegeDeptControlJPanel
     */
     JPanel controlArea;
    JPanel workArea;
    public CollegeDeptControlJPanel(JPanel controlArea, JPanel workArea) {
        initComponents();
         this.controlArea = controlArea;
        this.workArea = workArea;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAdd = new javax.swing.JButton();
        btnRead = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 255));

        btnAdd.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 12)); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnRead.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 12)); // NOI18N
        btnRead.setText("Read");
        btnRead.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReadActionPerformed(evt);
            }
        });

        btnUpdate.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 12)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnUpdate)
                    .addComponent(btnRead)
                    .addComponent(btnAdd))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(btnAdd)
                .addGap(31, 31, 31)
                .addComponent(btnRead)
                .addGap(30, 30, 30)
                .addComponent(btnUpdate)
                .addContainerGap(164, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        workArea.removeAll();
        CollegeDeptAddJPanel cdajp = new CollegeDeptAddJPanel(controlArea, workArea);
        workArea.add("CollegeDeptAddJPanel", cdajp);
        CardLayout layout1 = (CardLayout) workArea.getLayout();
        layout1.next(workArea);
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnReadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReadActionPerformed
        // TODO add your handling code here:
        workArea.removeAll();
        CollegeDeptReadJPanel cdrjp = new CollegeDeptReadJPanel(controlArea, workArea);
        workArea.add("CollegeDeptReadJPanel", cdrjp);
        CardLayout layout3 = (CardLayout) workArea.getLayout();
        layout3.next(workArea);
    }//GEN-LAST:event_btnReadActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        workArea.removeAll();
        CollegeDeptUpdateJPanel cdujp = new CollegeDeptUpdateJPanel(controlArea, workArea);
        workArea.add("CollegeDeptUpdateJPanel", cdujp);
        CardLayout layout4 = (CardLayout) workArea.getLayout();
        layout4.next(workArea);
    }//GEN-LAST:event_btnUpdateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnRead;
    private javax.swing.JButton btnUpdate;
    // End of variables declaration//GEN-END:variables
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.Funding;

import Schooling.UI.ManageDepartments_Read;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author richapatel
 */
public class Funding_ManageInvestors extends javax.swing.JPanel {

    /**
     * Creates new form Funding_ManageInvestord
     */
      JPanel controlArea;
    JPanel workArea;
    public Funding_ManageInvestors(JPanel controlArea, JPanel workArea) {
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

        btnDelete = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnRead = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnRead.setText("Read");
        btnRead.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReadActionPerformed(evt);
            }
        });

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
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnDelete)
                    .addComponent(btnUpdate)
                    .addComponent(btnRead)
                    .addComponent(btnAdd))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(btnAdd)
                .addGap(31, 31, 31)
                .addComponent(btnRead)
                .addGap(30, 30, 30)
                .addComponent(btnUpdate)
                .addGap(35, 35, 35)
                .addComponent(btnDelete)
                .addContainerGap(280, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        workArea.removeAll();
        Funding_ManageInvestor_Delete fmid = new Funding_ManageInvestor_Delete(controlArea, workArea);
        workArea.add("Funding_ManageInvestor_Delete", fmid);
        CardLayout layout4 = (CardLayout) workArea.getLayout();
        layout4.next(workArea);
        
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        workArea.removeAll();
        Funding_ManageInvestors_Add fmia = new Funding_ManageInvestors_Add(controlArea, workArea);
        workArea.add("Funding_ManageInvestors_Add", fmia);
        CardLayout layout1 = (CardLayout) workArea.getLayout();
        layout1.next(workArea);
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnReadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReadActionPerformed
        // TODO add your handling code here:
        workArea.removeAll();
        Funding_ManageInvestors_Read fmr = new Funding_ManageInvestors_Read(controlArea, workArea);
        workArea.add("Funding_ManageInvestors_Read", fmr);
        CardLayout layout3 = (CardLayout) workArea.getLayout();
        layout3.next(workArea);
    }//GEN-LAST:event_btnReadActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        workArea.removeAll();
        Funding_ManageInvestor_Update fmu = new Funding_ManageInvestor_Update(controlArea, workArea);
        workArea.add("Funding_ManageInvestor_Update", fmu);
        CardLayout layout4 = (CardLayout) workArea.getLayout();
        layout4.next(workArea);
    }//GEN-LAST:event_btnUpdateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnRead;
    private javax.swing.JButton btnUpdate;
    // End of variables declaration//GEN-END:variables
}
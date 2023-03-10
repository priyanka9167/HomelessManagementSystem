/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Schooling.UI;

import DataConnection.db;
import Schooling.Model.FieldOfInterest;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author navinsharma
 */
public class University_ManageFieldOfInterest_Add extends javax.swing.JPanel {

    /**
     * Creates new form University_ManageFieldOfInterest_Add
     */
    JPanel controlArea;
    JPanel workArea;
    public University_ManageFieldOfInterest_Add(JPanel controlArea, JPanel workArea) 
    {
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

        jLabelTitle = new javax.swing.JLabel();
        jLabelCourseField = new javax.swing.JLabel();
        jTextFieldCourseField = new javax.swing.JTextField();
        jButtonSubmit = new javax.swing.JButton();

        jLabelTitle.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitle.setText("Add Course Field");

        jLabelCourseField.setText("Course field:");

        jButtonSubmit.setText("Submit");
        jButtonSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSubmitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabelCourseField)
                .addGap(64, 64, 64)
                .addComponent(jTextFieldCourseField, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonSubmit)
                .addGap(132, 132, 132))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabelTitle)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCourseField)
                    .addComponent(jTextFieldCourseField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButtonSubmit)
                .addContainerGap(29, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSubmitActionPerformed
        // TODO add your handling code here:
        String category = jTextFieldCourseField.getText();
        if(category.isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Category cannot be null.");
        }
        else
        {
            FieldOfInterest foi = new FieldOfInterest(category);
            try 
            {
                foi.addFieldOfInterest(category);
            } 
            catch (SQLException ex) 
            {
                if(ex.getMessage().contains("Duplicate entry"))
                {
                    JOptionPane.showMessageDialog(this, "User already exists");
                }
            }
        }
    }//GEN-LAST:event_jButtonSubmitActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonSubmit;
    private javax.swing.JLabel jLabelCourseField;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JTextField jTextFieldCourseField;
    // End of variables declaration//GEN-END:variables
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import Schooling.UI.Schooling_Admin;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author navinsharma
 */
public class Admin_Login extends javax.swing.JPanel {

    /**
     * Creates new form Admin_Login
     */
    JPanel controlArea;
    JPanel workArea;
    public Admin_Login(JPanel workArea, JPanel controlArea) {
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

        jTextFieldUsername = new javax.swing.JTextField();
        jPasswordFieldPassword = new javax.swing.JPasswordField();
        jButtonLogin = new javax.swing.JButton();
        jLabelTitile = new javax.swing.JLabel();
        jLabelUsername = new javax.swing.JLabel();
        jLabelPassword = new javax.swing.JLabel();
        jLabelCategory = new javax.swing.JLabel();
        jComboBoxCategory = new javax.swing.JComboBox<>();

        jButtonLogin.setText("Login");
        jButtonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoginActionPerformed(evt);
            }
        });

        jLabelTitile.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabelTitile.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitile.setText("Admin Login");

        jLabelUsername.setText("Username:");

        jLabelPassword.setText("Password:");

        jLabelCategory.setText("Category:");

        jComboBoxCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NGO", "Schooling", "Funding", "Housing" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelTitile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelUsername)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabelCategory)
                        .addComponent(jLabelPassword)))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldUsername)
                    .addComponent(jPasswordFieldPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                    .addComponent(jComboBoxCategory, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(230, 230, 230)
                .addComponent(jButtonLogin)
                .addGap(192, 192, 192))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabelTitile)
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelUsername)
                    .addComponent(jTextFieldUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPassword)
                    .addComponent(jPasswordFieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCategory)
                    .addComponent(jComboBoxCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jButtonLogin)
                .addContainerGap(105, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoginActionPerformed
        // TODO add your handling code here:
        Schooling_Admin cajp = new Schooling_Admin(controlArea, workArea);
        controlArea.add("ControlAreaJPanel",cajp);
        CardLayout layout2 = (CardLayout)controlArea.getLayout();
        layout2.next(controlArea); 
    }//GEN-LAST:event_jButtonLoginActionPerformed
//private void setLayout() {
////        Admin_Login admin_login = new Admin_Login(workArea);
////        workArea.add("Admin_Login",admin_login);
////        CardLayout layout = (CardLayout)workArea.getLayout();
////        layout.next(workArea); 
//        
//        Schooling_Admin cajp = new Schooling_Admin(controlArea, workArea);
//        controlArea.add("ControlAreaJPanel",cajp);
//        CardLayout layout2 = (CardLayout)controlArea.getLayout();
//        layout2.next(controlArea); 
//
////         StudentAddJPanel sajp = new StudentAddJPanel(workArea);
////        workArea.add("StudentAddJPanel",sajp);
////        CardLayout layout = (CardLayout)workArea.getLayout();
////        layout.next(workArea); 
//    
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonLogin;
    private javax.swing.JComboBox<String> jComboBoxCategory;
    private javax.swing.JLabel jLabelCategory;
    private javax.swing.JLabel jLabelPassword;
    private javax.swing.JLabel jLabelTitile;
    private javax.swing.JLabel jLabelUsername;
    private javax.swing.JPasswordField jPasswordFieldPassword;
    private javax.swing.JTextField jTextFieldUsername;
    // End of variables declaration//GEN-END:variables
}

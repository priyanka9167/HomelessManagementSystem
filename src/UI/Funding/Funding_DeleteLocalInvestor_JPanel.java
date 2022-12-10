/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.Funding;

import Investor.Investor;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author richapatel
 */
public class Funding_DeleteLocalInvestor_JPanel extends javax.swing.JPanel {

    /**
     * Creates new form Funding_DeleteLocalInvestor_JPanel
     */
    int id;

    public Funding_DeleteLocalInvestor_JPanel(JPanel controlArea, JPanel workArea) {
        initComponents();
        this.id = id;
        populateLocalInvestor();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblLocalInvestors = new javax.swing.JTable();
        btnDelete = new javax.swing.JButton();

        tblLocalInvestors.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Firstname", "Lastname", "Email", "Funds", "Contact No"
            }
        ));
        jScrollPane1.setViewportView(tblLocalInvestors);

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnDelete)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(332, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(btnDelete)
                .addContainerGap(85, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblLocalInvestors.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblLocalInvestors.getModel();
        id = Integer.parseInt(model.getValueAt(selectedRowIndex, 0).toString());
        Investor in = new Investor();
        try {
            in.deleteInvestor(id);
            JOptionPane.showMessageDialog(this, "Investor deleted"); 
            populateLocalInvestor();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }


    }//GEN-LAST:event_btnDeleteActionPerformed

    private void populateLocalInvestor() {
        try {
            DefaultTableModel model = (DefaultTableModel) tblLocalInvestors.getModel();
            model.setRowCount(0);
            Investor in = new Investor();
            ResultSet rs = in.getAllLocalInvestor();

            while (rs.next()) {
                Object[] row = new Object[6];
                row[0] = rs.getInt(1);
                row[1] = rs.getString(2);
                row[2] = rs.getString(3);
                row[3] = rs.getString(5);
                row[4] = rs.getString(11);
                row[5] = rs.getString(6);
                model.addRow(row);

            }
//            empty all dropdown

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblLocalInvestors;
    // End of variables declaration//GEN-END:variables
}

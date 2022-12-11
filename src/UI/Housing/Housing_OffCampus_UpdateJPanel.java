/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.Housing;

import Housing.Housing;
import Schooling.Model.University;
import UI.ControlAreaJPanel;
import java.awt.CardLayout;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author pikku
 */
public class Housing_OffCampus_UpdateJPanel extends javax.swing.JPanel {

    /**
     * Creates new form Housing_OffCampus_UpdateJPanel
     */
    University un;
    int id;
     JPanel controlArea;
    JPanel workArea;
    public Housing_OffCampus_UpdateJPanel(JPanel controlArea, JPanel workArea) {
        initComponents();
         populateTable();
          this.controlArea = controlArea;
        this.workArea = workArea;
        this.un = new University();
        populateUniversity();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAdd = new java.awt.Button();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        ComboBoxUniversity = new javax.swing.JComboBox<>();
        lblSlots = new java.awt.Label();
        txtSlots = new javax.swing.JTextField();
        Update = new javax.swing.JButton();
        lblAddress = new java.awt.Label();
        lblZipcode = new java.awt.Label();
        lblUniversity = new java.awt.Label();
        txtAddress = new javax.swing.JTextField();
        txtZipcode = new javax.swing.JTextField();
        btnBack2 = new javax.swing.JButton();

        btnAdd.setLabel("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id", "University", "Address", "Zipcode", "Slots"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        ComboBoxUniversity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblSlots.setText("Slots");

        txtSlots.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSlotsActionPerformed(evt);
            }
        });

        Update.setText("Update");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });

        lblAddress.setText("Address");

        lblZipcode.setText("Zipcode");

        lblUniversity.setText("University");

        txtAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddressActionPerformed(evt);
            }
        });

        txtZipcode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtZipcodeActionPerformed(evt);
            }
        });

        btnBack2.setText("Back");
        btnBack2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(419, 419, 419)
                                .addComponent(Update))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(101, 101, 101)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(lblUniversity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblAddress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblZipcode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblSlots, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(98, 98, 98)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtAddress)
                                            .addComponent(txtZipcode)
                                            .addComponent(ComboBoxUniversity, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtSlots, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(btnBack2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(87, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(btnBack2)
                .addGap(56, 56, 56)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(132, 132, 132)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Update)
                        .addGap(18, 18, 18)
                        .addComponent(lblUniversity, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ComboBoxUniversity, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblZipcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtZipcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(lblSlots, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtSlots, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23)
                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        if (txtAddress.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Address cannot be null");
        } else if (txtZipcode.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "ZipCode cannot be null.");
        } else if (txtSlots.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Slots cannot be null.");
        } else if (Pattern.matches("[a-zA-Z]+", txtSlots.getText())) {
            JOptionPane.showMessageDialog(this, "Slots should be in digits.");
        } else {
            String address = txtAddress.getText();
            String university = ComboBoxUniversity.getSelectedItem().toString();
            int zipcode = Integer.parseInt(txtZipcode.getText());
            int slots = Integer.parseInt(txtSlots.getText());
            ResultSet rs = un.getUniversityIdByName(university);
            try {
                while (rs.next()) {
                    int university_id = rs.getInt(1);
                    Housing h = new Housing();
                    h.updateOnCampusHousing(id, university_id, slots, address, zipcode);
                    JOptionPane.showMessageDialog(this, "Housing added");
                    populateTable();

                    txtAddress.setText("");
                    txtZipcode.setText("");
                    txtSlots.setText("");
                    populateUniversity();

                }
            } catch (SQLException e) {
                e.getMessage();
            }

        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void txtSlotsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSlotsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSlotsActionPerformed

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = jTable1.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        id = Integer.parseInt(model.getValueAt(selectedRowIndex, 0).toString());
        ComboBoxUniversity.setSelectedItem(model.getValueAt(selectedRowIndex, 1).toString());
        txtAddress.setText(model.getValueAt(selectedRowIndex, 2).toString());
        txtZipcode.setText(model.getValueAt(selectedRowIndex, 3).toString());
        txtSlots.setText(model.getValueAt(selectedRowIndex, 4).toString());
    }//GEN-LAST:event_UpdateActionPerformed

    private void txtAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressActionPerformed

    private void txtZipcodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtZipcodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtZipcodeActionPerformed

    private void btnBack2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack2ActionPerformed
        // TODO add your handling code here:
         ControlAreaJPanel cajp = new ControlAreaJPanel(controlArea, workArea);
        controlArea.add("ControlAreaJPanel", cajp);
        CardLayout layout = (CardLayout) controlArea.getLayout();
        layout.next(controlArea);
        workArea.remove(this);
    }//GEN-LAST:event_btnBack2ActionPerformed

     private void populateTable() {
        try {
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setRowCount(0);
            Housing h = new Housing();
            ResultSet resultset = h.getAllOnOffHousing();

            while (resultset.next()) {
                Object[] row = new Object[5];
                row[0] = resultset.getInt(1);
                row[1] = resultset.getString(2);
                row[2] = resultset.getString(3);
                row[3] = resultset.getInt(4);
                row[4] = resultset.getInt(5);

                model.addRow(row);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBoxUniversity;
    private javax.swing.JButton Update;
    private java.awt.Button btnAdd;
    private javax.swing.JButton btnBack2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private java.awt.Label lblAddress;
    private java.awt.Label lblSlots;
    private java.awt.Label lblUniversity;
    private java.awt.Label lblZipcode;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtSlots;
    private javax.swing.JTextField txtZipcode;
    // End of variables declaration//GEN-END:variables

    private void populateUniversity() {
        try {
            ResultSet resultset = un.getUniversity();
            ComboBoxUniversity.removeAllItems();
            while (resultset.next()) {
                ComboBoxUniversity.addItem(resultset.getString(2));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }

    }
}

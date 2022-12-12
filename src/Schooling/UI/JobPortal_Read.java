/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Schooling.UI;

import Schooling.Model.JobPortal;
import java.awt.CardLayout;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author navinsharma
 */
public class JobPortal_Read extends javax.swing.JPanel {

    /**
     * Creates new form JobPortal_Read
     */
    JPanel controlArea;
    JPanel workArea;
    ResultSet resultSet;
    public JobPortal_Read(JPanel controlArea, JPanel workArea) 
    {
        try 
        {
            initComponents();
            this.controlArea = controlArea;
            this.workArea = workArea;
            JobPortal jp = new JobPortal();
            resultSet = jp.getallJobs();
            ViewTable();
        } 
        catch (SQLException ex) 
        {
//            Logger.getLogger(JobPortal_Read.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonView = new javax.swing.JButton();
        jLabelJobTitle = new javax.swing.JLabel();
        jComboBoxCategory = new javax.swing.JComboBox<>();
        jTextFieldLocation = new javax.swing.JTextField();
        jLabelLocation = new javax.swing.JLabel();
        jLabelCategory = new javax.swing.JLabel();
        jTextFieldCompanyName = new javax.swing.JTextField();
        jLabelCompanyName = new javax.swing.JLabel();
        jComboBoxJobType = new javax.swing.JComboBox<>();
        jLabelJobType = new javax.swing.JLabel();
        jScrollPaneJobDescription = new javax.swing.JScrollPane();
        jTextAreaJobDescription = new javax.swing.JTextArea();
        jTextFieldJobTitle = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jLabelJobDescription = new javax.swing.JLabel();
        jLabelTitle = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        jButtonView.setText("View");
        jButtonView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonViewActionPerformed(evt);
            }
        });

        jLabelJobTitle.setText("Job Title:");

        jComboBoxCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "On Campus", "Off Campus" }));
        jComboBoxCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCategoryActionPerformed(evt);
            }
        });

        jLabelLocation.setText("Location:");

        jLabelCategory.setText("Category:");

        jLabelCompanyName.setText("Company Name:");

        jComboBoxJobType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Part time", "Full time", "Intern" }));

        jLabelJobType.setText("Job Type:");

        jTextAreaJobDescription.setColumns(20);
        jTextAreaJobDescription.setRows(5);
        jScrollPaneJobDescription.setViewportView(jTextAreaJobDescription);

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Company name", "Job title", "Category", "Job Type", "Location", "Job description"
            }
        ));
        jScrollPane1.setViewportView(jTable);

        jLabelJobDescription.setText("Job Description:");

        jLabelTitle.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitle.setText("Read Jobs");

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelJobType)
                                    .addComponent(jLabelLocation)
                                    .addComponent(jLabelJobDescription))
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPaneJobDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBoxJobType, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabelCompanyName)
                                            .addComponent(jLabelJobTitle))
                                        .addGap(30, 30, 30))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabelCategory)
                                        .addGap(72, 72, 72)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldJobTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldCompanyName, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBoxCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(104, 104, 104)
                        .addComponent(jButtonView, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 589, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabelTitle)
                .addGap(7, 7, 7)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCompanyName)
                    .addComponent(jTextFieldCompanyName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonView))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelJobTitle)
                    .addComponent(jTextFieldJobTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCategory)
                    .addComponent(jComboBoxCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxJobType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelJobType))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelLocation)
                    .addComponent(jTextFieldLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabelJobDescription))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPaneJobDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCategoryActionPerformed
        // TODO add your handling code here:
        String category;

        category = jComboBoxCategory.getSelectedItem().toString();
        if("Off Campus".equals(category))
        {
            jComboBoxJobType.addItem("Part time");
            jComboBoxJobType.addItem("Full time");
            jComboBoxJobType.addItem("Intern");
        }
        else
        {
            jComboBoxJobType.removeAllItems();
        }
    }//GEN-LAST:event_jComboBoxCategoryActionPerformed

    private void jButtonViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonViewActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = jTable.getSelectedRow();
        if (selectedRowIndex<0)
        {
            JOptionPane.showMessageDialog(this, "Please select a row to view");
        }
        else
        {
            DefaultTableModel table_model = (DefaultTableModel) jTable.getModel();
            jTextFieldCompanyName.setText(table_model.getValueAt(selectedRowIndex, 0).toString());
            jTextFieldJobTitle.setText(table_model.getValueAt(selectedRowIndex, 1).toString());
            if("On Campus".equals(table_model.getValueAt(selectedRowIndex, 2).toString()))
            {
                jComboBoxCategory.setSelectedItem("On Campus");
            }
            else
            {
                jComboBoxCategory.setSelectedItem("Off Campus");
            }
            if("Part time".equals(table_model.getValueAt(selectedRowIndex, 3).toString()))
            {
                jComboBoxJobType.setSelectedItem("Part time");
            }
            if("Full time".equals(table_model.getValueAt(selectedRowIndex, 3).toString()))
            {
                jComboBoxJobType.setSelectedItem("Full time");
            }
            else
            {
                jComboBoxJobType.setSelectedItem("Intern");
            }
            jTextFieldLocation.setText(table_model.getValueAt(selectedRowIndex, 4).toString());
            jTextAreaJobDescription.setText(table_model.getValueAt(selectedRowIndex, 5).toString());
        }
    }//GEN-LAST:event_jButtonViewActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        controlArea.removeAll();
        Schooling_Admin cajp = new Schooling_Admin(controlArea, workArea);
        controlArea.add("ControlAreaJPanel", cajp);
        CardLayout layout2 = (CardLayout) controlArea.getLayout();
        layout2.next(controlArea);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonView;
    private javax.swing.JComboBox<String> jComboBoxCategory;
    private javax.swing.JComboBox<String> jComboBoxJobType;
    private javax.swing.JLabel jLabelCategory;
    private javax.swing.JLabel jLabelCompanyName;
    private javax.swing.JLabel jLabelJobDescription;
    private javax.swing.JLabel jLabelJobTitle;
    private javax.swing.JLabel jLabelJobType;
    private javax.swing.JLabel jLabelLocation;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPaneJobDescription;
    private javax.swing.JTable jTable;
    private javax.swing.JTextArea jTextAreaJobDescription;
    private javax.swing.JTextField jTextFieldCompanyName;
    private javax.swing.JTextField jTextFieldJobTitle;
    private javax.swing.JTextField jTextFieldLocation;
    // End of variables declaration//GEN-END:variables

    private void ViewTable() throws SQLException
    {
        DefaultTableModel table_model = (DefaultTableModel) jTable.getModel();
        table_model.setRowCount(0);
        
        try 
        {
            while (resultSet.next()) 
            {
                Object[] row = new Object[6];
                row[0] = resultSet.getString(2);
                row[1] = resultSet.getString(3);
                row[2] = resultSet.getString(4);
                row[3] = resultSet.getString(5);
                row[4] = resultSet.getString(6);
                row[5] = resultSet.getString(7);
                table_model.addRow(row);
            }
        } 
        catch (IllegalArgumentException e) 
        {
            throw new IllegalArgumentException(e.getMessage() + "Record not found");
        }
    }
}
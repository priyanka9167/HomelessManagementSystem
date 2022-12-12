/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Schooling.UI;

import Schooling.Model.JobPortal;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author navinsharma
 */
public class JobPortal_Update extends javax.swing.JPanel {

    /**
     * Creates new form JobPortal_Update
     */
    JPanel controlArea;
    JPanel workArea;
    ResultSet resultSet;
    String company_name, job_title, job_type, location, job_description, category;
    JobPortal jp = new JobPortal();
    public JobPortal_Update(JPanel controlArea, JPanel workArea) 
    {
        try 
        {
            initComponents();
            this.controlArea = controlArea;
            this.workArea = workArea;
            resultSet = jp.getallJobs();
            ViewTable();
        } 
        catch (SQLException ex)
        {
//            Logger.getLogger(JobPortal_Update.class.getName()).log(Level.SEVERE, null, ex);
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

        jLabelJobType = new javax.swing.JLabel();
        jComboBoxJobType = new javax.swing.JComboBox<>();
        jLabelCompanyName = new javax.swing.JLabel();
        jTextFieldCompanyName = new javax.swing.JTextField();
        jLabelCategory = new javax.swing.JLabel();
        jLabelLocation = new javax.swing.JLabel();
        jLabelTitle = new javax.swing.JLabel();
        jTextFieldLocation = new javax.swing.JTextField();
        jLabelJobDescription = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jComboBoxCategory = new javax.swing.JComboBox<>();
        jButtonView = new javax.swing.JButton();
        jLabelJobTitle = new javax.swing.JLabel();
        jScrollPaneJobDescription = new javax.swing.JScrollPane();
        jTextAreaJobDescription = new javax.swing.JTextArea();
        jTextFieldJobTitle = new javax.swing.JTextField();
        jButtonUpdate = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(242, 224, 206));

        jLabelJobType.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 14)); // NOI18N
        jLabelJobType.setText("Job Type:");

        jComboBoxJobType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Part time", "Full time", "Intern" }));

        jLabelCompanyName.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 14)); // NOI18N
        jLabelCompanyName.setText("Company Name:");

        jLabelCategory.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 14)); // NOI18N
        jLabelCategory.setText("Category:");

        jLabelLocation.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 14)); // NOI18N
        jLabelLocation.setText("Location:");

        jLabelTitle.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitle.setText("Read Jobs");

        jLabelJobDescription.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 14)); // NOI18N
        jLabelJobDescription.setText("Job Description:");

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

        jComboBoxCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "On Campus", "Off Campus" }));
        jComboBoxCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCategoryActionPerformed(evt);
            }
        });

        jButtonView.setText("View");
        jButtonView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonViewActionPerformed(evt);
            }
        });

        jLabelJobTitle.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 14)); // NOI18N
        jLabelJobTitle.setText("Job Title:");

        jTextAreaJobDescription.setColumns(20);
        jTextAreaJobDescription.setRows(5);
        jScrollPaneJobDescription.setViewportView(jTextAreaJobDescription);

        jButtonUpdate.setText("Update");
        jButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Job portal.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 589, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(54, 54, 54))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabelTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCompanyName)
                    .addComponent(jTextFieldCompanyName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonView))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelJobTitle)
                    .addComponent(jTextFieldJobTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonUpdate))
                .addGap(19, 19, 19)
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
                .addGap(44, 44, 44))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCategoryActionPerformed
        // TODO add your handling code here:
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
            company_name = table_model.getValueAt(selectedRowIndex, 0).toString();
            jTextFieldCompanyName.setText(company_name);
            job_title = table_model.getValueAt(selectedRowIndex, 1).toString();
            jTextFieldJobTitle.setText(job_title);
            if("On Campus".equals(table_model.getValueAt(selectedRowIndex, 2).toString()))
            {
                category = "On Campus";
                jComboBoxCategory.setSelectedItem("On Campus");
            }
            else
            {
                category = "Off Campus";
                jComboBoxCategory.setSelectedItem("Off Campus");
            }
            if("Part time".equals(table_model.getValueAt(selectedRowIndex, 3).toString()))
            {
                job_type = "Part time";
                jComboBoxJobType.setSelectedItem("Part time");
            }
            if("Full time".equals(table_model.getValueAt(selectedRowIndex, 3).toString()))
            {
                job_type = "Full time";
                jComboBoxJobType.setSelectedItem("Full time");
            }
            if("Intern".equals(table_model.getValueAt(selectedRowIndex, 3).toString()))
            {
                job_type = "Intern";
                jComboBoxJobType.setSelectedItem("Intern");
            }
            location = table_model.getValueAt(selectedRowIndex, 4).toString();
            jTextFieldLocation.setText(location);
            job_description = table_model.getValueAt(selectedRowIndex, 5).toString();
            jTextAreaJobDescription.setText(job_description);
        }
    }//GEN-LAST:event_jButtonViewActionPerformed

    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed
        // TODO add your handling code here:
        String company_name2, job_title2, job_type2, location2, job_description2, category2;
        ResultSet resultSet1;
        
        company_name2 = jTextFieldCompanyName.getText();
        if(company_name2.isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Company name cannot be null.");
        }
        else
        {
            job_title2 = jTextFieldJobTitle.getText();
            if(job_title2.isEmpty())
            {
                JOptionPane.showMessageDialog(this, "Job title cannot be null.");
            }
            else
            {
                category2 = jComboBoxCategory.getSelectedItem().toString();
                if("Off Campus".equals(category2))
                {
                    job_type2 = jComboBoxJobType.getSelectedItem().toString();
                }
                else
                {
                    job_type2 = "";
                }
                location2 = jTextFieldLocation.getText();
                if (location2.isEmpty())
                {
                    JOptionPane.showMessageDialog(this, "Location cannot be null.");
                } 
                else 
                {
                    job_description2 = jTextAreaJobDescription.getText();
                    if (job_description2.isEmpty()) 
                    {
                        JOptionPane.showMessageDialog(this, "Job description cannot be null.");
                    } 
                    else 
                    {
                        try 
                        {
                            resultSet1 = jp.getallJobs();
                            while(resultSet1.next())
                            {
                                if(resultSet1.getString(2).equals(company_name) && 
                                        resultSet1.getString(3).equals(job_title) && 
                                        resultSet1.getString(4).equals(category) && 
                                        resultSet1.getString(5).equals(job_type) && 
                                        resultSet1.getString(6).equals(location) && 
                                        resultSet1.getString(7).equals(job_description))
                                {
                                    int id = resultSet1.getInt(1);
                                    JobPortal jp2 = new JobPortal(id, company_name2, job_title2, category2, job_type2, location2, job_description2);
                                    jp2.updateJob(id, company_name2, job_title2, category2, job_type2, location2, job_description2);
                                }
                            }
                        } 
                        catch (SQLException ex)
                        {
//                            Logger.getLogger(JobPortal_Add.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_jButtonUpdateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JButton jButtonView;
    private javax.swing.JComboBox<String> jComboBoxCategory;
    private javax.swing.JComboBox<String> jComboBoxJobType;
    private javax.swing.JLabel jLabel1;
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

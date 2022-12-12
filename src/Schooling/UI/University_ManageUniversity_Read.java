/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Schooling.UI;
import Schooling.Model.University;
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
public class University_ManageUniversity_Read extends javax.swing.JPanel {

    /**
     * Creates new form Schooling_ManageUniversity_Read
     */
    JPanel controlArea;
    JPanel workArea;
    ResultSet resultSet;
    public University_ManageUniversity_Read(JPanel controlArea, JPanel workArea) {
        try 
        {
            initComponents();
            this.controlArea = controlArea;
            this.workArea = workArea;
            University uni = new University();
            resultSet = uni.getallUniversity();
            ViewTable();
        } 
        catch (SQLException ex) 
        {
//            Logger.getLogger(University_ManageUniversity_Read.class.getName()).log(Level.SEVERE, null, ex);
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

        jTextFieldSeatInCourse = new javax.swing.JTextField();
        jLabelSeatsInCourse = new javax.swing.JLabel();
        jTextFieldUniversityName = new javax.swing.JTextField();
        jLabelUniversityName = new javax.swing.JLabel();
        jLabelCategory = new javax.swing.JLabel();
        jLabelTitle = new javax.swing.JLabel();
        jLabelCoursename = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jButtonView = new javax.swing.JButton();
        jTextFieldCategory = new javax.swing.JTextField();
        jTextFieldCourseName = new javax.swing.JTextField();
        jButtonBack = new javax.swing.JButton();

        jTextFieldSeatInCourse.setToolTipText("");

        jLabelSeatsInCourse.setText("Seats in course:");

        jLabelUniversityName.setText("University name:");

        jLabelCategory.setText("Category:");

        jLabelTitle.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitle.setText("Read University");
        jLabelTitle.setToolTipText("");

        jLabelCoursename.setText("Course name:");

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "University name", "Category", "Course name", "Seats in course"
            }
        ));
        jScrollPane1.setViewportView(jTable);

        jButtonView.setText("View");
        jButtonView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonViewActionPerformed(evt);
            }
        });

        jButtonBack.setText("Back");
        jButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonBack, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabelCoursename)
                                .addComponent(jLabelCategory)
                                .addComponent(jLabelUniversityName)
                                .addComponent(jLabelSeatsInCourse))
                            .addGap(32, 32, 32)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextFieldSeatInCourse, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE)
                                .addComponent(jTextFieldUniversityName, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jTextFieldCategory)
                                .addComponent(jTextFieldCourseName)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jButtonView, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(276, 276, 276))))
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabelTitle)
                .addGap(18, 18, 18)
                .addComponent(jButtonBack)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonView)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelUniversityName)
                    .addComponent(jTextFieldUniversityName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCategory)
                    .addComponent(jTextFieldCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCoursename)
                    .addComponent(jTextFieldCourseName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSeatsInCourse)
                    .addComponent(jTextFieldSeatInCourse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonViewActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = jTable.getSelectedRow();
        if (selectedRowIndex<0)
        {
            JOptionPane.showMessageDialog(this, "Please select a row to view");
            return;
        }
        else
        {
            DefaultTableModel table_model = (DefaultTableModel) jTable.getModel();
            jTextFieldUniversityName.setText(table_model.getValueAt(selectedRowIndex, 0).toString());
            jTextFieldCategory.setText(table_model.getValueAt(selectedRowIndex, 1).toString());
            jTextFieldCourseName.setText(table_model.getValueAt(selectedRowIndex, 2).toString());
            jTextFieldSeatInCourse.setText(table_model.getValueAt(selectedRowIndex, 3).toString());
        }
    }//GEN-LAST:event_jButtonViewActionPerformed

    private void jButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackActionPerformed
        // TODO add your handling code here:
        controlArea.removeAll();
        Schooling_Admin cajp = new Schooling_Admin(controlArea, workArea);
        controlArea.add("ControlAreaJPanel", cajp);
        CardLayout layout2 = (CardLayout) controlArea.getLayout();
        layout2.next(controlArea);
    }//GEN-LAST:event_jButtonBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBack;
    private javax.swing.JButton jButtonView;
    private javax.swing.JLabel jLabelCategory;
    private javax.swing.JLabel jLabelCoursename;
    private javax.swing.JLabel jLabelSeatsInCourse;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JLabel jLabelUniversityName;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    private javax.swing.JTextField jTextFieldCategory;
    private javax.swing.JTextField jTextFieldCourseName;
    private javax.swing.JTextField jTextFieldSeatInCourse;
    private javax.swing.JTextField jTextFieldUniversityName;
    // End of variables declaration//GEN-END:variables

    private void ViewTable() throws SQLException
    {
        DefaultTableModel table_model = (DefaultTableModel) jTable.getModel();
        table_model.setRowCount(0);
        
        try 
        {
            while (resultSet.next()) 
            {
                Object[] row = new Object[4];
                row[0] = resultSet.getString(2);
                row[1] = resultSet.getString(3);
                row[2] = resultSet.getString(4);
                row[3] = resultSet.getString(5);
                table_model.addRow(row);
            }
        } 
        catch (IllegalArgumentException e) 
        {
            throw new IllegalArgumentException(e.getMessage() + "Record not found");
        }
    }
}
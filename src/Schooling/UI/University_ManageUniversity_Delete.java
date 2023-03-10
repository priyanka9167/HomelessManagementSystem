/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Schooling.UI;

import Schooling.Model.Courses;
import Schooling.Model.University;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author navinsharma
 */
public class University_ManageUniversity_Delete extends javax.swing.JPanel {

    /**
     * Creates new form Schooling_ManageUniversity_Delete
     */
    JPanel controlArea;
    JPanel workArea;
    public University_ManageUniversity_Delete(JPanel controlArea, JPanel workArea)
    {
        initComponents();
        this.controlArea = controlArea;
        this.workArea = workArea;
        jTextFieldCategory.setEditable(false);
        jTextFieldCourseName.setEditable(false);
        jTextFieldSeatInCourse.setEditable(false);
        jTextFieldUniversityName.setEditable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    
    University uni = new University();
    
    ResultSet resultSetuni, resultSetcourse;
    String university_name, seats1, course_name;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldUniversityName = new javax.swing.JTextField();
        jLabelCategory = new javax.swing.JLabel();
        jLabelSeatsInCourse = new javax.swing.JLabel();
        jLabelUniversityName = new javax.swing.JLabel();
        jTextFieldCourseName = new javax.swing.JTextField();
        jButtonDelete = new javax.swing.JButton();
        jTextFieldSeatInCourse = new javax.swing.JTextField();
        jTextFieldCategory = new javax.swing.JTextField();
        jButtonView = new javax.swing.JButton();
        jButtonFetch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jLabelCoursename = new javax.swing.JLabel();
        jLabelTitle = new javax.swing.JLabel();

        jLabelCategory.setText("Category:");

        jLabelSeatsInCourse.setText("Seats in course:");

        jLabelUniversityName.setText("University name:");

        jButtonDelete.setText("Delete");
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });

        jTextFieldSeatInCourse.setToolTipText("");

        jButtonView.setText("View");
        jButtonView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonViewActionPerformed(evt);
            }
        });

        jButtonFetch.setText("Fetch");
        jButtonFetch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFetchActionPerformed(evt);
            }
        });

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

        jLabelCoursename.setText("Course name:");

        jLabelTitle.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitle.setText("Delete University");
        jLabelTitle.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelCoursename)
                            .addComponent(jLabelCategory)
                            .addComponent(jLabelUniversityName)
                            .addComponent(jLabelSeatsInCourse))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldSeatInCourse, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
                            .addComponent(jTextFieldCategory)
                            .addComponent(jTextFieldCourseName)
                            .addComponent(jTextFieldUniversityName)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(68, 68, 68)
                        .addComponent(jButtonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68)
                        .addComponent(jButtonFetch, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabelTitle)
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonFetch)
                    .addComponent(jButtonView)
                    .addComponent(jButtonDelete))
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
                .addGap(22, 22, 22))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        // TODO add your handling code here:
        String old_university;
        int university_id, course_id, seats;
        resultSetuni = uni.getallUniversity();
        try 
        {
            while (resultSetuni.next()) 
            {
                old_university = resultSetuni.getString(2);
                if (old_university.equals(university_name)) 
                {
                    university_id = resultSetuni.getInt(1);

                    Courses course = new Courses();
                    resultSetcourse = course.getCourses();
                    while (resultSetcourse.next()) {
                        String old_course_name = resultSetcourse.getString(3);
                        course_id = resultSetcourse.getInt(1);

                        if (old_course_name.equals(course_name)) {
                            University uni1 = new University(university_name, university_id);
                            uni1.deleteUniversity(university_name, university_id);
                            
                            seats = Integer.parseInt(seats1);
                            
                            University uni2 = new University(course_id, university_id, seats);
                            uni2.deleteSeats(course_id, university_id, seats);
                        }
                    }
                }
            }
        } 
        catch (SQLException ex) 
        {
//            Logger.getLogger(University_ManageUniversity_Delete.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonDeleteActionPerformed

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
            university_name = table_model.getValueAt(selectedRowIndex, 0).toString();
            seats1 = table_model.getValueAt(selectedRowIndex, 3).toString();
            course_name = table_model.getValueAt(selectedRowIndex, 2).toString();

            jTextFieldUniversityName.setText(university_name);
            jTextFieldCategory.setText(table_model.getValueAt(selectedRowIndex, 1).toString());
            jTextFieldCourseName.setText(course_name);
            jTextFieldSeatInCourse.setText(seats1);
        }
    }//GEN-LAST:event_jButtonViewActionPerformed

    private void jButtonFetchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFetchActionPerformed
        // TODO add your handling code here:
        resultSetuni = uni.getallUniversity();
        try
        {
            ViewTable();
        }
        catch (SQLException ex)
        {
            //            Logger.getLogger(University_ManageUniversity_Read.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonFetchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonFetch;
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
            while (resultSetuni.next()) 
            {
                Object[] row = new Object[4];
                row[0] = resultSetuni.getString(2);
                row[1] = resultSetuni.getString(3);
                row[2] = resultSetuni.getString(4);
                row[3] = resultSetuni.getString(5);
                table_model.addRow(row);
            }
        } 
        catch (IllegalArgumentException e) 
        {
            throw new IllegalArgumentException(e.getMessage() + "Record not found");
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Schooling.UI;

import Schooling.Model.Courses;
import Schooling.Model.FieldOfInterest;
import Schooling.Model.University;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author navinsharma
 */
public class University_ManageUniversity_Add extends javax.swing.JPanel {

    /**
     * Creates new form Schooling_ManageUniversity_Add
     */
    ResultSet resultSet_category;
    ResultSet resultSet_course;
    ResultSet resultSet_course1;
    ResultSet resultSet_category1;
    ResultSet resultSet_university;
    public University_ManageUniversity_Add() throws SQLException {
        initComponents();
        jComboBoxCategory.removeAllItems();
        jComboBoxCourseName.removeAllItems();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    private boolean isInteger(String a){
        try{
            Integer.parseInt(a);
            return true;
        }
        catch(Exception e){
            return false;
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonSubmit = new javax.swing.JButton();
        jLabelCoursename = new javax.swing.JLabel();
        jLabelTitle = new javax.swing.JLabel();
        jLabelCategory = new javax.swing.JLabel();
        jComboBoxCategory = new javax.swing.JComboBox<>();
        jComboBoxCourseName = new javax.swing.JComboBox<>();
        jLabelUniversityName = new javax.swing.JLabel();
        jTextFieldUniversityName = new javax.swing.JTextField();
        jLabelSeatsInCourse = new javax.swing.JLabel();
        jTextFieldSeatInCourse = new javax.swing.JTextField();
        jButtonCourse = new javax.swing.JButton();
        jButtonCategory = new javax.swing.JButton();

        jButtonSubmit.setText("Submit");
        jButtonSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSubmitActionPerformed(evt);
            }
        });

        jLabelCoursename.setText("Course name:");

        jLabelTitle.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitle.setText("Add University");
        jLabelTitle.setToolTipText("");

        jLabelCategory.setText("Category:");

        jComboBoxCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCategoryActionPerformed(evt);
            }
        });

        jComboBoxCourseName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCourseNameActionPerformed(evt);
            }
        });

        jLabelUniversityName.setText("University name:");

        jLabelSeatsInCourse.setText("Seats in course:");

        jTextFieldSeatInCourse.setToolTipText("");

        jButtonCourse.setText("Course");
        jButtonCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCourseActionPerformed(evt);
            }
        });

        jButtonCategory.setText("Category");
        jButtonCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCategoryActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelCoursename)
                    .addComponent(jLabelCategory)
                    .addComponent(jLabelUniversityName)
                    .addComponent(jLabelSeatsInCourse))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButtonCourse)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addComponent(jButtonCategory)
                        .addGap(27, 27, 27)
                        .addComponent(jButtonSubmit))
                    .addComponent(jTextFieldSeatInCourse)
                    .addComponent(jComboBoxCategory, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldUniversityName, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jComboBoxCourseName, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(49, Short.MAX_VALUE))
            .addComponent(jLabelTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabelTitle)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelUniversityName)
                    .addComponent(jTextFieldUniversityName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCategory))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCoursename)
                    .addComponent(jComboBoxCourseName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSeatsInCourse)
                    .addComponent(jTextFieldSeatInCourse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSubmit)
                    .addComponent(jButtonCourse)
                    .addComponent(jButtonCategory))
                .addContainerGap(24, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxCourseNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCourseNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxCourseNameActionPerformed

    private void jButtonSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSubmitActionPerformed
        // TODO add your handling code here:
        String university_name, course_name, category, seats1;
        int seats, university_id, course_id;
        
        university_name = jTextFieldUniversityName.getText();
        if(university_name.isEmpty())
        {
            JOptionPane.showMessageDialog(this, "University name cannot be null.");
        }
        else
        {
            course_name = jComboBoxCourseName.getSelectedItem().toString();
            category = jComboBoxCategory.getSelectedItem().toString();
            seats1 = jTextFieldSeatInCourse.getText();
            if(seats1.isEmpty())
            {
                JOptionPane.showMessageDialog(this, "Seats cannot be null.");
            }
            else
            {
                boolean checker = isInteger(seats1);
                if (!checker) 
                {
                    JOptionPane.showMessageDialog(this, "Number of seats should be integer.");
                } 
                else 
                {
                    seats = Integer.parseInt(seats1);
                    try 
                    {
                        //add university name to university database
                        University uni = new University(university_name);
                        uni.addUniversity(university_name);
                        
                        //fetch data of university from database
                        resultSet_university = uni.getUniversity();
                        while (resultSet_university.next()) 
                        {
                            if (resultSet_university.getString(2).equals(university_name)) 
                            {
                                university_id = resultSet_university.getInt(1);
                                Courses course = new Courses();
                                resultSet_course1 = course.getCourses();
                                while(resultSet_course1.next())
                                {
                                    if(resultSet_course1.getString(3).equals(course_name))
                                    {
                                        course_id = resultSet_course1.getInt(1);
                                        University university = new University(course_id, university_id, seats);
                                        university.addCoursesInUniversity(course_id, university_id, seats);
                                    }
                                }
                            }
                        }
                    } 
                    catch (SQLException ex) 
                    {
                        if(ex.getMessage().contains("Duplicate entry"))
                        {
                            JOptionPane.showMessageDialog(this, "User already exists");
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_jButtonSubmitActionPerformed

    private void jButtonCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCourseActionPerformed
        // TODO add your handling code here:
        try 
        {
            jComboBoxCourseName.removeAllItems();
            String category = jComboBoxCategory.getSelectedItem().toString();
            FieldOfInterest foi = new FieldOfInterest();
            resultSet_category1 = foi.getallFieldOfInterest();
            while(resultSet_category1.next())
            {
                if(resultSet_category1.getString(2).equals(category))                
                {
                    Courses course = new Courses(resultSet_category1.getInt(1));
                    resultSet_course = course.getCourseByCategory(resultSet_category1.getInt(1));
                    while (resultSet_course.next()) 
                    {
                        jComboBoxCourseName.addItem(resultSet_course.getString(3));
                    }
                }
            }
        } 
        catch (SQLException ex) 
        {
//            Logger.getLogger(University_ManageUniversity_Add.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonCourseActionPerformed

    private void jButtonCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCategoryActionPerformed
        // TODO add your handling code here:
        FieldOfInterest foi = new FieldOfInterest();
        resultSet_category = foi.getallFieldOfInterest();
        try 
        {
            jComboBoxCategory.removeAllItems();
            while(resultSet_category.next())
            {
                jComboBoxCategory.addItem(resultSet_category.getString(2));
            }
        } 
        catch (SQLException ex) 
        {
//            Logger.getLogger(University_ManageUniversity_Add.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonCategoryActionPerformed

    private void jComboBoxCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCategoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxCategoryActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCategory;
    private javax.swing.JButton jButtonCourse;
    private javax.swing.JButton jButtonSubmit;
    private javax.swing.JComboBox<String> jComboBoxCategory;
    private javax.swing.JComboBox<String> jComboBoxCourseName;
    private javax.swing.JLabel jLabelCategory;
    private javax.swing.JLabel jLabelCoursename;
    private javax.swing.JLabel jLabelSeatsInCourse;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JLabel jLabelUniversityName;
    private javax.swing.JTextField jTextFieldSeatInCourse;
    private javax.swing.JTextField jTextFieldUniversityName;
    // End of variables declaration//GEN-END:variables
}

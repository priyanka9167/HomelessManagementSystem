/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.CollegeDept;

import Schooling.Model.Courses;
import Schooling.Model.FieldOfInterest;
import Schooling.Model.University;
import Student.Student;
import com.sun.mail.handlers.text_plain;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.Message.RecipientType;
import javax.mail.PasswordAuthentication;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author pikku
 */
public class CollegeDeptAddJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CollegeDeptAddJPanel
     */
    ResultSet rs_course, rs_university, rs_foiId, rs_foi, rs_all_university, rs_all_student, rs_course_id, rs_university_id, rs_seats;
    int student_id;
    String student_email;

    public CollegeDeptAddJPanel(JPanel controlArea, JPanel workArea) {
        initComponents();
        showTable();
        showUniversityTable();

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
        tblStudent = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblUniversity = new javax.swing.JTable();
        btnAssign = new java.awt.Button();
        lblCourse = new java.awt.Label();
        ComboBoxFOI = new javax.swing.JComboBox<>();
        lblFOI1 = new java.awt.Label();
        ComboBoxCourse = new javax.swing.JComboBox<>();
        lblUniversity = new java.awt.Label();
        ComboBoxUniversity = new javax.swing.JComboBox<>();
        btnSave = new java.awt.Button();
        btnFetchUniversity = new java.awt.Button();
        btnFetchCourse1 = new java.awt.Button();

        tblStudent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id", "Firstname", "Lastname", "Gender", "Status"
            }
        ));
        jScrollPane1.setViewportView(tblStudent);

        tblUniversity.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "University", "Course", "Seats"
            }
        ));
        jScrollPane2.setViewportView(tblUniversity);

        btnAssign.setLabel("Assign");
        btnAssign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignActionPerformed(evt);
            }
        });

        lblCourse.setText("Course");

        ComboBoxFOI.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ComboBoxFOI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxFOIActionPerformed(evt);
            }
        });

        lblFOI1.setText("Field");

        ComboBoxCourse.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ComboBoxCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxCourseActionPerformed(evt);
            }
        });

        lblUniversity.setText("University");

        ComboBoxUniversity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnSave.setLabel("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnFetchUniversity.setLabel("Fetch");
        btnFetchUniversity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFetchUniversityActionPerformed(evt);
            }
        });

        btnFetchCourse1.setLabel("Fetch");
        btnFetchCourse1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFetchCourse1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnAssign, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 519, Short.MAX_VALUE)
                        .addComponent(jScrollPane2)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnFetchCourse1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnFetchUniversity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblFOI1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                                .addComponent(ComboBoxFOI, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblUniversity, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ComboBoxUniversity, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ComboBoxCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(32, 32, 32))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ComboBoxFOI, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFOI1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnFetchCourse1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCourse, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ComboBoxCourse, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(9, 9, 9)
                                .addComponent(btnFetchUniversity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ComboBoxUniversity, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblUniversity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(67, 67, 67))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAssign, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAssignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignActionPerformed
        // TODO add your handling code here:

        int selectedRowIndex = tblStudent.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblStudent.getModel();
        populateFieldOfInterest();


    }//GEN-LAST:event_btnAssignActionPerformed

    private void ComboBoxFOIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxFOIActionPerformed
        // TODO add your handling code here:

    }

    private void showCourses(int id) {


    }//GEN-LAST:event_ComboBoxFOIActionPerformed

    private void ComboBoxCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxCourseActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_ComboBoxCourseActionPerformed

    private void btnFetchUniversityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFetchUniversityActionPerformed
        // TODO add your handling code here:
        try {
            if (ComboBoxFOI.getSelectedItem() != null) {
                Courses cs_uni = new Courses();
                rs_course_id = cs_uni.getCourseIdByName(ComboBoxCourse.getSelectedItem().toString());
                ComboBoxUniversity.removeAllItems();

                while (rs_course_id.next()) {
                    University uni = new University();
                    System.out.println(rs_course_id.getInt(1));
                    rs_university = uni.getUniversityByCourseId(rs_course_id.getInt(1));

                    while (rs_university.next()) {

                        ComboBoxUniversity.addItem(rs_university.getString(3));

                    }

                }
            }
        } catch (SQLException ex) {
            ex.getMessage();
        }
    }//GEN-LAST:event_btnFetchUniversityActionPerformed

    private void btnFetchCourse1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFetchCourse1ActionPerformed
        // TODO add your handling code here:
        try {
            FieldOfInterest foi_new = new FieldOfInterest();
            if (ComboBoxFOI.getSelectedItem() != null) {
                rs_foiId = foi_new.getIdByName(ComboBoxFOI.getSelectedItem().toString());
                while (rs_foiId.next()) {
                    Courses cs = new Courses();
                    rs_course = cs.getCourseByCategory(rs_foiId.getInt(1));
                    ComboBoxCourse.removeAllItems();
                    while (rs_course.next()) {
                        ComboBoxCourse.addItem(rs_course.getString(3));
                    }

                }

            }
        } catch (SQLException ex) {
            ex.getMessage();
        }

    }//GEN-LAST:event_btnFetchCourse1ActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblStudent.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblStudent.getModel();
        student_id = Integer.parseInt(model.getValueAt(selectedRowIndex, 0).toString());
        if (!(ComboBoxCourse.getSelectedItem() != null || ComboBoxUniversity.getSelectedItem() != null)) {
            JOptionPane.showMessageDialog(this, "Please select from dropdown");
        } else {
            String course_name = ComboBoxCourse.getSelectedItem().toString();
            String university_name = ComboBoxUniversity.getSelectedItem().toString();
            try {
                Courses cs = new Courses();
                rs_course_id = cs.getCourseIdByName(course_name);

                while (rs_course_id.next()) {
                    int course_id, university_id;
                    course_id = rs_course_id.getInt(1);
                    University uni = new University();
                    rs_university_id = uni.getUniversityIdByName(university_name);
                    student_email = model.getValueAt(selectedRowIndex, 2).toString().toLowerCase() + "." + model.getValueAt(selectedRowIndex, 1).toString().toLowerCase().charAt(0) + "@" + university_name.toLowerCase().split(" ")[0] + ".edu";
                    while (rs_university_id.next()) {
                        university_id = rs_university_id.getInt(1);
                        System.out.println(course_id);
                        System.out.println(university_id);

                        rs_seats = cs.findSeats(course_id, university_id);
                        while (rs_seats.next()) {
                            if (rs_seats.getInt(1) < 1) {
                                JOptionPane.showMessageDialog(this, "No seats Avaliable");
                            } else {
                                uni.updateSeats(course_id, university_id, rs_seats.getInt(1) - 1);
                                Student s_update = new Student();
                                s_update.updateStudentCollege(student_id, course_id, university_id, "Admitted", student_email);
                                showUniversityTable();
                                ComboBoxFOI.removeAllItems();
                                ComboBoxCourse.removeAllItems();
                                ComboBoxUniversity.removeAllItems();
                                System.out.println(student_email);
                                sentEmail(student_email, university_name);
                            }
                        }
                    }

                }

            } catch (SQLException ex) {
                ex.getMessage();
            }
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void showTable() {
        try {
            DefaultTableModel model = (DefaultTableModel) tblStudent.getModel();
            model.setRowCount(0);
            Student student = new Student();
            rs_all_student = student.getStudent();

            while (rs_all_student.next()) {
                Object[] row = new Object[5];

                row[0] = rs_all_student.getInt(1);
                row[1] = rs_all_student.getString(2);
                row[2] = rs_all_student.getString(3);
                row[3] = rs_all_student.getString(6);
                row[4] = rs_all_student.getString(11);

                model.addRow(row);
            }
//            empty all dropdown
            ComboBoxFOI.removeAllItems();
            ComboBoxCourse.removeAllItems();
            ComboBoxUniversity.removeAllItems();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }

    private void sentEmail(String email, String university) {
        try {
            Properties properties = new Properties();
            properties.put("mail.smtp.auth", "true");
            properties.put("mail.smtp.starttls.enable", "true");
            properties.put("mail.smtp.host", "smtp.gmail.com");
            properties.put("mail.smtp.port", "587");
            Session session = Session.getDefaultInstance(properties,
                    new Authenticator() {
                @Override
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication("helpinghomeless.aed@gmail.com", "zhbgmahzmzkuagbi");

                }
            });
            System.out.println(session);
            Message message = new MimeMessage(session);
            message.setSubject("Welcome to" +university+ "");
            message.setContent("Welcome to university", "text/plain");
            message.setFrom(new InternetAddress("helpinghomeless.aed@gmail.com"));
            message.setRecipient(RecipientType.TO, new InternetAddress(email));
            message.setSentDate(new Date());

            Transport.send(message);
            JOptionPane.showMessageDialog(this, "Email Sent");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBoxCourse;
    private javax.swing.JComboBox<String> ComboBoxFOI;
    private javax.swing.JComboBox<String> ComboBoxUniversity;
    private java.awt.Button btnAssign;
    private java.awt.Button btnFetchCourse1;
    private java.awt.Button btnFetchUniversity;
    private java.awt.Button btnSave;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private java.awt.Label lblCourse;
    private java.awt.Label lblFOI1;
    private java.awt.Label lblUniversity;
    private javax.swing.JTable tblStudent;
    private javax.swing.JTable tblUniversity;
    // End of variables declaration//GEN-END:variables

    private void showUniversityTable() {
        try {
            DefaultTableModel model = (DefaultTableModel) tblUniversity.getModel();
            model.setRowCount(0);
            University un = new University();
            rs_all_university = un.getAllUniversityStudent();
            while (rs_all_university.next()) {
                Object[] row = new Object[3];

                row[0] = rs_all_university.getString(4);
                row[1] = rs_all_university.getString(2);
                row[2] = rs_all_university.getInt(5);

                model.addRow(row);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }

    }

    private void populateFieldOfInterest() {
        try {
            FieldOfInterest foi = new FieldOfInterest();
            rs_foi = foi.getallFieldOfInterest();
            ComboBoxFOI.removeAllItems();
            ComboBoxCourse.removeAllItems();
            ComboBoxUniversity.removeAllItems();
            while (rs_foi.next()) {
                ComboBoxFOI.addItem(rs_foi.getString(2));

            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }

    }
}

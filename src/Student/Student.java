/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Student;

import DataConnection.db;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

/**
 *
 * @author pikku
 */
public class Student {

    private int id;
    private String firstname;
    private String lastname;
    private String email;
    private String gender;
    private int age;
    private long contact_no;
    private Date dob;
//    private int university_name; doubt
    private int course_id;
    private String job_status;
    private String education_status;
    private String type;
    private String housing_type;
    private String address;
    private int zipcode;
    private String university_id;
    private String school_id;
    private String university_personal_id;

    public Student(String firstname, String lastname, String gender, int age, long contact_no, Date dob, String address, int zipcode) {
        System.out.println("entered");
        System.out.println(dob);
        this.firstname = firstname;
        this.lastname = lastname;
        this.gender = gender;
        this.age = age;
        this.contact_no = contact_no;
        this.dob = dob;
//        this.type = type;
        this.address = address;
        this.zipcode = zipcode;
        System.out.println("this dob" + this.dob);
    }

    public Student(int id, String firstname, String lastname, String gender, int age, long contact_no, Date dob, String address, int zipcode) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.gender = gender;
        this.age = age;
        this.contact_no = contact_no;
        this.dob = dob;
        this.type = type;
        this.address = address;
        this.zipcode = zipcode;
    }

    public Student() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getContact_no() {
        return contact_no;
    }

    public void setContact_no(long contact_no) {
        this.contact_no = contact_no;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public int getCourse_id() {
        return course_id;
    }

    public void setCourse_id(int course_id) {
        this.course_id = course_id;
    }

    public String getJob_status() {
        return job_status;
    }

    public void setJob_status(String job_status) {
        this.job_status = job_status;
    }

    public String getEducation_status() {
        return education_status;
    }

    public void setEducation_status(String education_status) {
        this.education_status = education_status;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getHousing_type() {
        return housing_type;
    }

    public void setHousing_type(String housing_type) {
        this.housing_type = housing_type;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }

    public String getUniversity_id() {
        return university_id;
    }

    public void setUniversity_id(String university_id) {
        this.university_id = university_id;
    }

    public String getSchool_id() {
        return school_id;
    }

    public void setSchool_id(String school_id) {
        this.school_id = school_id;
    }

    public void addStudent(Student s) throws SQLException {
        try {
            System.out.print("Inside dob");
            System.out.print(s.getDob());
            PreparedStatement ps = db.getPreStatement("Insert into student(firstname,lastname,gender,age,contact_no,dob,address,zipcode,education_status)" + "values (?,?,?,?,?,?,?,?,?)");
            ps.setString(1, s.getFirstname());
            ps.setString(2, s.getLastname());
            ps.setString(3, s.getGender());
            ps.setInt(4, s.getAge());
            ps.setLong(5, s.getContact_no());
            ps.setDate(6, new java.sql.Date(s.getDob().getTime()));
//            ps.setString(7, s.getType());
            ps.setString(7, s.getAddress());
            ps.setInt(8, s.getZipcode());
            ps.setString(9, "Not Admitted");
            ps.execute();
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(e.getMessage() + "Record not saved");
        }

    }

    public ResultSet getStudent() throws SQLException {
        try {
            System.out.print("entered");
            ResultSet resultSet = db.selectQuery("select * from student");
            return resultSet;

        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(e.getMessage() + "Record not found");
        }

    }

    public ResultSet getNotAdmittedStudent() throws SQLException {
        try {
            System.out.print("entered");
            ResultSet resultSet = db.selectQuery("select * from student where education_status = 'Not Admitted'");
            return resultSet;

        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(e.getMessage() + "Record not found");
        }

    }

//    get student by ID
    public ResultSet getStudentById(int id) throws SQLException {
        try {

            ResultSet resultSet = db.selectQuery("select * from student where id = '" + id + "'");
            return resultSet;

        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(e.getMessage() + "Record not found");
        }

    }

//    update student
    public void UpdateStudentById(Student s) throws SQLException {

        try {
            PreparedStatement ps = db.getPreStatement("update student set firstname = ?, lastname = ?,  age = ?, contact_no = ?, dob = ?, address = ?, zipcode = ?,gender = ?  where id = ?");
            ps.setString(1, s.getFirstname());
            ps.setString(2, s.getLastname());
            ps.setInt(3, s.getAge());
            ps.setString(4, String.valueOf(s.getContact_no()));
            ps.setDate(5, new java.sql.Date(s.getDob().getTime()));
            ps.setString(6, s.getAddress());
            ps.setInt(7, s.getZipcode());
            ps.setString(8, s.getGender());
            ps.setInt(9, s.getId());
            ps.execute();
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(e.getMessage() + "Record not saved");
        }

    }

//  delete student
    public void deleteStudent(int id) throws SQLException {
        try {
            PreparedStatement ps = db.getPreStatement("delete from student where id = ?");
            ps.setInt(1, id);
            ps.execute();
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(e.getMessage() + "Record not saved");
        }
    }

    public void updateStudentCollege(int student_id, int course_id, int university_id, String university_personal_id, String status, String email, String password) throws SQLException {
        PreparedStatement ps = db.getPreStatement("update student set course_id = ?, university_id = ? ,university_personal_id = ?, education_status = ? , email = ?, password = ? where id = ?");
        ps.setInt(1, course_id);
        ps.setInt(2, university_id);
        ps.setString(3, university_personal_id);
        ps.setString(4, status);
        ps.setString(5, email);
        ps.setString(6, password);
        ps.setInt(7, student_id);

        ps.execute();
    }

    public ResultSet getAdmittedStudent() throws SQLException {
        try {
            System.out.println("admitted");
            ResultSet rs = db.selectQuery("SELECT s.id,s.firstname,s.lastname,s.gender,s.education_status,u.university_name FROM student as s Left join universities as u ON s.university_id = u.id where s.education_status = 'Admitted' and s.housing_id IS NULL");

            System.out.println(rs);
            return rs;

        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(e.getMessage() + "Record not found");
        }

    }

    public void updateStudentHousing(int student_id, int housing_id, String address, String zipcode) throws SQLException {
        try {
            PreparedStatement ps = db.getPreStatement("update student set housing_id = ? , address = ? , zipcode = ? where id = ?");
            ps.setInt(1, housing_id);
            ps.setString(2, address);
            ps.setString(3, zipcode);
            ps.setInt(4, student_id);
            ps.execute();
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(e.getMessage() + "Record not found");
        }
    }

    public ResultSet getStudentWithFundingPending() throws SQLException {
        try {
            ResultSet rs = db.selectQuery("SELECT s.id,s.firstname,s.lastname,s.gender,s.education_status FROM AED.student as s  where s.education_status = 'Admitted' and s.fund_id IS NULL");
            return rs;
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(e.getMessage() + "Record not found");
        }

    }

    public void updateFundsInStudent(int student_id, int fund_id) throws SQLException {
        try {
            PreparedStatement ps = db.getPreStatement("update student set fund_id = ? where id = ?");
            ps.setInt(1, fund_id);
            ps.setInt(2, student_id);
            ps.execute();
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(e.getMessage() + "Record not found");
        }

    }

    public ResultSet checkLogin(String email, String password) {
        try {

            ResultSet rs = db.selectQuery("select * from student where email = '" + email + "' and password = '" + password + "'");
            return rs;
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(e.getMessage() + "Record not found");
        }

    }

    public void updateStudentFreeLancer(int student_id, int course_id, int freelancer_id, String status, String email, String password) throws SQLException {
        try {
            PreparedStatement ps = db.getPreStatement("update student set course_id = ?, free_lancer_id = ? , education_status = ? , email = ?, password = ? where id = ?");
            ps.setInt(1, course_id);
            ps.setInt(2, freelancer_id);
            ps.setString(3, status);
            ps.setString(4, email);
            ps.setString(5, password);
            ps.setInt(6, student_id);

            ps.execute();
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(e.getMessage() + "Record not found");
        }

    }

    public ResultSet getStudentEducationDetails(String status) {
        try {

            String where_clause = "";
            if (status != "") {
                where_clause = "where s.education_status = '" + status + "' ";
            }

            ResultSet rs = db.selectQuery("SELECT s.firstname,s.lastname,s.education_status, u.university_name,concat(f.first_name, ' ' ,f.last_name) as freelancer_name, c.course_name\n"
                    + "FROM student as s\n"
                    + "Left join universities as u \n"
                    + "on u.id = s.university_id\n"
                    + "Left join course as c\n"
                    + "on c.id = s.course_id\n"
                    + "left join free_lancer as f\n"
                    + "on f.id = s.free_lancer_id\n"
                    + where_clause
            );
            return rs;
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(e.getMessage() + "Record not found");
        }
    }

    public void updateStudentStatus(String firstname, String lastname, String status) throws SQLException {
        try {
            PreparedStatement ps = db.getPreStatement("update student set education_status = ? where firstname = ? and lastname = ?");
            ps.setString(1, status);
            ps.setString(2, firstname);
            ps.setString(3, lastname);
            ps.execute();
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(e.getMessage() + "Record not found");
        }

    }
}

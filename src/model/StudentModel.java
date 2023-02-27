
package model;

import java.util.Date;

public class StudentModel {
    private int id_student;
    private String code_student, ful_name, gender, email, address,class_name;
    private Date date_of_birth;

    public StudentModel() {
    }

    public StudentModel(int id_student, String class_name, String code_student, String ful_name, String gender, String email, String address, Date date_of_birth) {
        this.id_student = id_student;
        this.class_name = class_name;
        this.code_student = code_student;
        this.ful_name = ful_name;
        this.gender = gender;
        this.email = email;
        this.address = address;
        this.date_of_birth = date_of_birth;
    }

    public StudentModel(String class_name, String code_student, String ful_name, String gender, String email, String address, Date date_of_birth) {
        this.class_name = class_name;
        this.code_student = code_student;
        this.ful_name = ful_name;
        this.gender = gender;
        this.email = email;
        this.address = address;
        this.date_of_birth = date_of_birth;
    }

    public String getClass_name() {
        return class_name;
    }

    public void setClass_name(String class_name) {
        this.class_name = class_name;
    }



    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public int getId_student() {
        return id_student;
    }

    public String getCode_student() {
        return code_student;
    }

    public String getFul_name() {
        return ful_name;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public Date getDate_of_birth() {
        return date_of_birth;
    }

    public void setId_student(int id_student) {
        this.id_student = id_student;
    }

    public void setCode_student(String code_student) {
        this.code_student = code_student;
    }

    public void setFul_name(String ful_name) {
        this.ful_name = ful_name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setDate_of_birth(Date date_of_birth) {
        this.date_of_birth = date_of_birth;
    }
    
    
}

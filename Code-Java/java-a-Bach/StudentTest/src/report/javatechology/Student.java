/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package report.javatechology;

/**
 *
 * @author ADMIN
 */

public class Student {

    private String rollNo;
    private String fullName;
    private String grade;
    private Float gpa;
    
    public Student(){}

    public Student(String rollNo,
            String fullName,
            String grade,
            Float gpa) {
        this.rollNo = rollNo;
        this.fullName = fullName;
        this.grade = grade;
        this.gpa = gpa;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public Float getGpa() {
        return gpa;
    }

    public void setGpa(Float gpa) {
        this.gpa = gpa;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package report.javatechology;

import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author ADMIN
 */
public class StudentManage {
    
       @SuppressWarnings("MismatchedQueryAndUpdateOfCollection")
       private ArrayList<Student> listStudents = new ArrayList<Student>();
       static Scanner sc = new Scanner(System.in);
       
       private Student inputStudent(){
           Student std = new Student();
           
           System.out.println("Nhap ma sinh vien: ");
           std.setRollNo(sc.nextLine().trim());
           System.out.println("Nhap ho va ten sinh vien: ");
           std.setFullName(sc.nextLine().trim());
           System.out.println("Nhap lop sinh vien: ");
           std.setGrade(sc.nextLine().trim());
           Float gpa;
           do{
               System.out.println("Nhap diem sinh vien: ");
               gpa = Float.parseFloat(sc.nextLine().trim());
               std.setGpa(gpa);
           }while(gpa<0 || gpa >10);
           
           
           return std;
       }
       
       public Student addStudent(){
           Student stdInput = inputStudent();
           listStudents.add(stdInput);
           
           return stdInput;
       }
       
       public void addStudent(Student std){
           listStudents.add(std);
       }
       

}

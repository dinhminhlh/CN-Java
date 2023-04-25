package com.codejava.practice4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.codejava.practice4.Student.SortStudentByMark;
import com.codejava.practice4.Student.SortStudentByName;

public class StudentManager {
	private List<Student> studentList = new ArrayList<>();
	static Scanner sc = new Scanner(System.in);

	public List<Student> getStudentList() {
		return studentList;
	}

	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	}

	public void addStudent() {
		String choice = "1";
		while(Integer.parseInt(choice) == 1) {
			Student std = new Student();
			std.input();
			studentList.add(std);
			
			System.out.print("Nhan 1 de nhap tiep, phim bat ki de thoat: ");
			choice = sc.nextLine().trim();
		}
	}
	
	public void editStudentById(String id) {
		for(Student s : studentList) {
			if(s.getId().equals(id)) {
				s.input();
			}
		}
	}
	
	public void showStudent() {
		System.out.printf("\n%-5s %-20s %-10s %-10s %-10s", "ID", "Fullname", "Age", "Grade", "Mark");
		for(Student s : studentList) {
			s.display();
		}
	}
	
	public void sortStudentByName() {
		System.out.println("\nSort by name: ");
		Collections.sort(studentList, new SortStudentByName());
	}
	
	public void sortStudentByMark() {
		System.out.println("\nSort by mark: ");
		Collections.sort(studentList, new SortStudentByMark());
	}
}

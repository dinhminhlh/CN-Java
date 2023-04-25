package com.codejava.practice4;

public class Main {
	public static void main(String[] args) {
		StudentManager sm = new StudentManager();
		
		sm.addStudent();
//		sm.editStudentById("1");
		sm.showStudent();
		sm.sortStudentByName();
		sm.showStudent();
		sm.sortStudentByMark();
		sm.showStudent();
	}
}

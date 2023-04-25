package com.codejava.practice4;

import java.util.Comparator;
import java.util.Scanner;

public class Student {
	private String id;
	private String fullName;
	private int age;
	private String grade;
	private double mark;
	static Scanner sc = new Scanner(System.in);
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public double getMark() {
		return mark;
	}
	public void setMark(double mark) {
		this.mark = mark;
	}
		
	public void input() {
		System.out.print("Ma sinh vien: ");
		id = sc.nextLine().trim();
		System.out.print("Ho va ten: ");
		fullName = sc.nextLine().trim();
		do {
			System.out.print("Tuoi: ");
			age = Integer.parseInt(sc.nextLine().trim());
			if(age<18) System.out.println("Tuoi phai tu 18 tro len");
		}while(age<18);
		System.out.print("Lop: ");
		grade = sc.nextLine().trim();
		do {
			System.out.print("Diem: ");
			mark = Double.parseDouble(sc.nextLine().trim());
			if(mark < 0 || mark > 10) System.out.println("Diem phai nam trong khoang [0,10] ");
		}while(mark < 0 || mark > 10);
	}
	
	public void display() {
		System.out.printf("\n%-5s %-20s %-10s %-10s %-10.2f", id, fullName, age, grade, mark);
	}
	
	public static class SortStudentByName implements Comparator<Student>{
		@Override
		public int compare(Student o1, Student o2) {
			return o1.getFullName().compareTo(o2.getFullName());  //ASC
		}
	}
	
	public static class SortStudentByMark implements Comparator<Student>{
		@Override
		public int compare(Student o1, Student o2) {
			return o1.getMark() > o2 .getMark() ? -1 : 0; //DESC
		}
	}
}



package testLinkedList;

import java.util.Scanner;

public class Student {
	private int rollno;
	private String fullName;
	private int birthday;
	private String gender;
	private String homeTown;
	
	public Student() {
		super();
	}

	public Student(int rollno, String fullName, int birthday, String gender, String homeTown) {
		super();
		this.rollno = rollno;
		this.fullName = fullName;
		this.birthday = birthday;
		this.gender = gender;
		this.homeTown = homeTown;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public int getBirthday() {
		return birthday;
	}

	public void setBirthday(int birthday) {
		this.birthday = birthday;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getHomeTown() {
		return homeTown;
	}

	public void setHomeTown(String homeTown) {
		this.homeTown = homeTown;
	}
	
	@SuppressWarnings({ "resource", "unused" })
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ma sinh vien: "); rollno = Integer.parseInt(sc.nextLine());
		System.out.println("Ho va ten: "); fullName = sc.nextLine();
		System.out.println("Gioi tinh: "); gender = sc.nextLine();
		System.out.println("Nam sinh: "); birthday = Integer.parseInt(sc.nextLine());
		System.out.println("Que quan: "); homeTown = sc.nextLine();
	}
	
	public void display() {
		System.out.println("Ma sinh vien: "+getRollno()); 
		System.out.println("Ho va ten: "+getFullName()); 
		System.out.println("Gioi tinh: "+getGender()); 
		System.out.println("Nam sinh: "+getBirthday()); 
		System.out.println("Que quan: "+getHomeTown()); 
	}
//	@SuppressWarnings("unused")
//	public static void main(String[] args) {
//		Student std = new Student();
//		System.out.println("ok");
//		std.input();
//		std.display();
//	}
}



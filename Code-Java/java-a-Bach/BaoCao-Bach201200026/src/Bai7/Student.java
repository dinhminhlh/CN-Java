package Bai7;

import java.util.Comparator;

import library.Date;

public class Student implements Comparable<Student>{
	private String name;
	private String surname;
	private String id;
	private Float GPA;
	private Date dob;
	private String hometown;
	private Float math;
	private Float physic;
	private Float chemistry;
	
	public Student() {
		super();
	}

	public Student(String name, String surName, String id, Float gPA, Date dob, String homeTown) {
		super();
		this.name = name;
		this.surname = surName;
		this.id = id;
		GPA = gPA;
		this.dob = dob;
		this.hometown = homeTown;
	}
	
	public Student(String name, String surname, String id, Float gPA, Date dob, String hometown, Float math,
			Float physic, Float chemistry) {
		super();
		this.name = name;
		this.surname = surname;
		this.id = id;
		GPA = gPA;
		this.dob = dob;
		this.hometown = hometown;
		this.math = math;
		this.physic = physic;
		this.chemistry = chemistry;
	}

	public Student(String std) {
		String[] a = std.split("\\s+");
		name = a[0];
		surname = a[1];
		id = a[2];
		dob = new Date(a[3]);
		hometown = a[4];
		math = Float.parseFloat(a[5]);
		physic = Float.parseFloat(a[6]);
		chemistry = Float.parseFloat(a[7]);
		GPA = getGPA();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	//lay gpa
	public Float getGPA() {
		return (math+physic+chemistry)/3;
	}

	public void setGPA(Float gPA) {
		GPA = gPA;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getHometown() {
		return hometown;
	}

	public void setHometown(String hometown) {
		this.hometown = hometown;
	}
	
	
	public Float getMath() {
		return math;
	}

	public void setMath(Float math) {
		this.math = math;
	}

	public Float getPhysic() {
		return physic;
	}

	public void setPhysic(Float physic) {
		this.physic = physic;
	}

	public Float getChemistry() {
		return chemistry;
	}

	public void setChemistry(Float chemistry) {
		this.chemistry = chemistry;
	}

	public void displayStudent() {
		System.out.printf("\n%-10s %-15s %-20s %-20s %-20s %-8.2f %-8.2f %-8.2f %-8.2f", id, name, surname,
				dob, hometown, math, physic, chemistry, GPA);
	}

	//so sanh ten roi den ho dem
	public static class SortStudentByName implements Comparator<Student> {
		@Override
		public int compare(Student a, Student b) {
			if (a.name.equalsIgnoreCase(b.name)) {
				return a.surname.compareTo(b.surname);
			} else {
				return a.name.compareTo(b.name);
			}
		}
	}
	
	//so sanh que quan roi den ten
	public static class SortStudentByHometown implements Comparator<Student> {
		@Override
		public int compare(Student a, Student b) {
			if (a.hometown.equalsIgnoreCase(b.hometown)) {
				return a.name.compareTo(b.name);
			} else {
				return a.hometown.compareTo(b.hometown);
			}
		}
	}
	
	//so sanh ngay thang nam sinh roi den ten
	public static class SortStudentByAge implements Comparator<Student>{
		@Override
		public int compare(Student a, Student b) {
			if(a.dob.compareTo(b.dob) == 1) {
				return a.name.compareTo(b.name);
			}
			return a.dob.compareTo(b.dob);
		}
		
	}
	
	//xu ly cho topM
	public int compareTo(Student std) {
		return Float.compare(this.GPA, std.GPA);
	}
}

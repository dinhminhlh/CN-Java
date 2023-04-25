package testLinkedList;

import java.util.LinkedList;
import java.util.Scanner;



public class linkedList {
	static LinkedList<Student> list = new LinkedList<Student>();
	
	static Scanner sc = new Scanner(System.in);
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		System.out.println("Nhap so sinh vien can them: ");
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			Student student = new Student();
			student.input();
			list.add(student);
		}
		for(Student std:list) {
			std.display();
		}
	}
}

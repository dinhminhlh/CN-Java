package Bai7;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

import Bai7.Student.SortStudentByAge;
import Bai7.Student.SortStudentByHometown;
import Bai7.Student.SortStudentByName;
import edu.princeton.cs.algs4.StdIn;
import library.MinPQ;

public class StudentSorting {
	List<Student> students = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	
	public void loadData() {
		try {
			System.setIn(new FileInputStream(new File("sinhvientest.txt")));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		while (StdIn.hasNextLine()) {
			String line = StdIn.readLine();
			Student std = new Student(line);
			students.add(std);
		}
	}
	
	public void displayStudents() {
		System.out.printf("%-10s %-15s %-20s %-20s %-20s %-8s %-8s %-8s %-8s", "ID", "Name", "Surname",
												"DoB", "Hometown", "Math", "Physic", "Chemistry", "GPA");
		for (Student std : students) {
			std.displayStudent();
		}
	}

	public void sortSinhVienByName() {
		Collections.sort(students, new SortStudentByName());
	}

	public void sortSinhVienByAge() {
		Collections.sort(students, new SortStudentByAge());
	}

	public void sortSinhVienByHometown() {
		Collections.sort(students, new SortStudentByHometown());
	}

	public void topMByScore() {
		int m;
		System.out.print("Nhap so luong sinh vien: ");
		m = sc.nextInt();
		MinPQ<Student> pq = new MinPQ<Student>(m + 1);
		//lay m sinh vien cao diem nhat dat trong minPQ
		for (Student std : students) {
			pq.insert(std);
			if (pq.size() > m)
				pq.delMin();
		}
		//truyen minPQ vao stack
		Stack<Student> stack = new Stack<Student>();
		for (Student std : pq) {
			stack.push(std);
		}
		//in cac sinh vien trong stack
		System.out.printf("%-10s %-15s %-20s %-20s %-20s %-8s %-8s %-8s %-8s", "ID", "Name", "Surname",
				"DoB", "Hometown", "Math", "Physic", "Chemistry", "GPA");
		while (!stack.isEmpty()) {
			stack.peek().displayStudent();
			stack.pop();
		}
	}
}

package bai8;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import edu.princeton.cs.algs4.StdIn;
import library.BST;

public class StudentBST {
	private List<Student> students = new ArrayList<Student>();
	private BST<String, Student> bstById = new BST<String, Student>();
	private BST<String, Student> bstByPhone = new BST<String, Student>();
	
	public StudentBST() {
		loadData();
		fillDataIntoBST();
	}
	
	private void loadData() {
		try {
			System.setIn(new FileInputStream(new File("studentbst.csv")));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		while (StdIn.hasNextLine()) {
			String line = StdIn.readLine();
			Student std = new Student(line);
			students.add(std);
		}
	}
	
	private void fillDataIntoBST() {
		for(Student std : students) {
			String keyId = std.getId();
			String keyPhone = std.getPhone();
			
			bstById.put(keyId, std);
			bstByPhone.put(keyPhone, std);
		}
	}
	
	public void display() {
		System.out.printf("\n%-5s %-20s %-20s %-40s %-12s %-20s ","ID", "Firstname", "Lastname", "Email", "Gender", "Phone");
		for(Student std : students) {
			std.display();
		}
	}
	
	public void findStudentById(String id) {
		if(bstById.get(id)==null) {
			System.err.print("\nKhong ton tai id ban muon tim");
			return;
		}
		bstById.get(id).display();;
	}
	
	public void findStudentByPhone(String phone) {
		if(bstByPhone.get(phone)==null) {
			System.err.print("\nKhong ton tai so dien thoai ban muon tim");
			return;
		}
		bstByPhone.get(phone).display();;
	}
	
}

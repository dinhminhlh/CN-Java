package report.studentsorting.model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

import edu.princeton.cs.algs4.StdIn;
import report.studentsorting.library.MinPQ;
import report.studentsorting.model.SinhVien.Age;
import report.studentsorting.model.SinhVien.Hometown;

public class SinhVienImpl {
	List<SinhVien> listSinhVien = new ArrayList<SinhVien>();
	Scanner sc = new Scanner(System.in);

	public void readData() {
		try {
			System.setIn(new FileInputStream(new File("sinhvientest.txt")));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		while (StdIn.hasNextLine()) {
			String line = StdIn.readLine();
			SinhVien sv = new SinhVien(line);
			listSinhVien.add(sv);
		}
	}

	public void displaySinhVien() {
		for (SinhVien x : listSinhVien) {
			System.out.println(x);
		}
	}

	public void sortSinhVienByName() {
		Collections.sort(listSinhVien);
	}

	public void sortSinhVienByAge() {
		Collections.sort(listSinhVien, new Age());
	}

	public void sortSinhVienByHometown() {
		Collections.sort(listSinhVien, new Hometown());
	}

	public void topMByScore() {
		int m;
		System.out.print("Nhap so luong sinh vien: ");
		m = sc.nextInt();
		MinPQ<SinhVien> pq = new MinPQ<SinhVien>(m + 1);

		for (SinhVien x : listSinhVien) {
			pq.insert(x);
			if (pq.size() > m)
				pq.delMin();
		}
		
		Stack<SinhVien> stack = new Stack<SinhVien>();
		for (SinhVien x : pq)
			stack.push(x);
		while (!stack.isEmpty()) {
			System.out.println(stack.peek());
			stack.pop();
		}

	}

}

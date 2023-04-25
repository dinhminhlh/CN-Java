package report.studentsorting.controller;

import report.studentsorting.model.SinhVienImpl;

public class Main {
	public static void main(String[] args) {
		SinhVienImpl SinhVienImpl = new SinhVienImpl();

		SinhVienImpl.readData();
		SinhVienImpl.displaySinhVien();

		System.out.println("--------Sort by name--------");
		SinhVienImpl.sortSinhVienByName();
		SinhVienImpl.displaySinhVien();
		System.out.println("--------Sort by age--------");
		SinhVienImpl.sortSinhVienByAge();
		SinhVienImpl.displaySinhVien();
		System.out.println("--------Sort by hometown--------");
		SinhVienImpl.sortSinhVienByHometown();
		SinhVienImpl.displaySinhVien();
		System.out.println("--------TopM by score--------");
		SinhVienImpl.topMByScore();
	}
}

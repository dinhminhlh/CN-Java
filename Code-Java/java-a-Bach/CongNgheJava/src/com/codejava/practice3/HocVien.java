package com.codejava.practice3;

import java.util.Scanner;

public class HocVien {
	private String maSo;
	private String hoTen;
	private int tuoi;
	static Scanner sc = new Scanner(System.in);
	public HocVien() {}
	
	public HocVien(String maSo, String hoTen, int tuoi) {
		super();
		this.maSo = maSo;
		this.hoTen = hoTen;
		this.tuoi = tuoi;
	}

	public String getMaSo() {
		return maSo;
	}

	public void setMaSo(String maSo) {
		this.maSo = maSo;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public int getTuoi() {
		return tuoi;
	}

	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}
	
	public void input() {
		System.out.print("Nhap ma hoc vien: ");
		maSo = sc.nextLine().trim();
		System.out.print("Nhap ten hoc vien: ");
		hoTen = sc.nextLine().trim();

		do {
			System.out.print("Nhap tuoi hoc vien: ");
			tuoi = Integer.parseInt(sc.nextLine().trim());
			if(tuoi <= 0) {
				System.out.println("Nhap lai tuoi!!!");
			}
		}while(tuoi<=0);
	}
	
	public void display() {
		System.out.print("Ma hoc vien: " + maSo +"\n");
		System.out.print("Ten hoc vien: " + hoTen +"\n");
		System.out.print("Tuoi hoc vien: " + tuoi +"\n");
	}
	
	public static void main(String[] args) {
		HocVien hocVien = new HocVien();
		hocVien.input();
		hocVien.display();
	}
		
}

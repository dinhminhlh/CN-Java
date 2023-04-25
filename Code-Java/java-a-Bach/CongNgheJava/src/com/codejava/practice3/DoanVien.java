package com.codejava.practice3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DoanVien {
	private String hoTen;
	private String chiDoan;
	private int diemXL;
	static Scanner sc = new Scanner(System.in);
	
	public DoanVien() {
		
	}
	
	public DoanVien(String hoTen, String chiDoan, int diemXL) {
		super();
		this.hoTen = hoTen;
		this.chiDoan = chiDoan;
		this.diemXL = diemXL;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getChiDoan() {
		return chiDoan;
	}

	public void setChiDoan(String chiDoan) {
		this.chiDoan = chiDoan;
	}

	public int getDiemXL() {
		return diemXL;
	}

	public void setDiemXL(int diemXL) {
		this.diemXL = diemXL;
	}
	
	public void input() {
		System.out.print("Nhap ma chi doan: ");
		chiDoan = sc.nextLine().trim();
		System.out.print("Nhap ten doan vien: ");
		hoTen = sc.nextLine().trim();
		do {
			System.out.print("Nhap tuoi hoc vien: ");
			diemXL = Integer.parseInt(sc.nextLine().trim());
			if(diemXL <= 0) {
				System.out.println("Nhap lai tuoi!!!");
			}
		}while(diemXL<=0);
	}
	
	public void display() {
		System.out.print("Ten chi doan: "+chiDoan+"\n");
		System.out.print("Ten doan vien: "+hoTen+"\n");
		System.out.print("Diem xep loai: "+diemXL+"\n");
	}
	
	public DoanVien filterDiemXL(int x) {
		if(this.diemXL >= x) {
			this.display();
		}
		return this;
	}
	public static void main(String[] args) {
		int n;
		do {
			System.out.print("Nhap so doan vien: ");
			n = Integer.parseInt(sc.nextLine().trim());
			if(n < 0) {
				System.out.println("Nhap lai so doan vien!!!");
			}
		}while(n<0);
		
		List<DoanVien> list = new ArrayList<>();
		for(int i=0;i<n;i++) {
			DoanVien doanVien = new DoanVien();
			doanVien.input();
			list.add(doanVien);
		}
		System.out.println("Danh sach doan vien co diem xep loai >= 8: ");
		for(DoanVien x : list) {
			x.filterDiemXL(8);
		}
	}
}

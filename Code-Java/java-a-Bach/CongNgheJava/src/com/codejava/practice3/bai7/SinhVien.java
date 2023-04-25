package com.codejava.practice3.bai7;

import java.util.ArrayList;
import java.util.List;

public class SinhVien extends Nguoi{
	private Float diemThi;
	private String lop;
	
	
	public SinhVien() {
		
	}
	
	public SinhVien(Float diemThi, String lop, String hoTen, String gioiTinh, String ngaySinh) {
		super(hoTen,gioiTinh,ngaySinh);
		this.diemThi = diemThi;
		this.lop = lop;
	}

	public Float getDiemThi() {
		return diemThi;
	}

	public void setDiemThi(Float diemThi) {
		this.diemThi = diemThi;
	}

	public String getLop() {
		return lop;
	}

	public void setLop(String lop) {
		this.lop = lop;
	}

	@Override
	public void input() {
		super.input();
		do {
			System.out.print("Diem thi: ");
			diemThi = Float.parseFloat(sc.nextLine().trim());
			if(diemThi<0) {
				System.out.println("Nhap lai!!!");
			}
		}while(diemThi<0);
		System.out.print("Lop hoc: ");
		lop = sc.nextLine().trim();
	}
	
	@Override
	public void display() {
		super.display();
		System.out.print("Diem thi: "+diemThi+"\n");
		System.out.print("Lop hoc: "+lop+"\n");
	}
	
	public static void main(String[] args) {
		Integer n;
		do {
			System.out.print("Nhap sinh vien: ");
			n = Integer.parseInt(sc.nextLine().trim());
			if(n <= 0) {
				System.out.println("Nhap lai !!!");
			}
		}while(n <= 0);
		
		List<SinhVien> list = new ArrayList<>();
		for(int i=0;i<n;i++) {
			SinhVien sinhVien = new SinhVien();
			sinhVien.input();
			list.add(sinhVien);
		}
		
		for(SinhVien x : list) {
			x.display();
		}
	}
	
}

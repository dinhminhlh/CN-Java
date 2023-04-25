package com.codejava.practice3.bai11;

import java.util.ArrayList;
import java.util.List;


public class SinhVien extends Nguoi{
	private float diemThi;
	private String lop;
	
	public SinhVien() {
		
	}
	
	public SinhVien(String hoTen, String ngaySinh, String gioiTinh, float diemThi, String lop) {
		super(hoTen, ngaySinh, gioiTinh);
		this.diemThi = diemThi;
		this.lop = lop;
	}



	public float getDiemThi() {
		return diemThi;
	}

	public void setDiemThi(float diemThi) {
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
		
		System.out.print("Nhap ten sinh vien: ");
		String name = sc.nextLine().trim();
		int count = 0;
		ArrayList<SinhVien> listByName = new ArrayList<>();
		for(SinhVien x : list) {
			if(x.getHoTen().equals(name)) {
				listByName.add(x);
			}
			if(x.getDiemThi()>8) {
				count++;
			}
		}
		
		for(SinhVien x:listByName) {
			x.display();
		}
		
		System.out.print("So sinh vien dat loai gioi la: "+count);
		
	}
}

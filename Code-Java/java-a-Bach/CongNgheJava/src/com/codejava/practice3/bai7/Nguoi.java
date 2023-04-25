package com.codejava.practice3.bai7;

import java.util.Scanner;

public class Nguoi {
	private String hoTen;
	private String gioiTinh;
	private String ngaySinh;
	static Scanner sc = new Scanner(System.in);
	
	public Nguoi() {
		
	}
	
	public Nguoi(String hoTen, String gioiTinh, String ngaySinh) {
		super();
		this.hoTen = hoTen;
		this.gioiTinh = gioiTinh;
		this.ngaySinh = ngaySinh;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public String getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(String ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	
	public void input() {
		System.out.print("Nhap ho ten");
		hoTen = sc.nextLine().trim();
		System.out.print("Nhap gioi tinh");
		gioiTinh = sc.nextLine().trim();
		System.out.print("Nhap ngay sinh");
		ngaySinh = sc.nextLine().trim();
	}
	
	public void display() {
		System.out.print("Ho ten: "+hoTen+"\n");
		System.out.print("Gioi tinh: "+gioiTinh+"\n");
		System.out.print("Ngay sinh: "+ngaySinh+"\n");
	}
}

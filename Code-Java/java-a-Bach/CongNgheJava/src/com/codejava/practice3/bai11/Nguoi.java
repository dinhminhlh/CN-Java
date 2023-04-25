package com.codejava.practice3.bai11;


import java.util.Scanner;

public class Nguoi {
	private String hoTen;
	private String ngaySinh;
	private String gioiTinh;
	static Scanner sc = new Scanner(System.in);
	
	public Nguoi() {
		
	}
	
	public Nguoi(String hoTen, String ngaySinh, String gioiTinh) {
		super();
		this.hoTen = hoTen;
		this.ngaySinh = ngaySinh;
		this.gioiTinh = gioiTinh;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(String ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	
	public String getGioiTinh() {
		return gioiTinh;
	}
	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	public void input() {
		System.out.print("Nhap ho ten: ");
		hoTen = sc.nextLine().trim();
		System.out.print("Nhap gioi tinh: ");
		gioiTinh = sc.nextLine().trim();
		System.out.print("Nhap ngay sinh: ");
		ngaySinh = sc.nextLine().trim();
	}
	
	public void display() {
		System.out.print("Ho ten: "+hoTen+"\n");
		System.out.print("Gioi tinh: "+gioiTinh+"\n");
		System.out.print("Ngay sinh: "+ngaySinh+"\n");
	}

	@Override
	public String toString() {
		return "Nguoi [hoTen=" + hoTen + ", ngaySinh=" + ngaySinh + ", gioiTinh=" + gioiTinh + "]";
	}
	
	
}

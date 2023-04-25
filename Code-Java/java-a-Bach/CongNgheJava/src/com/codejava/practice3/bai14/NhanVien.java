package com.codejava.practice3.bai14;

import java.util.Scanner;

public class NhanVien {
	private String hoTen;
	private String cmnd;
	private String phongBan;
	static Scanner sc = new Scanner(System.in);
	
	public NhanVien() {
		
	}
	
	public NhanVien(String hoTen, String cmnd, String phongBan) {
		super();
		this.hoTen = hoTen;
		this.cmnd = cmnd;
		this.phongBan = phongBan;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getCmnd() {
		return cmnd;
	}

	public void setCmnd(String cmnd) {
		this.cmnd = cmnd;
	}

	public String getPhongBan() {
		return phongBan;
	}

	public void setPhongBan(String phongBan) {
		this.phongBan = phongBan;
	}
	
	public void input() {
		System.out.print("Nhap ho va ten: ");
		hoTen = sc.nextLine().trim();
		System.out.print("Nhap CMND: ");
		cmnd = sc.nextLine().trim();
		System.out.print("Nhap phong ban: ");
		phongBan = sc.nextLine().trim();
	}
	public void display() {
		System.out.print("Ho va ten: "+hoTen+"\n");
		System.out.print("CMND: "+cmnd+"\n");
		System.out.print("Phong ban: "+phongBan+"\n");
	}
}

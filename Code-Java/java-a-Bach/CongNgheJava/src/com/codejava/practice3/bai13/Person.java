package com.codejava.practice3.bai13;

import java.util.Scanner;

public class Person {
	private String hoTen;
	private String ngaySinh;
	private String queQuan;
	static Scanner sc = new Scanner(System.in);
	
	
	
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
	public String getQueQuan() {
		return queQuan;
	}
	public void setQueQuan(String queQuan) {
		this.queQuan = queQuan;
	}
	
	public void input() {
		System.out.print("Nhap ho ten: ");
		hoTen = sc.nextLine().trim();
		System.out.print("Nhap que quan: ");
		queQuan = sc.nextLine().trim();
		System.out.print("Nhap ngay sinh: ");
		ngaySinh = sc.nextLine().trim();
	}
	
	public void display() {
		System.out.print("Ho ten: "+hoTen+"\n");
		System.out.print("Que quan: "+queQuan+"\n");
		System.out.print("Ngay sinh: "+ngaySinh+"\n");
	}
}

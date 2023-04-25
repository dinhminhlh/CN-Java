package com.codejava.practice3.bai10;

import java.util.Scanner;

public class May {
	private String nhanHieu;
	private String nhaSanXuat;
	private double giaThanh;
	static Scanner sc = new Scanner(System.in);
	
	public May(){
	}

	public May(String nhanHieu, String nhaSanXuat, double giaThanh) {
		super();
		this.nhanHieu = nhanHieu;
		this.nhaSanXuat = nhaSanXuat;
		this.giaThanh = giaThanh;
	}

	public String getNhanHieu() {
		return nhanHieu;
	}

	public void setNhanHieu(String nhanHieu) {
		this.nhanHieu = nhanHieu;
	}

	public String getNhaSanXuat() {
		return nhaSanXuat;
	}

	public void setNhaSanXuat(String nhaSanXuat) {
		this.nhaSanXuat = nhaSanXuat;
	}

	public double getGiaThanh() {
		return giaThanh;
	}

	public void setGiaThanh(double giaThanh) {
		this.giaThanh = giaThanh;
	}
	
	public void input() {
		System.out.print("Nhap nhan hieu: ");
		nhanHieu = sc.nextLine().trim();
		System.out.print("Nhap nha san xuat: ");
		nhaSanXuat = sc.nextLine().trim();
		
		System.out.print("Nhap gia: ");
		do {
			System.out.print("Nhap gia xe: ");
			giaThanh = Double.parseDouble(sc.nextLine().trim());
			if(giaThanh<0) {
				System.out.print("Nhap lai!!! ");
			}
		}while(giaThanh<0);
	}
	public void display() {
		System.out.print("Nhan hieu: "+nhanHieu+"\n");
		System.out.print("Nha san xuat: "+nhaSanXuat+"\n");
		System.out.print("Gia thanh: "+giaThanh+"\n");
	}
}

package com.codejava.practice3.bai9;

import java.util.Scanner;

public class Xe {
	private String nhanHieu;
	private double gia;
	private int namSanXuat;
	static Scanner sc = new Scanner(System.in);
	
	public Xe(String nhanHieu, double gia, int namSanXuat) {
		super();
		this.nhanHieu = nhanHieu;
		this.gia = gia;
		this.namSanXuat = namSanXuat;
	}

	public Xe() {
		// TODO Auto-generated constructor stub
	}

	public String getNhanHieu() {
		return nhanHieu;
	}

	public void setNhanHieu(String nhanHieu) {
		this.nhanHieu = nhanHieu;
	}

	public double getGia() {
		return gia;
	}

	public void setGia(double gia) {
		this.gia = gia;
	}

	public int getNamSanXuat() {
		return namSanXuat;
	}

	public void setNamSanXuat(int namSanXuat) {
		this.namSanXuat = namSanXuat;
	}
}

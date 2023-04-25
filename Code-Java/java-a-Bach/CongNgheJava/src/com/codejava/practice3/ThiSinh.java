package com.codejava.practice3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ThiSinh {
	private String soBaoDanh;
	private String tenThiSinh;
	private float m1;
	private float m2;
	private float m3;
	static Scanner sc = new Scanner(System.in);

	public String getSoBaoDanh() {
		return soBaoDanh;
	}

	public void setSoBaoDanh(String soBaoDanh) {
		this.soBaoDanh = soBaoDanh;
	}

	public String getTenThiSinh() {
		return tenThiSinh;
	}

	public void setTenThiSinh(String tenThiSinh) {
		this.tenThiSinh = tenThiSinh;
	}

	public float getM1() {
		return m1;
	}

	public void setM1(float m1) {
		this.m1 = m1;
	}

	public float getM2() {
		return m2;
	}

	public void setM2(float m2) {
		this.m2 = m2;
	}

	public float getM3() {
		return m3;
	}

	public void setM3(float m3) {
		this.m3 = m3;
	}

	public void input() {
		System.out.print("Nhap so bao danh: ");
		soBaoDanh = sc.nextLine();
		System.out.print("Nhap ten thi sinh: ");
		tenThiSinh = sc.nextLine();
		do {
			System.out.print("Nhap diem mon 1: ");
			m1 = Float.parseFloat(sc.nextLine().trim());
			if (m1 < 0) {
				System.out.println("Nhap lai diem!!!");
			}
		} while (m1 < 0);
		do {
			System.out.print("Nhap diem mon 2: ");
			m2 = Float.parseFloat(sc.nextLine().trim());
			if (m2 < 0) {
				System.out.println("Nhap lai diem!!!");
			}
		} while (m2 < 0);
		do {
			System.out.print("Nhap diem mon 3: ");
			m3 = Float.parseFloat(sc.nextLine().trim());
			if (m3 < 0) {
				System.out.println("Nhap lai diem!!!");
			}
		} while (m3 < 0);
	}

	public void display() {
		System.out.print("So bao danh: " + soBaoDanh + "\n");
		System.out.print("Ten thi sinh: " + tenThiSinh + "\n");
		System.out.printf("Diem cac mon m1, m2, m3: %.2f,%.2f,%.2f", m1, m2, m3 + "\n");
	}
	public void checkPoint(float x) {
		if(m1+m2+m3>x) {
			display();
		}
	}
	public float getPoint() {
		return m1+m2+m3;
	}
	public static void main(String[] args) {
		int n;
		do {
			System.out.print("Nhap so thi sinh: ");
			n = Integer.parseInt(sc.nextLine().trim());
			if(n <= 0) {
				System.out.println("Nhap lai so thi sinh!!!");
			}
		}while(n <= 0);
		
		List<ThiSinh> list = new ArrayList<>();
		for(int i=0;i<n;i++) {
			ThiSinh thiSinh = new ThiSinh();
				thiSinh.input();
				list.add(thiSinh);
		}
		int point = Integer.parseInt(sc.nextLine().trim());
		System.out.println("==============================================");
		System.out.print("Nhap diem chuan: ");
		for(ThiSinh x : list) {
			x.checkPoint(point);
		}
	}
}

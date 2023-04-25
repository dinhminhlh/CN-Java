package com.codejava.practice3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Sach implements Comparable<Sach>{
	private String tenSach;
	private String tacGia;
	private int soLuong;
	private int namXuatBan;
	static Scanner sc = new Scanner(System.in);
	
	public Sach() {
		super();
	}

	public Sach(String tenSach, String tacGia, int soLuong, int namXuatBan) {
		super();
		this.tenSach = tenSach;
		this.tacGia = tacGia;
		this.soLuong = soLuong;
		this.namXuatBan = namXuatBan;
	}

	public String getTenSach() {
		return tenSach;
	}

	public void setTenSach(String tenSach) {
		this.tenSach = tenSach;
	}

	public String getTacGia() {
		return tacGia;
	}

	public void setTacGia(String tacGia) {
		this.tacGia = tacGia;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

	public int getNamXuatBan() {
		return namXuatBan;
	}

	public void setNamXuatBan(int namXuatBan) {
		this.namXuatBan = namXuatBan;
	}
	
	public void input() {
		System.out.print("Nhap ten sach: ");
		tenSach = sc.nextLine();
		System.out.print("Nhap ten tac gia: ");
		tacGia = sc.nextLine();
		do {
			System.out.print("Nhap so luong: ");
			soLuong = Integer.parseInt(sc.nextLine().trim());
			if(soLuong < 0) {
				System.out.println("Nhap lai so luong!!!");
			}
		}while(soLuong<0);
		do {
			System.out.print("Nhap nam xuat ban: ");
			namXuatBan = Integer.parseInt(sc.nextLine().trim());
			if(namXuatBan < 0) {
				System.out.println("Nhap lai nam xuat ban!!!");
			}
		}while(namXuatBan < 0);
	}
	
	public void display() {
		System.out.print("Ten sach: "+tenSach+"\n");
		System.out.print("Ten tac gia: "+tacGia+"\n");
		System.out.print("Nam xuat ban: "+namXuatBan+"\n");
		System.out.print("So luong: "+soLuong+"\n");
	}
	public void checkPublish(int x) {
		if(this.namXuatBan>x) {
			this.display();
		}
	}
	@Override
	public int compareTo(Sach o) {
		//return soLuong > o.soLuong ? 0 : -1;	//ASC
		return soLuong > o.soLuong ? -1 : 0;	//DESC
	}

	public static void main(String[] args) {
		Integer n;
		do {
			System.out.print("Nhap so dau sach: ");
			n = Integer.parseInt(sc.nextLine().trim());
			if(n <= 0) {
				System.out.println("Nhap lai so dau sach!!!");
			}
		}while(n <= 0);
		
		List<Sach> list = new ArrayList<>();
		for(int i=0;i<n;i++) {
			Sach sach = new Sach();
			sach.input();
			list.add(sach);
		}
		
		Collections.sort(list);
		System.out.println("==================================");
		for(Sach x : list) {
			x.display();
		}
		System.out.println("==================================");
		for(Sach x : list) {
			x.checkPublish(2020);
		}
	}
}

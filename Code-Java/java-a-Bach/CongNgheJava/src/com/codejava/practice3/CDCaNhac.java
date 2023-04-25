package com.codejava.practice3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CDCaNhac implements Comparable<CDCaNhac>{
	private String tenDia;
	private Float giaTien;
	private Integer soBai;
	static Scanner sc = new Scanner(System.in);
	
	public CDCaNhac() {
		super();
	}

	public String getTenDia() {
		return tenDia;
	}

	public void setTenDia(String tenDia) {
		this.tenDia = tenDia;
	}

	public Float getGiaTien() {
		return giaTien;
	}

	public void setGiaTien(Float giaTien) {
		this.giaTien = giaTien;
	}

	public Integer getSoBai() {
		return soBai;
	}

	public void setSoBai(Integer soBai) {
		this.soBai = soBai;
	}

	@Override
	public int compareTo(CDCaNhac o) {
		return soBai > o.soBai ? -1 : 0;
	}
	
	public void input() {
		System.out.print("Nhap ten dia: ");
		tenDia = sc.nextLine();
		do {
			System.out.print("Nhap so bai: ");
			soBai = Integer.parseInt(sc.nextLine().trim());
			if(soBai < 0) {
				System.out.println("Nhap lai so bai!!!");
			}
		}while(soBai<0);
		do {
			System.out.print("Nhap gia tien: ");
			giaTien = Float.parseFloat(sc.nextLine().trim());
			if(giaTien < 0) {
				System.out.println("Nhap lai nam gia tien!!!");
			}
		}while(giaTien < 0);
	}
	
	public void display() {
		System.out.print("Ten dia: "+tenDia+"\n");
		System.out.print("So bai: "+soBai+"\n");
		System.out.print("Gia tien: "+giaTien+"\n");
	}
	
	public static void main(String[] args) {
		int n;
		do {
			System.out.print("Nhap so dia: ");
			n = Integer.parseInt(sc.nextLine().trim());
			if(n <= 0) {
				System.out.println("Nhap lai so dia!!!");
			}
		}while(n <= 0);
		
		List<CDCaNhac> list = new ArrayList<>();
		for(int i=0;i<n;i++) {
			CDCaNhac cdCaNhac = new CDCaNhac();
			cdCaNhac.input();
			list.add(cdCaNhac);
		}
		Collections.sort(list);
		
		for(CDCaNhac x : list) {
			x.display();
		}
	}
}

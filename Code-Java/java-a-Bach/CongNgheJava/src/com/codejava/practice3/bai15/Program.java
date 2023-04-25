package com.codejava.practice3.bai15;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
	static Scanner sc = new Scanner(System.in);
	
	private static void HV() {
		Integer n;
		do {
			System.out.print("Nhap so hinh vuong: ");
			n = Integer.parseInt(sc.nextLine().trim());
			if(n <= 0) {
				System.out.println("Nhap lai !!!");
			}
		}while(n <= 0);
		
		List<HinhVuong> list = new ArrayList<>();
		for(int i=0;i<n;i++) {
			HinhVuong hv = new HinhVuong();
			hv.input();
			list.add(hv);
		}
		
		for(int i=0;i<n;i++) {
			System.out.println("Hinh vuong thu "+(i+1)+" co canh a = "+list.get(i).getA());
			System.out.println("Chu vi: "+list.get(i).tinhChuVi());
			System.out.println("Dien tich: "+list.get(i).tinhDienTich() +"\n\n");
		}
		
	}
	
	private static void CN() {
		Integer n;
		do {
			System.out.print("Nhap so hinh chu nhat: ");
			n = Integer.parseInt(sc.nextLine().trim());
			if(n <= 0) {
				System.out.println("Nhap lai !!!");
			}
		}while(n <= 0);
		
		List<HinhCN> list = new ArrayList<>();
		for(int i=0;i<n;i++) {
			HinhCN hcn = new HinhCN();
			hcn.input();
			list.add(hcn);
		}
		
		for(int i=0;i<n;i++) {
			System.out.println("Hinh chu nhat thu "+(i+1)+" co canh a = "+list.get(i).getA() +", b = "+list.get(i).getB());
			System.out.println("Chu vi: "+list.get(i).tinhChuVi());
			System.out.println("Dien tich: "+list.get(i).tinhDienTich() +"\n\n");
		}
	}
	
	private static void HCN() {
		Integer n;
		do {
			System.out.print("Nhap so hinh hop chu nhat: ");
			n = Integer.parseInt(sc.nextLine().trim());
			if(n <= 0) {
				System.out.println("Nhap lai !!!");
			}
		}while(n <= 0);
		
		List<HinhHCN> list = new ArrayList<>();
		for(int i=0;i<n;i++) {
			HinhHCN hcn = new HinhHCN();
			hcn.input();
			list.add(hcn);
		}
		
		for(int i=0;i<n;i++) {
			System.out.println("Hinh hop chu nhat thu "+(i+1)+" co canh a = "+list.get(i).getA() +", b = "+list.get(i).getB() + ", c = " +list.get(i).getC());
			System.out.println("The tich: "+list.get(i).tinhTheTich());
		}
	}
	
	private static void LP() {
		Integer n;
		do {
			System.out.print("Nhap so hinh lap phuong: ");
			n = Integer.parseInt(sc.nextLine().trim());
			if(n <= 0) {
				System.out.println("Nhap lai !!!");
			}
		}while(n <= 0);
		
		List<HinhLP> list = new ArrayList<>();
		for(int i=0;i<n;i++) {
			HinhLP hlp = new HinhLP();
			hlp.input();
			list.add(hlp);
		}
		
		for(int i=0;i<n;i++) {
			System.out.println("Hinh hop chu nhat thu "+(i+1)+" co canh a = "+list.get(i).getA());
			System.out.println("The tich: "+list.get(i).tinhTheTich());
		}
	}
	
	
	public static void main(String[] args) {
		HV();
		CN();
		LP();
		HCN();
		
	}
}

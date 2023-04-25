package com.codejava.practice3.bai14;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		Integer n;
		do {
			System.out.print("Nhap nhan vien: ");
			n = Integer.parseInt(sc.nextLine().trim());
			if(n <= 0) {
				System.out.println("Nhap lai !!!");
			}
		}while(n <= 0);
		
		List<NhanVien> list = new ArrayList<>();
		
		for(int i=0;i<n;i++) {
			int choose;
			System.out.println("Chon: \n1. Bien che\n2. Hop dong");
			do {
				System.out.print("Nhap lua chon: ");
				choose = Integer.parseInt(sc.nextLine().trim());
				if(choose != 1 || choose !=2) {
					System.out.println("Nhap lai !!!");
				}
			}while(choose != 1 || choose !=2);
			
			if(choose == 1) {
				NhanVien nv = new BienChe();
				list.add(nv);
			}
			else {
				NhanVien nv = new HopDong();
				list.add(nv);
			}
		}
		float max = 0, i=0;
		
		for(NhanVien x : list) {
			if(((HopDong) x).getSoGio()>max) {
				max = ((HopDong) x).getSoGio();
				i++;
			}
		}
		
		list.get((int) i).display();;
	}
}

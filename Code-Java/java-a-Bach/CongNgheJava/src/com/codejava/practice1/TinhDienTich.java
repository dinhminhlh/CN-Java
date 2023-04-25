package com.codejava.practice1;

import java.util.Scanner;

public class TinhDienTich {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int a, b;
		do {
			System.out.print("Nhap canh thu nhat: ");
			a = Integer.parseInt(sc.nextLine().trim());
			System.out.print("Nhap canh thu hai: ");
			b = Integer.parseInt(sc.nextLine().trim());
		}while(a<0 && b<0);
		
		System.out.printf("Dien tich: %d",a*b);
		System.out.printf("\nChu vi: %d",(a+b)*2);
	}
}

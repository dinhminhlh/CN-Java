package com.codejava.practice1;

import java.util.Scanner;

public class Bai17 {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		for(int i=2;i<10;i++) {
			for(int j=1;j<=10;j++) {
				System.out.printf("\n%d * %d = %d",i,j,i*j);
			}
			System.out.println();
		}
		
		System.out.print("Nhap k: ");
		int k = Integer.parseInt(sc.nextLine().trim());
		
		for(int i=1;i<=10;i++) {
			System.out.printf("\n%d * %d = %d",k,i,i*k);
		}
	}
	
	
}

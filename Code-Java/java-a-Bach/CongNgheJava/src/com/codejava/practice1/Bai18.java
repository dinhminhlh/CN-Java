package com.codejava.practice1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bai18 {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.print("Nhap so phan tu: ");
		int n = Integer.parseInt(sc.nextLine().trim());
		
		List<Integer> list = new ArrayList<Integer>();
		
		System.out.print("Nhap day: ");
		for(int i=0;i<n;i++) {
			int a = Integer.parseInt(sc.nextLine().trim());
			list.add(a);
		}
		System.out.print("Nhap so x: ");
		int x = Integer.parseInt(sc.nextLine().trim());
		int count = 0;
		for(int i=0;i<n-1;i++) {
			if(list.get(i) + list.get(i+1) == x) {
				System.out.printf("\n%d + %d = %d", list.get(i), list.get(i+1), x);
				count++;
			}
		}
		if(count==0) {
			System.out.print("Khong co");
		}
	}
}

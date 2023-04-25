package com.codejava.practice1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class bai16 {
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
		int count1 = 0;
		int count2 = 0;
		for(int i=0;i<n-1;i++) {
			if(list.get(i) < list.get(i+1)) {
				count1++;
			}
			else if(list.get(i) > list.get(i+1)) {
				count2++;
			}
		}
		if(count2 == n-1) {
			System.out.print("day giam");
		}
		else {
			System.out.print("day khong tang khong giam");
		}
		if(count1 == n-1) {
			System.out.print("day tang");
		}
	}
}

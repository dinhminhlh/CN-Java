package com.codejava.practice1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bai19 {
	static Scanner sc = new Scanner(System.in);
//	String a = "a";
//	String b = new String("b");
	
	public static void main(String[] args) {
		System.out.print("Nhap so phan tu: ");
		int n = Integer.parseInt(sc.nextLine().trim());
		
		
		List<Integer> list = new ArrayList<Integer>();
		
		System.out.print("Nhap day: ");
		for(int i=0;i<n;i++) {
			int a = Integer.parseInt(sc.nextLine().trim());
			list.add(a);
		}
//		System.out.print("Nhap so x: ");
//		int x = Integer.parseInt(sc.nextLine().trim());
		int count =0;
		for(int x:list) {
			int sum=0;
			for(int i=1;i<=n/2;i++){
		        if(x%i==0) 
		            sum+=i;
		    }
		    if(sum==x && x!=1) {
		    	count++;
		    	System.out.printf("\n%d la so hoan hao", x);
		    }
		}
		
		if(count==0) System.out.println("Day so khong chua so hoan hao !");
	}
}

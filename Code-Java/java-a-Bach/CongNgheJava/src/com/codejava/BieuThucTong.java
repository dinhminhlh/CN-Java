package com.codejava;


import java.util.Scanner;

public class BieuThucTong {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();		
		String[] str = s.split("\\+");
		
		int sum = 0;
		for(String x : str) {
			sum+= Integer.parseInt(x);
			
		}
		System.out.println(sum);
	}		
}
	

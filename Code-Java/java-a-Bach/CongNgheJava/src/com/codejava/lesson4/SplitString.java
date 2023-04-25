package com.codejava.lesson4;

public class SplitString {
	public static void main(String[] args) { 
		String str = "2,5,6,8,9,12,13";
		String[] str1 = str.split(",");
		for(String x : str1) {
			int a = Integer.parseInt(x);
			if( a%2 ==0) {
				System.out.print(x);
			}
		}
		
	}
}

package com.codejava.practice1;

public class Test {
	public static void main(String[] args) {
		String a = "a";
		String b = new String("b");
		
		a = a.concat("c");
		b = b.concat("c");
		
		System.out.println(a);
		System.out.println(b);
	}
}

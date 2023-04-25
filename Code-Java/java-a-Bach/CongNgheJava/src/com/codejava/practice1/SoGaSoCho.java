package com.codejava.practice1;

public class SoGaSoCho {
	public static void main(String[] args) {
		int n = 36;
		int soChan = 100;
		
		int cho = (soChan - 2*n)/2;
		int ga = 36-cho;

		System.out.print("So ga la: "+ ga);
		System.out.print("\nSo cho la: "+cho);
	}
}

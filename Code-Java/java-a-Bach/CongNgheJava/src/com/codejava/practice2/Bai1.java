package com.codejava.practice2;


import java.util.Arrays;
import java.util.Scanner;


public class Bai1 {
	
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		float[] arr = new float[5];
		for(int i=0;i<5;i++) {
			System.out.print("Nhap vao phan tu thu "+(i+1)+": ");
			arr[i] = sc.nextFloat();
		}
		Arrays.sort(arr);
		System.out.print("Sort :"+Arrays.toString(arr));
		
		System.out.print("\nMin = "+arr[0]);
		System.out.print("\nMax = "+arr[4]);
		
	}
}

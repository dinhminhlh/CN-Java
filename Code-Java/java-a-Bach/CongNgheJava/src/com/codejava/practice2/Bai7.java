package com.codejava.practice2;

import java.util.LinkedList;
import java.util.Scanner;

public class Bai7 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n;
		do {
			System.out.print("Nhap n: ");
			n = sc.nextInt();
			if(n<=0) {
				System.out.print("n phai la so nguyen lon hon 0. Vui long nhap lai !!!");
			}
		}while(n<=0);
		
		int[] arr = new int[n];
		System.out.print("Nhap day: ");
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		// 4 6 2 1 7 5 3
//		sortDESC
		for(int i = 0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
// 7 6 5 4 3 2 1
		LinkedList<Integer> list = new LinkedList<Integer>();
		for(int x : arr) {
			if(x%2 == 0) {
				list.addFirst(x);
			}
			else {
				list.addLast(x);
			}
		}
		System.out.println(list.toString());
	}
	//4 6 7 5 
}














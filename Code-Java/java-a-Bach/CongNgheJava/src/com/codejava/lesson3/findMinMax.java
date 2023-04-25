package com.codejava.lesson3;

import java.util.Scanner;

public class findMinMax {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n;
		System.out.print("Nhap n: ");
		n = Integer.parseInt(sc.nextLine());
		int[] arr = new int[n];
		System.out.println("Nhap mang: ");
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(sc.nextLine());
		}
		
		int max = arr[0];
		int min = arr[0];
		int sum = 0;
		int count = 0;
		for(int i=1;i<arr.length;i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
			if(arr[i] < min) {
				min = arr[i];
			}
			if(arr[i] % 2 == 0) {
				sum+=arr[i];
				count++;
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for(int x : arr) {
			System.out.printf("%5d", x);
		}
		float average = (float) sum/count;
		
		System.out.println("Gia tri nho nhat trong mang la: "+min);
		System.out.println("Gia tri lon nhat trong mang la: "+max);
		System.out.println("Trung binh cong so chan trong mang la: "+ average);
	}
}

package com.codejava.practice2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bai2 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n;
		do {
			System.out.print("Nhap n: ");
			n = sc.nextInt();
			if(n==0) {
				System.out.print("n phai la so nguyen lon hon 0. Vui long nhap lai !!!");
			}
		}while(n<=0);
		
		
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			System.out.print("Nhap vao phan tu thu "+(i+1)+": ");
			arr[i] = sc.nextInt();
		}
		
		int count = 0;
		int sum = 0;
		for(int x : arr) {
			if(x<0) {
				sum+=x;
				count++;
			}
		}
		if(count ==0) {
			System.out.print("Mang khong chua phan tu am !" );
		}
		else {
			System.out.print("Trung binh cong phan tu am cua day la: " + (float)sum/count);
		}
		
		
		List<Integer> list = new ArrayList<Integer>();
		for(int x : arr) {
			if(x%3 == 0 && x%2 != 0) {
				list.add(x);
			}
		}
		if(list.isEmpty()) {
			System.out.println("Day khong chua phan tu thoa man yeu cau");
		}
		else {
			System.out.println("\nMang chia het cho 3 nhung khong chia het cho 6: "+list.toString());
		}
		
		count=0;
		for(int x : arr) {
			double temp = Math.sqrt(x);
			if(temp*temp == (double)x) {
				System.out.print(x+ " ");
				count++;
			}
		}
		if(count==0) {
			System.out.println("Mang khong co so chinh phuong nao");
		}
		
		
		System.out.print("Nhap x: ");
		int a = sc.nextInt();
		count = 0;
		for(int x : arr) {
			if(a == x*x) {
				System.out.println(x+"la phan tu can tim");
				count++;
				break;
			}
		}
		if(count ==0) {
			System.out.println("Day khong chua phan tu thoa man yeu cau");
		}
		
	}
}

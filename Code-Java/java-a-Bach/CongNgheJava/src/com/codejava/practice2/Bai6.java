package com.codejava.practice2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Bai6 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n;
		do {
			System.out.print("Nhap vao n: ");
			n = sc.nextInt();
			if(n<=0) {
				System.out.println("Nhap lai! ");
			}
		}while(n<=0);
		
		Random rand = new Random();
		List<Integer> listRand = new ArrayList<Integer>();
		
		for(int i=0;i<n;i++) {
			int a = rand.nextInt(81) + 10;
			listRand.add(a);
		}
		
		for(int x : listRand) {
			if(x%10 == 6 || x%10==4 || x%10==2) {
				System.out.print(x+" ");
			}
		}
	}
}
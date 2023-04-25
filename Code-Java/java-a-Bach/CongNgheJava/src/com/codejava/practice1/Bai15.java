package com.codejava.practice1;

import java.util.Scanner;

public class Bai15 {
static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		float diem;

		do {
			System.out.print("Nhap diem: ");
			diem = Float.parseFloat(sc.nextLine().trim());
		}while(diem<0 || diem>10); 
		
		if(diem<5) {
			System.out.println("Hoc luc yeu");
		}
		else if(diem>=5 && diem<6) {
			System.out.println("Hoc luc trung binh");
		}
		else if(diem>=6 && diem<7) {
			System.out.println("Hoc luc trung binh kha");
		}
		else if(diem>=7 && diem<8) {
			System.out.println("Hoc luc kha");
		}
		else if(diem>=8 && diem<9) {
			System.out.println("Hoc luc gioi");
		}
		else {
			System.out.println("Hoc luc xuat sac");
		}
	}
}

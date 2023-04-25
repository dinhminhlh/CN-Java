package com.codejava.lesson2;

import java.util.Scanner;

public class Example {
	
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.print("Nhap ma sinh vien: ");
		String maSV = input.nextLine();
		System.out.print("Nhap ma ho va ten: ");
		String hoVaTen = input.nextLine();
		System.out.print("Nhap ma nam sinh: ");
		Integer namSinh = Integer.parseInt(input.nextLine());
		System.out.print("Nhap ma diem trung binh: ");
		Double diemTrungBinh = Double.parseDouble(input.nextLine());
		
		System.out.println("Ket qua: " +maSV +" "+hoVaTen+" "+namSinh+" "+diemTrungBinh);
	}
}

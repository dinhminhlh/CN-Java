package com.codejava.practice2;

import java.util.Scanner;

public class Color {
	static Scanner sc = new Scanner(System.in); 
	public static void main(String[] args) {
		String choice;
		System.out.print("Nhap mau sac: ");
		choice = sc.nextLine();
		
		switch(choice) {
			case "Xanh":
				System.out.println("Tinh cach nguoi thich mau xanh...");
				break;
			case "Do":
				System.out.println("Tinh cach nguoi thich mau do...");
				break;
			case "Tim":
				System.out.println("Tinh cach nguoi thich mau tim...");
				break;
			case "Hong":
				System.out.println("Tinh cach nguoi thich mau hong...");
				break;
			case "Trang":
				System.out.println("Tinh cach nguoi thich mau trang...");
				break;
			default:
				System.out.println("Chuong trinh dang cap nhat!");
				break;
		}
	}
}

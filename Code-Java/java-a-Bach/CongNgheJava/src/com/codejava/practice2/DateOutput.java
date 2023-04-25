package com.codejava.practice2;

import java.time.YearMonth;
import java.util.Scanner;

public class DateOutput {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int month;
		int year;
		
		System.out.print("Nhap thang: ");
		month = Integer.parseInt(sc.nextLine());
		System.out.print("Nhap nam: ");
		year = Integer.parseInt(sc.nextLine());
		
		YearMonth yearMonthObject = YearMonth.of(year, month);
		int daysInMonth = yearMonthObject.lengthOfMonth();
		
		System.out.println("So ngay cua thang "+month+" nam "+year+" la: "+daysInMonth);
	}
}

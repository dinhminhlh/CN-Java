package com.codejava.practice1;

import java.util.Scanner;

public class Bai13 {
static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.print("Nhap s: ");
		int s = Integer.parseInt(sc.nextLine().trim());
		int giay = s%60;
		int phut = (s/60)%60;
		int gio = (s/60)/60;
		
		String strSec=(giay<10)?"0"+Integer.toString(giay):Integer.toString(giay);
	    String strmin=(phut<10)?"0"+Integer.toString(phut):Integer.toString(phut);
	    String strHours=(gio<10)?"0"+Integer.toString(gio):Integer.toString(gio);
		
		System.out.printf("%s:%s:%s",strHours, strmin, strSec);
	}
}

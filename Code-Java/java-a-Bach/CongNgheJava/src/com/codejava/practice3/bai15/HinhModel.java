package com.codejava.practice3.bai15;

import java.util.Scanner;

public abstract class HinhModel {
	static Scanner sc = new Scanner(System.in);

	public Float input() {
		return Float.parseFloat(sc.nextLine().trim());
	}
}

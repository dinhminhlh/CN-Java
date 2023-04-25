package com.codejava.practice3;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class CanBo implements Comparable<CanBo>{
	private String maSo;
	private String hoTen;
	private float heSoLuong;
	static Scanner sc = new Scanner(System.in);
	public CanBo() {
		super();
	}

	public CanBo(String maSo, String hoTen, int heSoLuong) {
		super();
		this.maSo = maSo;
		this.hoTen = hoTen;
		this.heSoLuong = heSoLuong;
	}

	public String getMaSo() {
		return maSo;
	}

	public void setMaSo(String maSo) {
		this.maSo = maSo;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public float getHeSoLuong() {
		return heSoLuong;
	}

	public void setHeSoLuong(float heSoLuong) {
		this.heSoLuong = heSoLuong;
	}
	
	public void input() {
		System.out.print("Nhap ma ma so: ");
		maSo = sc.nextLine().trim();
		System.out.print("Nhap ten ho ten: ");
		hoTen = sc.nextLine().trim();
		do {
			System.out.print("Nhap he so luong: ");
			heSoLuong = Integer.parseInt(sc.nextLine().trim());
			if(heSoLuong <= 0) {
				System.out.println("Nhap lai he so luong !!!");
			}
		}while(heSoLuong<=0);
	}
	
	public float salaryCalculation() {
		return heSoLuong*1150000;
	}
	
	public void display() {
		System.out.print("Ma so can bo: "+maSo+"\n");
		System.out.print("Ten can bo: "+hoTen+"\n");
		System.out.print("Ten he so luong: "+heSoLuong+"\n");
		System.out.print("Luong: "+salaryCalculation()+"\n");
	}
	
	//DESC
	@Override
	public int compareTo(CanBo o) {
		return heSoLuong > o.heSoLuong ? -1 : 0;
	}
	
	public static void main(String[] args) {
		int n;
		do {
			System.out.print("Nhap so can bo: ");
			n = Integer.parseInt(sc.nextLine().trim());
			if(n <=0) {
				System.out.println("Nhap lai so can bo!!!");
			}
		}while(n<=0);
		
		LinkedList<CanBo> list = new LinkedList<CanBo>();
		
		for(int i=0;i<n;i++) {
			CanBo canBo = new CanBo();
			canBo.input();
			list.add(canBo);
		}
		
		Collections.sort(list);
		
		System.out.println("Can bo co luong cao nhat: ");
		list.getFirst().display();
		System.out.println("Can bo co luong thap nhat: ");
		list.getLast().display();
		
	}
	
	
	
}

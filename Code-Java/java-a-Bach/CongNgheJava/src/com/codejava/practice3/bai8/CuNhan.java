package com.codejava.practice3.bai8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CuNhan extends ConNguoi implements Comparable<CuNhan>{
	private String nganhHoc;
	private int namTotNghiep;
	
	
	public String getNganhHoc() {
		return nganhHoc;
	}
	public void setNganhHoc(String nganhHoc) {
		this.nganhHoc = nganhHoc;
	}
	public int getNamTotNghiep() {
		return namTotNghiep;
	}
	public void setNamTotNghiep(int namTotNghiep) {
		this.namTotNghiep = namTotNghiep;
	}
	
	@Override
	public void input() {
		super.input();
		System.out.print("Nhap nganh hoc: ");
		nganhHoc = sc.nextLine().trim();
		
		do {
			System.out.print("Nam tot nghiep: ");
			namTotNghiep = Integer.parseInt(sc.nextLine().trim());
			if(namTotNghiep<0) {
				System.out.println("Nhap lai!!!");
			}
		}while(namTotNghiep<0);
	}
	
	
	
	@Override
	public void display() {
		super.display();
		System.out.print("Nganh hoc: "+nganhHoc+"\n");
		System.out.print("Nam tot nghiep: "+namTotNghiep+"\n");
	}
	@Override
	public int compareTo(CuNhan o) {
		return namTotNghiep > o.namTotNghiep ? -1 : 0;
	}
	
	public static void main(String[] args) {
		Integer n;
		do {
			System.out.print("Nhap sinh vien: ");
			n = Integer.parseInt(sc.nextLine().trim());
			if(n <= 0) {
				System.out.println("Nhap lai !!!");
			}
		}while(n <= 0);
		
		List<CuNhan> list = new ArrayList<>();
		for(int i=0;i<n;i++) {
			CuNhan cuNhan = new CuNhan();
			cuNhan.input();
			list.add(cuNhan);
		}
		Collections.sort(list);
		for(CuNhan x : list) {
			x.display();
		}
	}
}

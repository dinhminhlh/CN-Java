package com.codejava.practice3.bai13;

import java.util.ArrayList;
import java.util.List;


public class HocSinh extends Person{
	private String lop;
	private float toan, ly, hoa;
	public String getLop() {
		return lop;
	}
	public void setLop(String lop) {
		this.lop = lop;
	}
	public float getToan() {
		return toan;
	}
	public void setToan(float toan) {
		this.toan = toan;
	}
	public float getLy() {
		return ly;
	}
	public void setLy(float ly) {
		this.ly = ly;
	}
	public float getHoa() {
		return hoa;
	}
	public void setHoa(float hoa) {
		this.hoa = hoa;
	}
	
	public float getDiemTrungBinh() {
		return (toan+ly+hoa)/3;
	}
	
	@Override
	public void input() {
		super.input();
		System.out.print("Nhap lop: ");
		lop = sc.nextLine().trim();
		System.out.print("Nhap diem toan ly hoa: ");
		toan = Float.parseFloat(sc.nextLine().trim());
		ly = Float.parseFloat(sc.nextLine().trim());
		hoa = Float.parseFloat(sc.nextLine().trim());
	}
	
	@Override
	public void display() {
		super.display();
		System.out.print("Lop: "+lop+"\n");
		System.out.printf("Toan, ly, hoa: %.2f, %.2f, %.2f",toan,ly,hoa);
		System.out.print("Diem trung binh: "+getDiemTrungBinh());
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
		
		List<HocSinh> list = new ArrayList<>();
		for(int i=0;i<n;i++) {
			HocSinh hocSinh = new HocSinh();
			hocSinh.input();
			list.add(hocSinh);
		}
		
		for(HocSinh x : list) {
			x.display();
		}
	}
}

package com.codejava.practice3.bai14;

public class BienChe extends NhanVien{
	private float bacLuong;

	public float getBacLuong() {
		return bacLuong;
	}

	public void setBacLuong(float bacLuong) {
		this.bacLuong = bacLuong;
	}
	
	@Override
	public void input() {
		super.input();
		do {
			System.out.print("Nhap bac luong ");
			bacLuong = Float.parseFloat(sc.nextLine().trim());
			if(bacLuong <= 0) {
				System.out.println("Nhap lai !!!");
			}
		}while(bacLuong <= 0);
	}
	@Override
	public void display() {
		super.display();
		System.out.print("Bac luong: "+bacLuong);
	}
}

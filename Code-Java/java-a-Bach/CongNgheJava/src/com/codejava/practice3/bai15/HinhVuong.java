package com.codejava.practice3.bai15;

public class HinhVuong extends Hinh2D{
	private Float a;
	
	public Float getA() {
		return a;
	}

	public void setA(Float a) {
		this.a = a;
	}
	
	@Override
	public Float input() {
		System.out.print("Nhap canh a: ");
		a = super.input();
		return null;
	}
	
	@Override
	public Float tinhChuVi() {
		return a*4;
	}

	@Override
	public Float tinhDienTich() {
		return a*a;
	}
	
}

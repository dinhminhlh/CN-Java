package com.codejava.practice3.bai15;

public class HinhCN extends Hinh2D{
	private float a,b;

	public float getA() {
		return a;
	}

	public void setA(float a) {
		this.a = a;
	}

	public float getB() {
		return b;
	}

	public void setB(float b) {
		this.b = b;
	}
	
	@Override
	public Float input() {
		System.out.print("Nhap canh a, b: ");
		a = super.input();
		b = super.input();
		return null;
	}
	
	@Override
	public Float tinhChuVi() {
		return (a+b)*2;
	}

	@Override
	public Float tinhDienTich() {
		return a*b;
	}
	
	
}

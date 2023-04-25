package com.codejava.practice3.bai15;

public class HinhLP extends Hinh3D {
	private float a;

	public float getA() {
		return a;
	}

	public void setA(float a) {
		this.a = a;
	}
	
	@Override
	public Float input() {
		System.out.print("Nhap canh a, b: ");
		a = super.input();
		return null;
	}
	
	@Override
	public Float tinhTheTich() {
		return a*a*a;
	}

}

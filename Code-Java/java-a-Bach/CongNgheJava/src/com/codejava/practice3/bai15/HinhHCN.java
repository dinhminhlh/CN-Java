package com.codejava.practice3.bai15;

public class HinhHCN extends Hinh3D {
	private float a, b, c;

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

	public float getC() {
		return c;
	}

	public void setC(float c) {
		this.c = c;
	}

	@Override
	public Float input() {
		System.out.print("Nhap canh a, b, c: ");
		a = super.input();
		b = super.input();
		c = super.input();
		return null;
	}
	
	@Override
	public Float tinhTheTich() {
		return a * b * c;
	}

}

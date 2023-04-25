package com.codejava.lesson7;

public class TestThrow {

	private double mathMark;

	public double getMathMark() {
		return mathMark;
	}

	public void setMathMark(double mathMark) {
		if (mathMark < 0 || mathMark > 10) {
			throw new IllegalArgumentException(mathMark + " is out of allowed mark range [0, 10].");
		}
		this.mathMark = mathMark;
	}

	public static void main(String[] args) {
		TestThrow s1 = new TestThrow();
		s1.setMathMark(20);
	}

}

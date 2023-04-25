package com.codejava.lesson6;

public class Point2D {
	private double x;
	private double y;
	
	public Point2D() {
	}
	
	public Point2D(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	
	public void show() {
		System.out.printf("(%.1f, %.1f)\n",x,y);
	}
	
	public double distance() {
		return Math.sqrt(x*x+y*y);
	}
}

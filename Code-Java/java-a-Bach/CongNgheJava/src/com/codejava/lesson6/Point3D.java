package com.codejava.lesson6;

public class Point3D extends Point2D{
	private double z;
	
	public Point3D() {
	}

	public Point3D(double x, double y, double z) {
		super(x, y);
		this.z = z;
	}

	public double getZ() {
		return z;
	}

	public void setZ(double z) {
		this.z = z;
	}
	
	@Override
	public void show() {
		System.out.printf("(%.1f, %.1f, %.1f)\n",getX(),getY(),z);
	}
	
	@Override
	public double distance() {
		return Math.sqrt(getX()*getX() + getY()*getY() + z*z);
	}
	
	public static void main(String[] args) {
		Point2D p2 = new Point2D(1, 2);
		Point3D p3 = new Point3D(1, 2, 3);
		
		p2.show();
		System.out.println(p2.distance());
		
		p3.show();
		System.out.println(p3.distance());
	}
}

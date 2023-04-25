package com.codejava.practice3.bai14;

public class HopDong extends NhanVien{
	private float soGio;

	public float getSoGio() {
		return soGio;
	}

	public void setSoGio(float soGio) {
		this.soGio = soGio;
	}
	
	@Override
	public void input() {
		super.input();
		do {
			System.out.print("Nhap so gio ");
			soGio = Float.parseFloat(sc.nextLine().trim());
			if(soGio <= 0) {
				System.out.println("Nhap lai !!!");
			}
		}while(soGio <= 0);
	}
	
	@Override
	public void display() {
		super.display();
		System.out.print("So gio lam viec: "+soGio);
	}
}

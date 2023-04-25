package com.codejava.practice3.bai9;

import java.util.ArrayList;
import java.util.List;


public class Oto extends Xe{
	private int soCho;
	private double trongTai;
	
	public Oto() {
		super();
	}
	
	public Oto(String nhanHieu, double gia, int namSanXuat, int soCho, double trongTai) {
		super(nhanHieu, gia, namSanXuat);
		this.soCho = soCho;
		this.trongTai = trongTai;
	}
	
	public int getSoCho() {
		return soCho;
	}
	public void setSoCho(int soCho) {
		this.soCho = soCho;
	}
	public double getTrongTai() {
		return trongTai;
	}
	public void setTrongTai(double trongTai) {
		this.trongTai = trongTai;
	}
	
	public void input() {
		System.out.print("Nhap nhan hieu: ");
		this.setNhanHieu(sc.nextLine().trim());
		
		System.out.print("Nhap gia: ");
		do {
			System.out.print("Nhap gia xe: ");
			setGia(Double.parseDouble(sc.nextLine().trim()));
			if(getGia()<0) {
				System.out.print("Nhap lai!!! ");
			}
		}while(getGia()<0);
		
		System.out.print("Nhap nam san xuat: ");
		setNamSanXuat(Integer.parseInt(sc.nextLine().trim()));
		System.out.print("Nhap so cho: ");
		setSoCho(Integer.parseInt(sc.nextLine().trim()));
		System.out.print("Nhap trong tai: ");
		setTrongTai(Double.parseDouble(sc.nextLine().trim()));
	}
	
	public void display() {
		System.out.print("Nhan hieu: "+getNhanHieu()+"\n");
		System.out.print("Gia: "+getGia()+"\n");
		System.out.print("Nam san xuat: "+getNamSanXuat()+"\n");
		System.out.print("So cho: "+soCho+"\n");
		System.out.print("Trong tai: "+trongTai+"\n");
	}
	
	public void checkTonage(double x) {
		if(this.getTrongTai() > x) {
			this.display();
		}
	}
	public void checkCompany(String x) {
		if(this.getNhanHieu().equals(x)) {
			this.display();
		}
	}
	
	public static void main(String[] args) {
		Integer n;
		do {
			System.out.print("Nhap so luong o to: ");
			n = Integer.parseInt(sc.nextLine().trim());
			if(n <= 0) {
				System.out.println("Nhap lai !!!");
			}
		}while(n <= 0);
		
		List<Oto> list = new ArrayList<>();
		for(int i=0;i<n;i++) {
			Oto oto = new Oto();
			oto.input();
			list.add(oto);
		}
		
		for(Oto x : list) {
			x.checkTonage(1000);
		}
		for(Oto x : list) {
			x.checkCompany("KIA");
		}
	}
}

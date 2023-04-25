package com.codejava.practice3.bai10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class MayTinh extends May implements Comparable<MayTinh> {
	private float tocDo;
	private float dungLuongRAM;
	private float dungLuongHDD;
	static List<MayTinh> list = new ArrayList<>();

	public MayTinh() {
		super();
	}

	public MayTinh(String nhanHieu, String nhaSanXuat, double giaThanh, float tocDo, float dungLuongRAM,
			float dungLuongHDD) {
		super(nhanHieu, nhaSanXuat, giaThanh);
		this.tocDo = tocDo;
		this.dungLuongRAM = dungLuongRAM;
		this.dungLuongHDD = dungLuongHDD;
	}

	public float getTocDo() {
		return tocDo;
	}

	public void setTocDo(float tocDo) {
		this.tocDo = tocDo;
	}

	public float getDungLuongRAM() {
		return dungLuongRAM;
	}

	public void setDungLuongRAM(float dungLuongRAM) {
		this.dungLuongRAM = dungLuongRAM;
	}

	public float getDungLuongHDD() {
		return dungLuongHDD;
	}

	public void setDungLuongHDD(float dungLuongHDD) {
		this.dungLuongHDD = dungLuongHDD;
	}

	@Override
	public void input() {
		super.input();
		System.out.print("Nhap toc do: ");
		tocDo = Float.parseFloat(sc.nextLine().trim());
		System.out.print("Nhap dung luong RAM: ");
		dungLuongRAM = Float.parseFloat(sc.nextLine().trim());
		System.out.print("Nhap dung luong HDD: ");
		dungLuongHDD = Float.parseFloat(sc.nextLine().trim());
	}

	@Override
	public void display() {
		super.display();
		System.out.print("Toc do: " + tocDo + "\n");
		System.out.print("Dung luong RAM: " + dungLuongRAM + "\n");
		System.out.print("Dung luong HDD: " + dungLuongHDD + "\n");

	}

	public void checkCompany(String company) {
		if (getNhaSanXuat().equals(company)) {
			display();
		}
	}
	
	private void removeByCompany(List<MayTinh> list, String company) {
		if(getNhaSanXuat().equals(company)) {
			list.remove(this);
		}
	}

	public void removeByCompany(String company) {
		removeByCompany(list, company);
	}

	@Override
	public int compareTo(MayTinh o) {
		return getGiaThanh() > o.getGiaThanh() ? 0 : -1; // ASC
	}

	public static void main(String[] args) {
		Integer n;
		do {
			System.out.print("Nhap sinh vien: ");
			n = Integer.parseInt(sc.nextLine().trim());
			if (n <= 0) {
				System.out.println("Nhap lai !!!");
			}
		} while (n <= 0);

		
		for (int i = 0; i < n; i++) {
			MayTinh mayTinh = new MayTinh();
			mayTinh.input();
			list.add(mayTinh);
		}

		for (MayTinh x : list) {
			x.display();
		}

		for (MayTinh x : list) {
			x.checkCompany("IBM");
			x.removeByCompany("Intel");
		}

		Collections.sort(list);

		for (MayTinh x : list) {
			x.display();
		}

	}
}

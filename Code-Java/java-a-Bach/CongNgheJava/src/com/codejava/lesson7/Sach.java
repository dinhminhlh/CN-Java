package com.codejava.lesson7;

import java.util.Scanner;

public class Sach{
	String ten, tg;
	int sl, nam;

	public String getTen() { return ten; }
	public String getTacGia() { return tg; }
	public int getSoLuong() { return sl; }
	public int getNam() { return nam; }
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("ten: ");				ten = sc.nextLine();
		System.out.print("tac gia: ");			tg = sc.nextLine();
		System.out.print("sl: ");				sl = sc.nextInt();
		System.out.print("nam: ");				nam = sc.nextInt();
	}
	public void xuat(){
		System.out.print("\n");
		System.out.printf("%20s%20s%20d%20d",this.getTen(),this.getTacGia(),this.getSoLuong(),this.getNam());
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap n so sach: ");		int n = sc.nextInt();
		Sach sach[] = new Sach[n];
		for(int i = 0; i < n; i++){
			sach[i] = new Sach();
			sach[i].nhap();
		}
		System.out.printf("\n%20s%20s%20s%20s","ten","tac gia","so luong","nam");
		
		int max = sach[0].getSoLuong();
		int j = 0;
//		for(int i = 0; i < n; i++){
//			sach[i].xuat();
//			if(sach[i].getSoLuong() > max){ System.out.print("SL nhieu nhat");}
//			if(sach[i].getNam() > 2020){ System.out.print("\tSach sau nam 2020");}
//		}
		for(int i=0;i<n;i++) {
			sach[i].xuat();
			if(sach[i].getSoLuong() > max) {
				max = sach[i].getSoLuong();
				j=i;
			}
			
			if(sach[i].getNam() > 2020){ System.out.print("\tSach sau nam 2020");}
		}
		System.out.print("\t\nSach co so luong nhieu nhat");
		sach[j].xuat();
	}
}

package com.codejava.practice2;

import java.util.Scanner;

public class Bai5 {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String args[]){
		
        String str = null;

        do {
        	System.out.print("\nNhap ma nhan vien: ");
            str = sc.nextLine();
            
            if(!str.matches("[a-zA-Z]{3}[0-9]{3}")) {
            	System.out.print("Nhap lai! ");
            }
        }while(!str.matches("[a-zA-Z]{3}[0-9]{3}"));
        System.out.print("Thanh cong!");
        
        do {
        	System.out.print("\nNhap ho va ten: ");
            str = sc.nextLine();
            
            if(str.length()<=5) {
            	System.out.print("Nhap lai! ");
            }
        }while(str.length()<=5);
        System.out.print("Thanh cong!");
        
        do {
        	System.out.print("\nNhap so dien thoai: ");
            str = sc.nextLine();
            
            if(!str.matches("^0[0-9]{9}$")) {
            	System.out.print("Nhap lai! ");
            }
        }while(!str.matches("^0[0-9]{9}$"));
        System.out.print("Thanh cong!");
        
        do {
        	System.out.print("\nNhap dia chi: ");
            str = sc.nextLine();
            
            if(str.length()==0 || str.length()>30) {
            	System.out.print("Nhap lai! ");
            }
        }while(str.length()==0 || str.length()>30);
        System.out.print("Thanh cong!");
        
        do {
        	System.out.print("\nNhap ngay sinh: ");
            str = sc.nextLine();
            
            if(!str.matches("^(0?[1-9]|[12][0-9]|3[01])[\\/\\-](0?[1-9]|1[012])[\\/\\-]\\d{4}$")) {
            	System.out.print("Nhap lai! ");
            }
        }while(!str.matches("^(0?[1-9]|[12][0-9]|3[01])[\\/\\-](0?[1-9]|1[012])[\\/\\-]\\d{4}$"));
        System.out.print("Thanh cong!");
        
        do {
        	System.out.print("\nNhap email: ");
            str = sc.nextLine();
            
            if(!str.matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$")) {
            	System.out.print("Nhap lai! ");
            }
        }while(!str.matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$"));
        System.out.print("Thanh cong!");
        
        do {
        	System.out.print("\nNhap so CMND: ");
            str = sc.nextLine();
            
            if(!str.matches("^[0-9]{9}$")) {
            	System.out.print("Nhap lai! ");
            }
        }while(!str.matches("^[0-9]{9}$"));
        System.out.print("Thanh cong!");
    }
}

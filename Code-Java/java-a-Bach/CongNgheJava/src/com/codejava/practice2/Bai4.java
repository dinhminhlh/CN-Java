package com.codejava.practice2;

import java.util.Scanner;

public class Bai4 {
	static Scanner sc = new Scanner(System.in);
	
	public static boolean isWordExist(String str, String s){

	      if (str == null || str.isEmpty()) {
	    	  return false;
	      }
	      String[] words = str.split("\\s+");
	      for(String word : words) {
	    	  if(s.equals(word)) {
	    		  return true;
	    	  }
	      }
	      return false;
	  }
	public static void main(String args[]){
			
	        String str = null;
	        String s = null;
	        System.out.print("Nhap chuoi: ");
	        str = sc.nextLine();
	        System.out.print("Nhap tu: ");
	        s = sc.nextLine();
	        
	        if(isWordExist(str,s.trim())) {
	        	System.out.println("Ton tai tu can tim trong chuoi");
	        }
	        else {
	        	System.out.println("Khong ton tai tu can tim trong chuoi");
	        }
	    }
}

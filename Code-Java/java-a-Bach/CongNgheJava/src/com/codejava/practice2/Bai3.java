package com.codejava.practice2;

import java.util.Scanner;

public class Bai3 {
	static Scanner sc = new Scanner(System.in);
	
	public static int countWords(String str){

      if (str == null || str.isEmpty()) {
    	  return 0;
      }
// dem chu
//      str = str.replaceAll("\\s+", "");
//      return str.length();
//dem tu
      String[] words = str.split("\\s+");
      return words.length;
  }
	public static void main(String args[]){
		
        String str = null;
        System.out.print("Nhap chuoi: ");
        str = sc.nextLine();

        System.out.println("So tu : " +
           countWords(str));
    }
}

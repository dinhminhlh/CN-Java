package com.codejava.lesson7;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
	public static void main(String[] args) {
		List<String> arr_list = new ArrayList<>();
		arr_list.add("java");
		arr_list.add("python");
		arr_list.add("javascript");
		System.out.println("Cac phan tu arraylist: ");
		
		String[] arr = new String[arr_list.size()];
		arr_list.toArray(arr);
		
		for(String x : arr) {
			System.out.println(x);
		}
	}
}

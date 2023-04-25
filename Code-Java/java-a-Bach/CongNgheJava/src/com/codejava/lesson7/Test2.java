package com.codejava.lesson7;

import java.util.LinkedList;

public class Test2 {
	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<>();
		ll.add("python");
		System.out.println("After invoking add: ");
		for(String x:ll) {
			System.out.println(x);
		}
		ll.addFirst("C");
		ll.addLast("php");
		System.out.println("After invoking addFirst and addFirst: ");
		for(String x:ll) {
			System.out.println(x);
		}
		
		
		System.out.println("After delete second items: ");
		ll.remove(ll.get(1));
		for(String x:ll) {
			System.out.println(x);
		}
		
		
		System.out.println("After delete last item and last item: ");
		ll.removeFirst();
		ll.removeLast();
		for(String x:ll) {
			System.out.println(x);
		}

	}
}

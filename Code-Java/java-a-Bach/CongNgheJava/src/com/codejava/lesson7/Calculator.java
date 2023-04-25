package com.codejava.lesson7;

public class Calculator {
	public long sum() {
//		long sum = 0;
		
//		for(int i=0;i<1000000000;i++) {
//			sum+=i;
//		}
		
		long sum1= 0,sum2= 0,sum3= 0,sum4= 0,sum5= 0,sum6= 0,sum7= 0,sum8= 0,sum9= 0,sum10 = 0;
		for(int i=0;i<100000000;i++) {
			sum1+=i;
		}
		for(int i=100000000;i<200000000;i++) {
			sum2+=i;
		}
		for(int i=200000000;i<300000000;i++) {
			sum3+=i;
		}
		for(int i=300000000;i<400000000;i++) {
			sum4+=i;
		}
		for(int i=400000000;i<500000000;i++) {
			sum5+=i;
		}
		for(int i=500000000;i<600000000;i++) {
			sum6+=i;
		}
		for(int i=600000000;i<700000000;i++) {
			sum7+=i;
		}
		for(int i=700000000;i<800000000;i++) {
			sum8+=i;
		}
		for(int i=800000000;i<900000000;i++) {
			sum9+=i;
		}
		for(int i=900000000;i<1000000000;i++) {
			sum10+=i;
		}
		return sum1+sum2+sum3+sum4+sum5+sum6+sum7+sum8+sum9+sum10;
	}
	
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		long start = System.currentTimeMillis();
		long sum = cal.sum();
		long end = System.currentTimeMillis();
		
		System.out.println("Sum = "+sum);
		System.out.println("Time is ms = " +(end-start));
	}
}

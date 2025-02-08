package com.basicPrograms.fibonacci;

public class FibonacciSeriesInReverseOrder {
	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		int sum = 0;
		for(int i=1;i<10;i++)
		{
			a=b;
			b=sum;
			sum=a+b;
		}
//		System.out.println(sum);
		for(int i=1;i<=10;i++)
		{
			System.out.println(i+") "+sum);
			sum=b;
			b=a;
			a=sum-b;
		}
		
	}
}

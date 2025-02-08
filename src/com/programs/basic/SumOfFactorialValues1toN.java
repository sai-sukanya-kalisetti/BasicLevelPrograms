package com.programs.basic;

import java.util.Scanner;

public class SumOfFactorialValues1toN {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int n = scan.nextInt();
		int sum = 0;
		for(int i=1;i<=n;i++)
		{
			int fact = 1;
			for (int j=1;j<=i;j++)
			{
				fact=fact*j;
			}
			sum=sum+fact;
		}
		System.out.println("Sum of Factorial values : "+sum);
	}

}

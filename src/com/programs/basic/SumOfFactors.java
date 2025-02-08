package com.programs.basic;

import java.util.Scanner;

public class SumOfFactors {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int n = scan.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				sum=sum+i;
				System.out.println(i);
			}
		}
		System.out.println("Sum of factors "+sum);
	}

}

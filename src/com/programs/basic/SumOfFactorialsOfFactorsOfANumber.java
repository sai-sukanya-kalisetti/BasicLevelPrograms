package com.programs.basic;

import java.util.Scanner;

public class SumOfFactorialsOfFactorsOfANumber {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int n = scan.nextInt();
		int sum = 0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				int fact = 1;
				for (int j=1;j<=i;j++)
				{
					fact=fact*j;
				}
				sum=sum+fact;
			}
		}
		System.out.println("Sum of Factors of Factorial values : "+sum);
	}

}

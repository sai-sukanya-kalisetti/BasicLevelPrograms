package com.programs.basic;

import java.util.Scanner;

public class StrongNumber {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter a number");
		int n = scan.nextInt();
		int sum = 0;
		int temp = n;
		while(temp!=0)
		{
			int ld = temp%10;
			
			int fact = 1;
			for(int i=1;i<=ld;i++)
			{
				fact=fact*i;
			}
			sum=sum+fact;
			
			temp/=10;
		}
		if(sum==n)
		{
			System.out.println("Strong number");
		}
		else
		{
			System.out.println("Not a strong number.........");
		}
	}
}

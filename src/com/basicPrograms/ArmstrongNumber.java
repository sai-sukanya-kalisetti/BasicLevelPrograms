package com.basicPrograms;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter a number");
		int n = scan.nextInt();
		int temp = n;
		int sum = 0;
		int count = 0;
		while(temp!=0)
		{
			count++;
			temp/=10;
		}
		temp = n;
		while(temp!=0)
		{
			int ld = temp%10;
			/*Finding exponential of last digit example(125): 5 raise to power of 3*/
			int exp = 1;
			for(int i=1;i<=count;i++)
			{
				exp=exp*ld;
			}
			sum=sum+exp;
			
			temp/=10;
		}
		if(sum==n)
		{
			System.out.println("Armstrong number");
		}
		else
		{
			System.out.println("Not a Armstrong number.........");
		}
	}
}

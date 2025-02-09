package com.programs.basic2;

import java.util.Scanner;

public class MiddleDigitUsingBase {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter a number");
		int n = scan.nextInt();
		int temp = n;
		int count = 0;
		while(temp!=0)
		{
			count++;
			temp/=10;
		}
		/*check count of digits are odd or not */
		if(count%2==1)
		{
			int base = 1;
			for(int i=1;i<=count/2;i++)
			{
				base = base*10;
			}
			int num = n/base;
			int middle = num%10;;
			System.out.println("Middle digit : "+middle);
		}
		else
		{
			System.out.println("cannot find middle digit since count of digits are even");
		}
	}
}

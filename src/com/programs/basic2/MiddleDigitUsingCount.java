package com.programs.basic2;

import java.util.Scanner;

public class MiddleDigitUsingCount {
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
			temp =n;
			int x = 0;
			while(temp!=0)
			{
				x++;
				int ld = temp%10;
				if(x==((count/2)+1))
				{
					System.out.println("Middle digit : "+ld);
				}
				temp/=10;
			}
		}
		else
		{
			System.out.println("cannot find middle digit since count of digits are even");
		}
	}
}

package com.programs.basic2;

import java.util.Scanner;

public class FirstAndLastDigitsSumUsingCount {
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
		temp = n;
		int x = 0;
		int sum = 0;
		while(temp!=0)
		{
			x++;
			int ld = temp%10;
			if(x==1||x==count)
			{
				sum = sum+ld;
			}
			temp/=10;
		}
		System.out.println("Sum of first and last digits : "+sum);
	}
}

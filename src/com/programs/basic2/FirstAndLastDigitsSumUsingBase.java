package com.programs.basic2;

import java.util.Scanner;

public class FirstAndLastDigitsSumUsingBase {
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
		int base = 1;
		for(int i=1;i<count;i++)
		{
			base = base*10;
		}
//		System.out.println(base);
		int sum = (n%10)+(n/base);
		System.out.println("Sum of first and last digits : "+sum);
	}
}

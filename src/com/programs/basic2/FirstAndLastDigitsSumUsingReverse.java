package com.programs.basic2;

import java.util.Scanner;

public class FirstAndLastDigitsSumUsingReverse {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter a number");
		int n = scan.nextInt();
		int temp = n;
		int rev = 0;
		while(temp!=0)
		{
			int ld = temp%10;
			rev = (rev*10)+ld;
			temp/=10;
		}
		int sum = (n%10)+(rev%10);
		System.out.println("Sum of first and last digits : "+sum);
	}
}

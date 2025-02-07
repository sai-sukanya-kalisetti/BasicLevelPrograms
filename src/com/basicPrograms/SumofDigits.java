package com.basicPrograms;

import java.util.Scanner;

public class SumofDigits {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter a number");
		int n = scan.nextInt();
		int sum = 0;
		while(n!=0)
		{
			int ld = n%10;
			sum=sum+ld;
			n/=10;
		}
		System.out.println("Sum of digits "+sum);
	}
}

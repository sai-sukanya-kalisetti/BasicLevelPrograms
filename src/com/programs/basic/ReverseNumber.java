package com.programs.basic;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter a number");
		int n = scan.nextInt();
		int rev = 0;
		while(n!=0)
		{
			int ld = n%10;
			rev=(rev*10)+ld;
			n/=10;
		}
		System.out.println("Reverse: "+rev);
	}
}

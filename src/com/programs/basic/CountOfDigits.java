package com.programs.basic;

import java.util.Scanner;

public class CountOfDigits {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int n = scan.nextInt();
		int count = 0;
		while(n!=0)
		{
			count+=1;
			n/=10;
		}
		System.out.println("No of digits "+count);
	}
}

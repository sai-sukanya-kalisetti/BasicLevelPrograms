package com.programs.basic2;

import java.util.Scanner;

public class DecimalToBinary {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter a number");
		int n = scan.nextInt();
		int binary = 0;
		int base = 1;
		while(n!=0)
		{
			int rem = n%2;
			binary = binary + (rem*base);
			base = base*10;
			n = n/2;
		}
		System.out.println("Binary form : "+binary);
	}
}

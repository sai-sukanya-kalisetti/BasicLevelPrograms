package com.programs.basic2;

import java.util.Scanner;

public class BinaryToDecimal {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter a number");
		int n = scan.nextInt();
		int decimal = 0;
		int base = 1;
		while(n!=0)
		{
			int ld = n%10;
			decimal = decimal + (ld*base);
			base = base*2;
			n = n/10;
		}
		System.out.println("Decimal form : "+decimal);
	}
}

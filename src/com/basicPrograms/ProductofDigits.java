package com.basicPrograms;

import java.util.Scanner;

public class ProductofDigits {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter a number");
		int n = scan.nextInt();
		int prod = 1;
		while(n!=0)
		{
			int ld = n%10;
			prod=prod*ld;
			n/=10;
		}
		System.out.println("Product of digits "+prod);
	}
}

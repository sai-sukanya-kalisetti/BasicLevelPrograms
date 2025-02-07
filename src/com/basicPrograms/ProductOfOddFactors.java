package com.basicPrograms;

import java.util.Scanner;

public class ProductOfOddFactors {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int n = scan.nextInt();
		int prod=1;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0&&i%2==1)
			{
				prod=prod*i;
				System.out.println(i);
			}
		}
		System.out.println("Product of odd factors "+prod);
	}

}

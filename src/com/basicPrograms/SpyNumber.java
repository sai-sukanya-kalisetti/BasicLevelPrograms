package com.basicPrograms;

import java.util.Scanner;

/*Example:123*/
public class SpyNumber {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter a number");
		int n = scan.nextInt();
		int sum = 0;
		int prod = 1;
		int temp = n;
		while(temp!=0)
		{
			int ld = temp%10;
			sum=sum+ld;
			prod=prod*ld;
			temp/=10;
		}
		if(sum==prod)
		{
			System.out.println("Spy Number");
		}
		else
		{
			System.out.println("Not a Spy Number");
		}
	}
}


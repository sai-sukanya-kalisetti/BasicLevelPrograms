package com.basicPrograms;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter a number");
		int n = scan.nextInt();
		int rev = 0;
		int temp = n;
		while(temp!=0)
		{
			int ld = temp%10;
			rev=(rev*10)+ld;
			temp/=10;
		}
		if(n==rev)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome...........");
		}
		
	}
}

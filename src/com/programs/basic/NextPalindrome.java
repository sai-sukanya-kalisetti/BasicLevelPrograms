package com.programs.basic;

import java.util.Scanner;

public class NextPalindrome {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("enter any number to get next palindrome: ");
		int n = scan.nextInt();
		while(true)
		{
			n++;
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
				System.out.println(n);
				break;
			}
		}
	}
}


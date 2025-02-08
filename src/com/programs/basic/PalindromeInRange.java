package com.programs.basic;

import java.util.Scanner;

public class PalindromeInRange {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Give range");
		int min = scan.nextInt();
		int max = scan.nextInt();
		for(int n=min ;n<=max;n++)
		{
			int temp = n;
			int rev = 0;
			while(temp!=0)
			{
				int ld = temp%10;
				rev=(rev*10)+ld;
				temp/=10;
			}
			if(n==rev)
			{
				System.out.println(n);
			}
		}
		
	}
}

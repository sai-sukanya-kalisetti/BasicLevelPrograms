package com.programs.basic;

import java.util.Scanner;

public class N_Palindromes {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Give how many number of palindromes you want: ");
		int range = scan.nextInt();
		int sln = 1;
		for(int n=1;sln<=range;n++) {
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
				System.out.println(sln+") "+n);
				sln++;
			}
		}
		
	}
}

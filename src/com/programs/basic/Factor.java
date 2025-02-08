package com.programs.basic;

import java.util.Scanner;

public class Factor {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int n = scan.nextInt();
		int count = 0;
		System.out.println("Factors : ");
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				System.out.println(i);
				count++;
			}
		}
		System.out.println("Count of factors : "+count);
	}

}

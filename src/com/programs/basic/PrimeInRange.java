package com.programs.basic;

import java.util.Scanner;

public class PrimeInRange {
	
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Give range");
		int min = scan.nextInt();
		int max = scan.nextInt();
		for(int n=min;n<=max;n++)
		{
			int count = 0;
			for(int i=1;i<=n;i++)
			{
				if(n%i==0)
				{
					count++;
				}
			}
			if(count==2) 
			{
				System.out.println(n);
			}
		}
	}

}


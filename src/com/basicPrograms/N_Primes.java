package com.basicPrograms;

import java.util.Scanner;

public class N_Primes {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Give how many number of primes you want: ");
		int range = scan.nextInt();
		int sln = 1;
		for(int n=1;sln<=range;n++) {
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
				System.out.println(sln +") "+n);
				sln++;
			}
		}
	}

}

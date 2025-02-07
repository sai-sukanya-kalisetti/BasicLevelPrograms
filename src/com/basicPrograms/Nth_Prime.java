package com.basicPrograms;

import java.util.Scanner;

public class Nth_Prime {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("which prime number you want: ");
		int n = scan.nextInt();
		int sln = 1;
		for(int x=1;sln<=n;x++) {
			int count = 0;
			for(int i=1;i<=x;i++)
			{
				if(x%i==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				if(sln==n)
				{
					System.out.println(sln +") "+x);
				}
				sln++;
			}
		}
	}
}

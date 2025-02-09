package com.programs.basic2;

import java.util.Scanner;

public class HCFofNnumbers {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Give count");
		int count = scan.nextInt();
		System.out.println("Start giving numbers");
		int temp=scan.nextInt();
		int hcf=0;
		for(int i=1;i<=count-1;i++)
		{
			int n=scan.nextInt();
			for(int j=1;j<=n;j++)
			{
				if(n%j==0&&temp%j==0)
				{
					hcf=j;
				}
			}
			temp=hcf;
		}
		System.out.println("HCF of all numbers "+hcf);
	}
}

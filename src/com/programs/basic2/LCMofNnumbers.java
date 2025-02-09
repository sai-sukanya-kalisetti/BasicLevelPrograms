package com.programs.basic2;

import java.util.Scanner;

public class LCMofNnumbers {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Give count");
		int count = scan.nextInt();
		System.out.println("Start giving numbers");
		int temp=scan.nextInt();
		int lcm=0;
		for(int i=1;i<=count-1;i++)
		{
			int n=scan.nextInt();
			for(int j=1;true;j++)
			{
				if(j%n==0&&j%temp==0)
				{
					lcm=j;
					break;
				}
			}
			temp=lcm;
		}
		System.out.println("HCF of all numbers "+lcm);
	}
}

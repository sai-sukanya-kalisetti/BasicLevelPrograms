package com.programs.basic2;

import java.util.Scanner;

public class SmallestNumber {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter count of numbers");
		int n = scan.nextInt();
		System.out.println("Start giving numbers");
		int small = scan.nextInt();
		for(int i=1;i<=n-1;i++)
		{
			int num = scan.nextInt();
			if(num<small)
			{
				small = num;
			}
		}
		System.out.println("Smallest among given numbers: "+small);
	}

}

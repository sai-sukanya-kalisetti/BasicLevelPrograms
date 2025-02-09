package com.programs.basic2;

import java.util.Scanner;

public class LargestNumber {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter count of numbers");
		int n = scan.nextInt();
		int large = 0;
		System.out.println("Start giving numbers");
		for(int i=1;i<=n;i++)
		{
			int num = scan.nextInt();
			if(num>large)
			{
				large = num;
			}
		}
		System.out.println("Largest among given numbers: "+large);
	}

}

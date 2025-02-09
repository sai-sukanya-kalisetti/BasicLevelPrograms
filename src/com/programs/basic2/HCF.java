package com.programs.basic2;

import java.util.Scanner;

public class HCF {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Give two numbers");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int hcf = 1;
		for(int i=1;i<=num1;i++)
		{
			if(num1%i==0&&num2%i==0)
			{
				hcf = i;
			}
		}
		System.out.println("HCF : "+hcf);
	}
}

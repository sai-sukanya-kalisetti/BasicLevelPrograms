package com.programs.basic2;

import java.util.Scanner;

public class LCM {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Give two numbers");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int lcm = 1;
		for(int i=1;true;i++)
		{
			if(i%num1==0&&i%num2==0)
			{
				lcm = i;
				break;
			}
		}
		System.out.println("LCM : "+lcm);
	}
}

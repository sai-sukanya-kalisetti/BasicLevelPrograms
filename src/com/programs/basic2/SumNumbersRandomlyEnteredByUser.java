package com.programs.basic2;

import java.util.Scanner;

public class SumNumbersRandomlyEnteredByUser {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Start giving numbers");
		int sum = 0;
		while(true)
		{
			int n = scan.nextInt();
			int ch = scan.next().charAt(0);
			if(ch == '+')
			{
				sum = sum + n;
			}
			else if (ch == '=')
			{
				sum = sum + n;
				break;
			}
		}
		System.out.println("Sum is "+sum);
	}

}

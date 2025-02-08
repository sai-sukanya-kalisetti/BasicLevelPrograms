package com.programs.fibonacci;

import java.util.Scanner;

public class FibonacciSeriesInRange {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Give till");
		int range = scan.nextInt();
		int a = 0;
		int b = 1;
		int sum = 0;
		int sln = 1;
		/*Example: 15   -> NOT - 15 numbers
		 * YES - in series less than equal to 15 number i.e sum<=15 */
		for(int i=0;sum<=range;i++)
		{
			System.out.println(sln+")"+sum);
			sln++;
			a=b;
			b=sum;
			sum=a+b;
		}
	}
}

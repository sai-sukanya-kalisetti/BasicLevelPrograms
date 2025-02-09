package com.programs.basic2;

import java.util.Scanner;

public class HCF2 {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Give two numbers");
		int dividend = scan.nextInt();
		int divisor = scan.nextInt();
		int hcf = 1;
		/*Till remainder is zero, but it is stored in divisor*/
		while(divisor!=0)
		{
			int rem = dividend%divisor;
			dividend = divisor;
			divisor = rem;
		}
		/*Answer is divisor, but it is stored in dividend */
		System.out.println("HCF : "+dividend);
	}
}

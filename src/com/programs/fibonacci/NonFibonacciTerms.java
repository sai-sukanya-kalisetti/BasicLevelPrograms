package com.programs.fibonacci;

import java.util.Scanner;

/*with 100 value - 90 non fibonacci
 * 				 - 12 fibonacci (includes 0 and 2 1's)*/
public class NonFibonacciTerms {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Give till");
		int range = scan.nextInt();
		int a = 0;
		int b = 1;
		int sum = 0;
		int sln = 1;
		for(int i=0;i<=range;i++)
		{
			if(i!=sum)
			{
				System.out.println(sln+") "+i);
				sln++;
			}
			else
			{
				sum=a+b;
				a=b;
				b=sum;
			}
		}
	}
}

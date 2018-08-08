package com.apex.loops2;
import java.util.Scanner;
public class ex6 {

	private static Scanner num;

	public static void main(String[] args) {
		System.out.println("Enter num of factorial");
		num = new Scanner(System.in);
		double n= num.nextInt();
		double out = 1;
		for(int i=1;i<=n;i++) {
			out=out*i;
		}
		System.out.println("Factorial of "+n+" is "+out );

	}

}

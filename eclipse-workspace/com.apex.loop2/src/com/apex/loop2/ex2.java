package com.apex.loop2;
import java.util.Scanner;
public class ex2 {

	private static Scanner in1;
	private static Scanner in2;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		System.out.println("enter first integer");
		in1 = new Scanner(System.in);
		int num=in1.nextInt();
		int sum = num*num;
		System.out.println("enter second integer");
		in2 = new Scanner(System.in);
		int num2=in2.nextInt();
        int sum2 = num2*num2+sum;
		System.out.println(sum2);
		
		
		
	}

}


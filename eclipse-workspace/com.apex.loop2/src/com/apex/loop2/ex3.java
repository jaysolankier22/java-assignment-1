package com.apex.loop2;
import java.util.Scanner;
public class ex3 {

	private static Scanner in1;
	private static Scanner in2;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		System.out.println("enter first starting integer");
		in1 = new Scanner(System.in);
		int num1=in1.nextInt();
		System.out.println("enter last starting integer");
		in2 = new Scanner(System.in);
		int num2=in2.nextInt();
		int num=num2-num1;
		for(int n=1;n<=num; n++)
		{
	    
	    double sum = n*(n+1)*(2*n+1)/6;
	    
	    double rsum=sum;
	    double Sum=rsum+sum;
	    System.out.println(Sum);
		}
		
		
		
		
	}

}


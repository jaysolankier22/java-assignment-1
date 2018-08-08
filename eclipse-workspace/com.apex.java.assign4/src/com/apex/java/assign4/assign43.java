package com.apex.java.assign4;
import java.util.Scanner;
public class assign43 {

	private static Scanner a1;
	private static Scanner b1;
	private static Scanner c1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter value of a vriable");
		a1 = new Scanner(System.in);
		int a= a1.nextInt();
		System.out.println("enter value of b vriable");
		b1 = new Scanner(System.in);
		int b= b1.nextInt();
		System.out.println("enter value of c vriable");
		c1 = new Scanner(System.in);
		int c= c1.nextInt();
		double det,x1,x2, det1;
		det=(b*b-4*a*c);
		det1=Math.sqrt(det);
		x1=(-b+det1)/2*a;
		x2=(-b-det1)/2*a;
		System.out.println("value of first root x1="+x1);
		System.out.println("value of second root x2="+x2);
		

	}

}

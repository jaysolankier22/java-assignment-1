package com.apex.java.assign4;
import java.util.Scanner;
public class assign42 {

	private static Scanner valx;

	public static void main(String[] args) {
		System.out.println("Enter the value  for X for quadratic equation");
        valx = new Scanner(System.in);
        int x=valx.nextInt();
        int out;
        out=3*x*x-8*x+4;
        System.out.println("output:"+out);
	}

}

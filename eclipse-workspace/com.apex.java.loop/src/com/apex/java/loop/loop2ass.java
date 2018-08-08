package com.apex.java.loop;
import java.util.Scanner;
public class loop2ass {

	private static Scanner sc;

	public static void main(String[] args) {
		System.out.println("enter the a and b value");
		sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
	    while(a<=b){
System.out.print(a); System.out.print("  ");System.out.println(a*a);

       a++;
	    }			
				

	}
}


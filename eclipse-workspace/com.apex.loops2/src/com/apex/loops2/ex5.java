package com.apex.loops2;
import java.util.Scanner;

public class ex5 {

	private static Scanner num;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter num of line");
		num = new Scanner(System.in);
		int n= num.nextInt();
	    loop1:for(int i=1;i<=10;i++) {
			System.out.println("");
			if(i>=n+1)break;
			for(int j=n;j<=20;j--) {
				System.out.print("*");
				if(i==j)
			    continue loop1;
			}
		
			}
		}

	}



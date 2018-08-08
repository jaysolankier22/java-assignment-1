package com.apex.loop2;
import java.util.Scanner;

public class integerex {
	 private static Scanner input;

	public static void main(String[] args) {
	        System.out.println("Enter an integer");
	        input = new Scanner(System.in); 
	        int number;
	        int sum = 0;
	        do {
	            number = input.nextInt(); 
	            sum+= number;
	            System.out.println("Sum is : " + sum);
	        } while(number != 0); //just repeat cycle as long as number is not zero

	        System.out.println("Sum is : " + sum);
	 }

	}
	

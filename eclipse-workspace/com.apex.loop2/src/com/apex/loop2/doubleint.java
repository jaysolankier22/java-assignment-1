package com.apex.loop2;
import java.util.Scanner;

public class doubleint {
	private static Scanner input;

	public static void main(String[] args) {
	        System.out.println("Enter number");
	        input = new Scanner(System.in); 
	        double number;
	        double sum = 0.0;
	        do {
	            number = input.nextDouble(); 
	            sum+= number;
	            System.out.println("Sum is : " + sum);
	        } while(number != 0); //just repeat cycle as long as number is not zero

	        System.out.println("Sum is : " + sum);
	 }

	}
	
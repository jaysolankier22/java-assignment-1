package com.apex.java.loop;
import java.util.Scanner;
public class loop3 {
private static Scanner Sc;

	public static void main(String[] args) {
		
		System.out.println("Enter the left side weight");
		Sc = new Scanner(System.in);
		int Sc1= Sc.nextInt();
		System.out.println("Enter the right side weight");
		int Sc2 = Sc.nextInt();
		if(Sc1==Sc2) {
			System.out.print("The weights are equal");
		}
		else {
			System.out.print("The weights are not equal");
		}
		}
		

	}



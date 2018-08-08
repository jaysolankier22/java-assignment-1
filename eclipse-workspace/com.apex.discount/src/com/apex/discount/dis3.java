package com.apex.discount;
import java.util.Scanner;
public class dis3 {

	private static Scanner numcookies;
	private static Scanner numcake;

	

	public static void main(String[] args) {
		System.out.println("Scan for num of cookies for the price");
		numcookies = new Scanner(System.in);
		double ncookies=numcookies.nextDouble();
		System.out.println("Scan for num of cake for the price");
		numcake = new Scanner(System.in);
		double ncake=numcake.nextDouble();
		double cookies2, cake2;
		cookies2=ncookies*0.05;
		cake2=ncake*0.03;
		
		double value;
        value=cookies2+cake2;
		if (value<10) {
			System.out.println("Cant not apply discount");System.out.println(value);
		}
		else {
    double value2;
    double discount=0.05; 
    value2=value*(1-discount);
    System.out.println("Orignal Price");System.out.println(value);
    System.out.println("Discounted price");System.out.println(value2);
		}
	}

}

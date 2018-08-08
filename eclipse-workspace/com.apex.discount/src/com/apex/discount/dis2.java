package com.apex.discount;
import java.util.Scanner;
public class dis2 {

	private static Scanner item;

	public static void main(String[] args) {
		System.out.println("Scan for item price");
		item = new Scanner(System.in);
		double value=item.nextDouble();
		if (value<10) {
			System.out.println("Cant not apply discount");System.out.println(value);
		}
		else {
    double value2;
    double discount=0.05; 
    value2=value*(1-discount);
    System.out.println("Discounted price");System.out.println(value2);
		}
	}

}


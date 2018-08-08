package com.apex.discount;
import java.util.Scanner;
public class dis1 {

	private static Scanner item;

	public static void main(String[] args) {
		System.out.println("Scan for item");
		item = new Scanner(System.in);
    double value=item.nextDouble();
    double value2;
    double discount=0.05; 
    value2=value*(1-discount);
    System.out.println("Discounted price");System.out.println(value2);

	}

}

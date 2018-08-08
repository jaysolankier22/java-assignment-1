package com.apex.loops2;
import java.util.Scanner;
public class ex11 {

	private static Scanner i;

	public static void main(String[] args) {
		
	    System.out.println("enter first integer:");
	    Scanner i = new Scanner(System.in);
	    int sum=0;
	    while(true) {
	    	
	    int i1=i.nextInt();
	    if(i1!=0) break;
	    sum+=i1;
	    }
	    System.out.println(sum);
	    
	}
}
package com.apex.java.assign4;

import java.util.Scanner;

public class assign45 {

	
		private static Scanner sub1;
		private static Scanner sub2;
		private static Scanner sub3;
		private static Scanner sub4;
		private static Scanner sub5;
		private static Scanner sub6;

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			for(int i=1;i<=3;i++) {
				System.out.println("Enter student no:  "+i);
			
	    System.out.println("Enter student's first subject mark");
	    sub1 = new Scanner(System.in);
	    double Sub1=sub1.nextDouble();
	    System.out.println("Enter student's second subject mark");
	    sub2 = new Scanner(System.in);
	    double Sub2=sub2.nextDouble();
	    System.out.println("Enter student's third subject mark");
	    sub3 = new Scanner(System.in);
	    double Sub3=sub3.nextDouble();
	    System.out.println("Enter student's fourth subject mark");
	    sub4 = new Scanner(System.in);
	    double Sub4=sub4.nextDouble();
	    System.out.println("Enter student's fifth subject mark");
	    sub5 = new Scanner(System.in);
	    double Sub5=sub5.nextDouble();
	    System.out.println("Enter student's sixth subject mark");
	    sub6 = new Scanner(System.in);
	    double Sub6=sub6.nextDouble();
	    double avg,total;
	    total=Sub1+Sub2+Sub3+Sub4+Sub5+Sub6;
	    avg=total/6;
	    System.out.println("Total marks out of six subjects out of 600 = "+total);
	    System.out.println("Average marks of all subjects = "+avg);
			}

	}

}

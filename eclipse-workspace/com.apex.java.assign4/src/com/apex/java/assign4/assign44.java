package com.apex.java.assign4;
import java.util.Scanner;
public class assign44 {

	private static Scanner sub1;
	private static Scanner sub2;
	private static Scanner sub3;
	private static Scanner sub4;
	private static Scanner sub6;
	private static Scanner sub5;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println("Enter student's first subject marks");
    sub1 = new Scanner(System.in);
    double Sub1=sub1.nextDouble();
    System.out.println("Enter student's second subject marks");
    sub2 = new Scanner(System.in);
    double Sub2=sub2.nextDouble();
    System.out.println("Enter student's third subject marks");
    sub3 = new Scanner(System.in);
    double Sub3=sub3.nextDouble();
    System.out.println("Enter student's fourth subject marks");
    sub4 = new Scanner(System.in);
    double Sub4=sub4.nextDouble();
    System.out.println("Enter student's fifth subject marks");
    sub5 = new Scanner(System.in);
    double Sub5=sub5.nextDouble();
    System.out.println("Enter student's sixth subject marks");
    sub6 = new Scanner(System.in);
    double Sub6=sub6.nextDouble();
    double avg,total;
    total=Sub1+Sub2+Sub3+Sub4+Sub5+Sub6;
    avg=total/6;
    System.out.println("Total marks out of six subjects out of 600="+total);
    System.out.println("Average marks of all subjects="+avg);
	}

}

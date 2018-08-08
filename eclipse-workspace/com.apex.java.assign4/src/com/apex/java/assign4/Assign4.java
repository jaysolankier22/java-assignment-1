package com.apex.java.assign4;
import java.util.Scanner;
public class Assign4 {

	private static Scanner hours;
	private static Scanner rate;

	public static void main(String[] args) {
	System.out.println("Enter of no of hours  he/ she worked");
    hours = new Scanner(System.in);
     double Hours= hours.nextDouble();
     System.out.println("Enter pay rate per hour");
     rate = new Scanner(System.in);
      double rate1=rate.nextDouble();
      System.out.println("hours:"+Hours);
      System.out.println("Rate:"+rate1);
      double salaryPerHour,salaryMonthly;
      salaryPerHour=Hours*rate1;
      salaryMonthly=(40*4)*rate1; // 40 hours per week 1600hours per month 
      System.out.println("Salaryperhour he/she earned:"+salaryPerHour);
      System.out.println("Salarypermonth:"+salaryMonthly);
      
      
	}

}

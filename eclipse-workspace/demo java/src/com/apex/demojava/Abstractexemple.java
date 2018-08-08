package com.apex.demojava;
import java.util.Scanner;

public class Abstractexemple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		System.out.println("Enter + for circle and - for square");
		int option=input.nextInt();
		Shape shape=null;
		if (option>0) {
			 shape = new Circle(11);
		      //System.out.println(shape);
		}
		else {
      shape = new square(11);
      
	
	}
		System.out.println(shape.area());
		input.close();

}
}
abstract class Shape{
	abstract double area();


}
class Circle extends Shape{
	double r;
	
	public Circle(double r) {
		
		this.r = r;
	}

	double area() {
		return Math.PI*r*r;
	}
}
class square extends Shape{
	double a;
	
	public square(double a) {
		
		this.a = a;
	}

	double area() {
		return a*a;
	}
}
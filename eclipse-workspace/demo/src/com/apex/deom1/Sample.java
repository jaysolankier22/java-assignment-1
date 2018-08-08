package com.apex.deom1;

public class Sample {

	public static void main(String[] args) {
		JobApplication jobApplication1=new JobApplication();
		jobApplication1.fname="Jaydeep";
		jobApplication1.lname="Solanki";
		jobApplication1.year=2000;
		jobApplication1.display();
		
	}

}
class JobApplication {
	String fname, lname;
	int year;
	JobApplication(){
		fname="default";
		lname="default";
		year=1990;
	}
	int getAge() {
	int cyear=2018;
	return cyear-year;
	}
		void display() {
			System.out.println("Firstname"+fname);
			System.out.println("Lastname"+lname);
			System.out.println("Year"+year);
			System.out.println("age"+getAge());
		}
	}

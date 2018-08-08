package com.apex.demojava;

public class javademo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	jobApplication jobApplication1= new jobApplication("Jaydeep","Solanki",1992);// object	
    jobApplication1.disply();
    jobApplication1.setYear(-2000);
    jobApplication jobApplication2= new jobApplication("Kunal","Patel",1992);
    jobApplication2.disply();
    System.out.println(jobApplication.company);
	}

}

class jobApplication {
	private String Firstname, Lastname;
	private int Year;
	static String company="GOOGLE";
jobApplication(String Firstname,String Lastname,int Year){                 // Constructer
   this.Firstname = Firstname;
   this.Lastname = Lastname;
   this.Year=Year;
	}

public String getFirstname() {
	return Firstname;
}

public void setFirstname(String firstname) {
	Firstname = firstname;
}

public String getLastname() {
	return Lastname;
}

public void setLastname(String lastname) {
	Lastname = lastname;
}

public int getYear() {
	return Year;
}

public void setYear(int year) {
	Year = year;
	if (Year<=0) {
		System.out.println("wrong year");
		Year=1990;
	}
	else {
		this.Year=Year;
	}
}

int getAge() {           // another Method
	int currentyear=2018; // local variable
	return  currentyear-Year; 
}


void disply() {      // method           
System.out.println("Firstname:"+Firstname);
System.out.println("Lastname:"+Lastname);
System.out.println("Year:"+Year);
System.out.println("Age:"+getAge());
}
}
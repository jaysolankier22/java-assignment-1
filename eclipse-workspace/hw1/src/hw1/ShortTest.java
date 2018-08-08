package hw1;
//import java.util.Scanner;
public class ShortTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		int sum = 0; 
		int i = 0;
		// i is 0 Here
		 System.out.println("enter the num"+i);
		    while (i<100) {
            int newsum;
		      newsum = sum+ i;
		      //i++;
             sum=newsum;  
		    }

		  System.out.println("The sum is " + sum);
        }
	 

}
package Exercises;

import java.util.Scanner;

public class CondoSales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int condoChoice;
		String result;
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.println("Welcome to the Condo Sales Office!");
		System.out.println("Please choose the condo you would like to live in. \n1- for condo One\n2- for condo Two\n3- for condo Three ");
		condoChoice= input.nextInt();
		
		if(condoChoice == 1)
		{
			result = "Park Views for $150,000";
		}
		else if(condoChoice == 2)
		{
			result = "Golf Courses View for $170,000";
		}
		else if(condoChoice == 3)
		{
			result = "Lake Views for $210,000";
		}
		else 
			result = "but this was not an option";
		{
			
			
		displayMessage (result);
		
		}

	 }
	 private static void displayMessage(String result) 
	 {
		 System.out.println("Thank you for choosing " + result);
		
	}	
	
}

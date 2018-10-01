package Exercises;

import java.util.Scanner;

public class CellPhoneService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		int phonePlan;
		@SuppressWarnings("unused")
		String result;
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner (System.in);
		
		System.out.println("Welcome to Horizon Phones, a provider of cellular phone service");
		System.out.println("Find your phone plan based upon how many minutes of talk text or data.");
		System.out.println("Please enter the amount of minutes you use to find which plan is best for you. >>>>>");
		phonePlan = input.nextInt();
		
		if(phonePlan >= 500)
		{
			result = "Plan A at $49 per month";
		}
		else if(phonePlan <= 500)
		{
			result = "Plan B at $55 per month";
		}
		else if(phonePlan <500)
		{
			result = "Plan C at $61 per month";
		}
		else if(phonePlan <=100)
		{
			result = "Plan D at $70 per month";
		}
		else if(phonePlan <2)
		{
			result = "Plan E at $79 per month for up to 2 gigabytes";
		}
		else if(phonePlan >2)
		{
			result = "Plan F at $87 per month";
		}
	}

}

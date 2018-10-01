package Practice;

import java.util.Scanner;

public class DoorGame 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int doorChoice;
		String result;
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.println("Welcome to the amazing door game!");
		System.out.println("Your host Steve Harvey");
		System.out.println("Pick a door any door.  \n1- for door One\n2- for door Two\n3- for door Three");
		doorChoice= input.nextInt();
		
		if(doorChoice == 1)
		{
			result = "Pile of Gold";
		}
		else if(doorChoice == 2)
		{
			result = "Donkey, I'm a donkey";
		}
		else if(doorChoice == 3)
		{
			result = ("Bardy comitent cashier and you are 3rd in line");
		}
		else
			result = (" Nothing because that was not a choice! ");
		
		displayMessage(result);
		
		
	}		
	public static void displayMessage(String result) 
	{
		System.out.println("You won " + result);
	}

}

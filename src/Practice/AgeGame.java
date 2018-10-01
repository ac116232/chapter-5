package Practice;

import java.util.Scanner;

public class AgeGame 
{

	@SuppressWarnings("unused")
	private static char[] result;
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int usersAge;
		String result = null;
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter your age to be insulted");
		usersAge = input.nextInt();
		
		
		if(usersAge >= 12)
		{
			result = "You are a child! GO AWAY!!";
		}
		else if (usersAge >= 13 && usersAge <= 18)
		{
			result = "You are a snotty teenager!";
		}
		else if (usersAge >= 19 && usersAge <=25)
		{
			result = "Get a job";
		}
		else if (usersAge >= 26 && usersAge <=30)
		{
			result = "Find a career";
		}
		else if (usersAge >=31 && usersAge <=40)
		{
			result = "Start a family";
		}
		else if (usersAge >=41 && usersAge <=50)
		{
			result = "Continue to rasise your family";
		}
		else if (usersAge >=51 && usersAge <=60)
		{
			result = "Go on vacation and enjoy yourself!";
		}
		else if (usersAge >=61 && usersAge <=100)
		{
			result = "Just go to a nursing home";
		}
		//0-12
		//13-18
		//19-25
		//26-30
		//31-40
		//41-50
		//51-60
		//61-death
	displayMessage(result);	
	}
	public static void displayMessage(String result)
	{
		System.out.println(result);
	}
}

package Practice;

import java.util.Scanner;

public class SwitchTasksForWeek 
{

	public static void main(String[] args) 
{
		// TODO Auto-generated method stub

		  String day;
	        @SuppressWarnings("resource")
			Scanner input = new Scanner(System.in);
	        
	        System.out.print("Enter a day during the week for your schedule? >>>>  ");
	        day = input.nextLine();
	        switch(day)
	        {
	        case "Monday":
	                break;
	            case "Tuesday":
	                System.out.print("Prepare Powerpoint slides.");
	                break;
	            case "Wednesday":
	                System.out.print("Remember D&D Thursday night call to confirm.");
	                break;
	            case "Thursday":
	            	System.out.print("Order snacks for delivery");
	            case "Friday":  
	            case "Saturday":
	            case "Sunday":
	                System.out.println("It is the weekend which means getting ready for Monday.");
	                break;
	            case "Humpday":
	                System.out.println("This is not as funny as I think it is. ");
	            default:
	                System.out.print("That day does not exist to the know realm.");
		
		
	

}
}
}

package Debugging;

import java.util.Scanner;

public class FixDebugFive3 {

	private static final int LOW = 0;
	private static final int HIGH = 0;
	private static final int CUTOFF = 0;
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		new Scanner(System.in);
	      calculateOutPut();
	   }
	   public static void calculateOutPut()
	   {
	           
	      System.out.println("Please enter item number");
	      Scanner input = null;
		@SuppressWarnings("null")
		int item = input.nextInt();
	      String output;
		if(item < LOW) output = "Item number too low";
	      else
	if(item > HIGH)
	output = "Item number too high";
	      else
	if(item > CUTOFF)
	             output = "Valid - in Automotive Department";
	          else
	             output = "Valid - Item in Housewares Department";
	       System.out.println(output);
	}

}

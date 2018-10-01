package Debugging;

import javax.swing.JOptionPane;

public class FixDebugFive1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 final double HIGH_PRICE = 2.59;
	      final double MED_PRICE = 1.99;
	      final double LOW_PRICE = 0.89;
	      String usersChoiceString;
	      @SuppressWarnings("unused")
		int usersChoice;
	      double bill = 0.0;
	      usersChoiceString = JOptionPane.showInputDialog(null,
	         "Order please/n1 - Burger\2 - Hotdog" +
	         "\n3 - Grilled cheese\n4 - Fish sandwich");
	      usersChoice= Integer(usersChoiceString);
	      
	         bill = bill + HIGH_PRICE;
	      
	         bill = bill + MED_PRICE;
	      usersChoiceString = JOptionPane.showInputDialog(null,
	          "Fries with that?\n1 - Yes\n2 - No");
	      usersChoice = Integer.parseInt(usersChoiceString);
	     
	          bill = bill + LOW_PRICE;
	      JOptionPane.showMessageDialog(null,"Bill is " + bill);
	}

	private static int Integer(String usersChoiceString) {
		// TODO Auto-generated method stub
		return 0;
	}

}

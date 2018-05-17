import javax.swing.JOptionPane;

/**
 * 
 * Laura Davis CIS 260 903
 * This program converts cups from user input and converts them to ounces.
 *
 */

public class CupConverter 
{
	public static void main(String[] args)
	{
		double cups, ounces;
		
		//calls method to get the number of cups from the user
		cups = getCups();
		
		//sends cups to method to be converted
		ounces = cupsToOunces(cups);
		
		//sends ounces to be printed in a method
		displayResults(cups, ounces);
		
	System.exit(0);
	}//end of main
	
	/**
	 * gets the cups from the user and returns cups to be converted by another method
	 * 
	 * @return
	 */
	public static double getCups()
	{
		String input;
		double numCups;
		
		input = JOptionPane.showInputDialog("Enter the number of cups to be converted into ounces. ");
		numCups = Double.parseDouble(input);
		
		return numCups;
		
	}//end of getCups
	
	/**
	 * numCups is passed into this method and then multiplied by the conversion factor
	 * 8.0. The converted cups, now ounces, is saved in a variable and returned to be printed.
	 * 
	 * @param numCups
	 * @return
	 */
	public static double cupsToOunces(double numCups)
	{
		double oz;
		
		oz = numCups * 8.0;
		
		return oz;
	}//end of cupsToOunces
	
	/**
	 * cups and ounces are passed into this method so they can be printed
	 * to the user.
	 * 
	 * @param cups
	 * @param ounces
	 */
	public static void displayResults(double cups, double ounces)
	{
		JOptionPane.showMessageDialog(null, cups + " cups = " + ounces + " fluid ounces. ");
	}// end of displayResults

}//end of class

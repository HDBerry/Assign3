/**
 * @author Dustin Rosebery
 * PIN: 721
 * 
 * github url: https://github.com/HDBerry/Assign3.git
 * 
 * This class performs simple arithmetic functions and is meant as an introduction to using a repository
 */

package cse360assign3;

public class Calculator {

	private int total;
	private String history = "0";
	
	/**
	 * the constructor creates a calculator object
	 */
	public Calculator () {
		
	}
	
	/**
	 * getTotal is an accessory method to retrieve the value of the various calculations
	 * @return the value of the total
	 */
	public int getTotal () {
		return total;
	}
	
	/**
	 * add adds an input value to the total
	 * @param value to be added to the total
	 */
	public void add (int value) {
		total = total + value;
		history = history.concat(" + " + value);
	}
	
	/**
	 * subtract subtracts an input value from the total
	 * @param value to be subtracted from the total
	 */
	public void subtract (int value) {
		total = total - value;
		history = history.concat(" - " + value);
	}
	
	/**
	 * Multiply multiplies the value by the total
	 * @param value to be multiplied with total
	 */
	public void multiply (int value) {
		total = total * value;
		history = history.concat(" * " + value);
	}
	
	/**
	 * divide divides an input value from the total
	 * @param value to be be divided from the total
	 */
	public void divide (int value) {
		if (value == 0) {
			total = 0;
			history = history.concat(" / " + value);
		}
		else {
			total = total / value;
			history = history.concat(" / " + value);
		}
	}
	
	/**
	 * getHistory returns a string of the previous actions performed on the total
	 * @return a string of previous commands
	 */
	public String getHistory () {
		return history;
	}
}
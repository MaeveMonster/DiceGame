/**
 * Author: Katie Roy
 * Date: Oct 14, 2015
 * Project: Die.java
 */

public class Die {

	private int currentRoll;
	
	/**
	 * constructs a Die object
	 */
	public Die(){
		roll();
	}
	
	/**
	 * generates a random number to simulate the roll of a single die
	 */
	public void roll(){
		currentRoll = (int)((Math.random()* 6)+1);
	}
	/**
	 * Retrieves the value of this.currentRoll
	 * @return currentRoll
	 */
	public int getRoll(){
		return currentRoll;
	}
	
	/**
	 * Converts Die object data to String values and returns them
	 * @return currentRoll in String format
	 */
	@Override
	public String toString(){
		return "currentRoll: " + currentRoll;
	}
}

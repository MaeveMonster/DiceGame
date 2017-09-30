/**
 * Author: Katie Roy
 * Date: Oct 14, 2015
 * Project: Player.java
 */

public class Player {

	private int points;
	private Die d1 = new Die();
	private Die d2 = new Die();
	private int risk = 0;
	private boolean isLow;
	private int sum;

	/**
	 * Constructs a new player
	 * @param n represents name of player
	 */
	public Player(){
		points = 1000;
		risk = 0;
		isLow = true;
		sum = 0;
	}

	/**
	 * prints out this Player data
	 * @return name and current score of this Player
	 */
	@Override
	public String toString(){
		return "Current Score: " + this.points;
	}

	/**
	 * Retrieves current score for this Player
	 * @return this Player's current points
	 */
	public int getScore(){
		return this.points;
	}

	/**
	 * Sets number of points this Player is risking on current roll
	 * @param x number of points to risk
	 */
	public void setRisk(int r){
		this.risk = r;
	}

	/**
	 * Sets this Player's choice to 1 if user chose high and 0 if user chose low
	 * @param c represents user's choice of either high or low. 1 if high, 0 if low. Must be 1 or 0.
	 */
	public void setIsLow(int c){
		if(c == 1){
			this.isLow = false;
		}
		else
			this.isLow = true;
	}
	
	/**
	 * Sums numbers rolled by both dice in one turn
	 */
	public int sumRoll(){
		d1.roll();
		d2.roll();
		sum = d1.getRoll() + d2.getRoll();
		return sum;
	}
	
	/**
	 * changes Player's points according to what they rolled and called. If the call matches the roll, then the points risked are doubled and added to
	 * the total score. If the roll does not match the call, the the points risked are subtracted from the player's total.
	 */
	public void changeScore(){
		if ((this.isLow && this.sum < 7) || (!this.isLow && this.sum > 7)){
			this.points += this.risk * 2;
		}
		else
			this.points -= this.risk;
	}

}

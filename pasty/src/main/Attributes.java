package main;

public class Attributes {

		public int hitPointsMax, hitPointsCurrent, shield, movement, damage;
	

	/**
	 * @param hpm
	 * @param hpc
	 * @param sh
	 * @param move
	 * @param dmg
	 * 
	 * Overloaded constructor to set all values when the class is initialised
	 */
	public Attributes(int hpm, int hpc, int sh, int move, int dmg) {
		hitPointsMax = hpm;
		hitPointsCurrent = hpc;
		shield = sh;
		movement = move;
		damage = dmg;
	}

	/**
	 * setHitPointsMax Set the Value of HitPointsMax
	 */
	public void setHitPointsMax(int hpm) {
		hitPointsMax = hpm;
	}

	/**
	 * getHitPointMax Returns the value of HitPointsMax
	 */
	public int getHitPointMax() {
		return 0;
	}

	/**
	 * setHitPointsMax Set the Value of HitPointsCurrent
	 */
	public void setHitPointsCurrent(int hpc) {
		hitPointsCurrent = hpc;
	}

	/**
	 * getHitPointMax Returns the value of HitPointsCurrent
	 */
	public int getHitPointCurrent() {
		return 0;
	}

	/**
	 * setHitPointsMax Set the Value of Shield
	 */
	public void setShield(int sh) {
		shield = sh;
	}

	/**
	 * getHitPointMax Returns the value of Shield
	 */
	public int getSheild() {
		return 0;
	}

	/**
	 * setHitPointsMax Set the Value of Movement
	 */
	public void setMovement(int move) {
		movement = move;
	}

	/**
	 * getHitPointMax Returns the value of Movement
	 */
	public int getMovement() {
		return 0;
	}

	/**
	 * setHitPointsMax Set the Value of Damage
	 */
	public void setDamage(int dmg) {
		damage = dmg;
	}

	/**
	 * getHitPointMax Returns the value of Movement
	 */
	public int getDamage() {
		return 0;
	}

}

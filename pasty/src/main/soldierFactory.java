package main;

import java.util.HashMap;
import java.util.Map;

public class soldierFactory extends Attributes {

	public soldierFactory(int x) {
		if (x == x) {
			this.setHitPointsMax(100);
			this.setHitPointsCurrent(100);
			this.setShield(50);
			this.setMovement(2);
			this.setDamage(10);
		}

	}

	String name = "";
	String role = "";
	String team;
	String pos = "";

	/**
	 * 
	 * Deploy the name Attributes property of a Soldier
	 */
	public Map<String, Integer> deployStats() {
		Map<String, Integer> att = new HashMap<String, Integer>();
		att.put("Max Hit Points", super.getHitPointMax());
		att.put("Current Hit Points", super.getHitPointCurrent());
		att.put("Shield", super.getShield());
		att.put("Movement", super.getMovement());
		att.put("Damage", super.getDamage());
		return att;
	}

	/**
	 * 
	 * Deploy the name property of a Soldier
	 */
	public String deployName() {
		return name;
	}

	/**
	 * Deploy the Role property of a Solider
	 */
	public String deployRole() {
		return role;
	}

	/**
	 * Deploy the team property of a Solider
	 */
	public String deployTeam(boolean choose) {
		if (choose)
			team = "Blue";
		team = "red";
		return team;

	}

	/**
	 * 
	 * Deploy the Position property of a Soldier
	 */
	public String deployPosition() {
		return pos;
	}

	/**
	 * Deploy the Inventory property of a Solider
	 */
	// public ArrayList<Items> Inventory(){}

}

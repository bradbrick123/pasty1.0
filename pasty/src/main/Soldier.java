package main;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Soldier extends soldierFactory {
	private String position;
	private String name;
	Random r = new Random();

	public Soldier(int x) {
		super(x);		
		this.setName();
	}

	/**
	 * @return
	 * 'pack' all soldier details into a Map Object to represent a soldier
	 */
	public Map<String, Object> congregateSoldierDetails() {
		
		Map<String, Object> sol = new HashMap<String, Object>();
		sol.put("Soldier Name", this.getName());
		sol.put("Soldier Role", "Basic");
		sol.put("Soldier Position", this.getPos());
		sol.put("Soldier Attributes", this.deployStats());
		sol.put("Solider Team", this.deployTeam(true));
		return sol;
	}

	/**
	 * @return
	 * Useful method for retrieved soldier details from extracting all keys and values to a String
	 */
	public String PrintsoldierDetails() {
		String ret = "";
		for (Map.Entry<String, Object> ea : congregateSoldierDetails().entrySet()) {
			ret = ret.concat(((ea.getKey().toString() + " : " + ea.getValue()
					.toString())));
			ret = ret.concat(System.getProperty("line.separator"));
		}
		return ret;

	}

	/**
	 * @param pos
	 * 
	 * Soldier Position is now set manually as opposed to random assignment
	 */
	public void setPos(String pos) {
		/*if(position == null){
		int lon = 10;
		int lat = r.nextInt(10) + 1;
		String pos = (lon + ", " + lat);
		}*/
		position = pos;
		
	}

	public String getPos() {
		return position;
	}

	public void setName() {
		if(name ==null){
		String salt = Integer.toString((r.nextInt(10000)));
		String nam = "sol".concat(salt);
		name = nam;
		}
	}

	public String getName() {
		return name;
	}

}

package main;
import main.Map;


/**
 * @author Brad
 * 
 *         Class Map is responsible for the generation of the base map and
 *         invoking other classes, this is where the game even is triggered.
 */

public class Main {

	/**
	 * Method 'main' acts as the entry point of pasty1.0
	 */
	public static void main(String args[]) {
		Map map = new Map();
		map.generateBaseMap();
		
				
	}

	/**
	 * Create the base map buy utilising JFrame, JPanel, JLabel, Dimension and ImageIcon.
	 * A Label Listener has also been created.
	 */
	
}

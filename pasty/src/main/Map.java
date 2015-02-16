package main;

//import java.util.*;
import java.awt.*;

import javax.swing.*;

/**
 * @author Brad
 * 
 *         Class Map is responsible for the generation of the base map and
 *         invoking other classes, this is where the game even is triggered.
 */

public class Map {

	/*
	 * Method 'main' acts as the entry point of pasty1.0
	 */
	public static void main(String args[]) {
		generateBaseMap();
	}

	/*
	 * Create the base map buy utilising JFrame, JPanel, JLabel, Dimension and ImageIcon.
	 * A Label Listener has also been created.
	 */
	private static void generateBaseMap() {
		Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
		JFrame mainFrame = new JFrame("Pasty 1.0");

		mainFrame.setBounds((int) (d.getWidth() / 1.3),
				(int) (d.getHeight() / 1.3), (int) (d.getWidth() / 1.3),
				(int) (d.getHeight() / 1.3));
		mainFrame.setVisible(true);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setLocation((int) d.getWidth() / 7, (int) d.getHeight() / 7);

		JPanel gridPanel = new JPanel(new BorderLayout());
		gridPanel.setBackground(Color.lightGray);
		gridPanel.setLayout(new GridLayout(10, 10));
		gridPanel.setBorder(BorderFactory.createEmptyBorder(2, 2, 2, 2));
		mainFrame.add(gridPanel);
		JLabel label[][] = new JLabel[11][11];

		for (int i = 1; i < 11; i++) {
			for (int ii = 1; ii < 11; ii++) {
				label[i][ii] = new JLabel("" + i+", "+ii);
				label[i][ii].addMouseListener(new LabelListener());
					label[i][ii].setBorder(BorderFactory
						.createLineBorder(Color.BLACK));
					label[i][ii].setName(label[i][ii].getName());
				gridPanel.add(label[i][ii]);
				label[i][ii].setIcon(new ImageIcon("../img/grass.png"));
			}
		}

	}
	
	/**
	 *  returns boolean to say whether the cell is empty (doesn’t have wall or person there) 
	 */
	private boolean getCellEmpty(){ return false;} 
	
	
	
	/**
	 * clears the status of a cell back to 0
	 */
	private void setCellEmpty(String cell){}
	
	
	
	
	/**
	 * sets the status of a cell to being occupied by a player (7)
	 */
	private void setCellFilled(String cell){}
	private String getDisplacement(){ return "";}
	private void getArea(){} // checks the adjacent squares to see if eligible for blind fire / bracing / full cover save. Return type TBC..
	private void getCover(){} //checks if there is any cover between input player A and B ignoring any cover which is found by getArea. 
							//(in other words checks to see if the enemy has any cover and ignores if the firer has cover). Return type TBC..
	

}

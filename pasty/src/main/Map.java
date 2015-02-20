package main;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.*;

public class Map extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 1) Create UI Frame
	 * 
	 * 2) Create labels with actionListeners for Label manipulation 3) change
	 * label images depending on soldier "positions"
	 */
	public void generateBaseMap() {
		Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
		JFrame mainFrame = new JFrame("Pasty 1.0");

		mainFrame.setBounds((int) (d.getWidth() / 1.3),
				(int) (d.getHeight() / 1.3), (int) (d.getWidth() / 1.3),
				(int) (d.getHeight() / 1.3));

		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setLocation((int) d.getWidth() / 7, (int) d.getHeight() / 7);
		JPanel mainPanel = new JPanel(new BorderLayout());
		JPanel gridPanel = new JPanel(new BorderLayout());
		JPanel textPanel = new JPanel(new BorderLayout());
		gridPanel.setMaximumSize(new Dimension(mainFrame.getWidth() / 2,
				mainFrame.getWidth() / 2));
		gridPanel.setBackground(Color.lightGray);
		textPanel.setBackground(Color.lightGray);
		gridPanel.setLayout(new GridLayout(10, 10));
		textPanel.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		gridPanel.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		mainPanel.add(textPanel, BorderLayout.SOUTH);
		mainPanel.add(gridPanel);
		JTextArea sText = new JTextArea(15, 60);
		sText.setEditable(false);
		sText.setLineWrap(true);
		JScrollPane scroll = new JScrollPane(sText);
		scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		textPanel.add(scroll, BorderLayout.EAST);
		JLabel label[][] = new JLabel[11][11];
		Soldier[] sol = createSoldiersRed(9);
		for (int i = 1; i < 11; i++) {
			for (int ii = 1; ii < 11; ii++) {
				label[i][ii] = new JLabel("" + i + ", " + ii, JLabel.CENTER);
				label[i][ii].addMouseListener(new MouseListener() {

					@Override
					public void mouseClicked(MouseEvent arg0) {

					}

					/*
					 * (non-Javadoc)
					 * 
					 * @see
					 * java.awt.event.MouseListener#mouseEntered(java.awt.event
					 * .MouseEvent)
					 */

					/*
					 * (non-Javadoc)
					 * 
					 * @see
					 * java.awt.event.MouseListener#mouseEntered(java.awt.event
					 * .MouseEvent) When mouse enters label, so a check to
					 * retrieve potential soldier into Change border colour for
					 * 'viewable' tracking
					 */
					@Override
					public void mouseEntered(MouseEvent arg0) {
						JLabel labelX = (JLabel) arg0.getSource();
						String label = labelX.getIcon().toString();
						String redIcon = "../img/red/red_up.png";
						labelX.setBorder(BorderFactory
								.createLineBorder(Color.YELLOW));
						if (label.equals(redIcon)) {
							for (int i = 0; i < sol.length; i++) {
								if (labelX.getName().equals(sol[i].getPos())) {
									sText.setText((sol[i].PrintsoldierDetails()));
								}

							}

						}
					}

					@Override
					public void mouseExited(MouseEvent arg0) {
						JLabel labelX = (JLabel) arg0.getSource();
						labelX.setBorder(BorderFactory
								.createLineBorder(Color.BLACK));
						sText.setText("");
					}

					@Override
					public void mousePressed(MouseEvent arg0) {
						JLabel labelX = (JLabel) arg0.getSource();
						labelX.setBorder(BorderFactory
								.createLineBorder(Color.BLACK));
						JOptionPane.showMessageDialog(null, labelX.getName());

					}

					@Override
					public void mouseReleased(MouseEvent e) {
					}

				});
				label[i][ii].setBorder(BorderFactory
						.createLineBorder(Color.BLACK));
				label[i][ii].setName(label[i][ii].getText());
				label[i][ii].setText("");
				gridPanel.add(label[i][ii]);
				label[i][ii].setIcon(new ImageIcon("../img/grass.png"));

			}
		}

		mainFrame.setContentPane(mainPanel);

		mainFrame.setVisible(true);

		/*
		 * Get Soldier positions from Soldier details and add the correct image to the corresponding position label
		 * 
		 */

		ImageIcon image = new ImageIcon("../img/red/red_up.png");
		JLabel l = new JLabel(image);
		Component[] c = gridPanel.getComponents();
		for (int teamCount = 0; teamCount < sol.length; teamCount++) {
			String pos = ((sol[teamCount]).congregateSoldierDetails()
					.get("Soldier Position")).toString();
			for (int x = 0; x < c.length; x++) {
				if (c[x] instanceof JLabel) {
					if (c[x].getName().equals(pos)) {
						JLabel temp = (JLabel) c[x];
						temp.setIcon(null);
						temp.setIcon(image);

					}
				}
			}

		}

	}

	/**
	 * returns boolean to say whether the cell is empty (doesn’t have wall or
	 * person there)
	 */
	public Soldier[] createSoldiersRed(int teamCount) {
		teamCount++;
		if (teamCount > 10) {
			JOptionPane.showMessageDialog(null, "Too many players");
			System.exit(0);
		}
		Soldier[] sol = new Soldier[teamCount];
		for (int inc = 0; inc < teamCount; inc++) {
			Soldier meh = new Soldier(1);
			meh.setPos("10, " + inc);
			sol[inc] = meh;

		}

		return sol;
	}

	public boolean getCellEmpty() {
		return false;
	}

	/**
	 * clears the status of a cell back to 0
	 */
	public void setCellEmpty(String cell) {
	}

	/**
	 * sets the status of a cell to being occupied by a player (7)
	 */
	public void setCellFilled(String cell) {
	}

	public String getDisplacement() {
		return "";
	}

	public void getArea() {
	} // checks the adjacent squares to see if eligible for blind fire / bracing
		// / full cover save. Return type TBC..

	public void getCover() {
	} // checks if there is any cover between input player A and B ignoring any
		// cover which is found by getArea.
		// (in other words checks to see if the enemy has any cover and ignores
		// if the firer has cover). Return type TBC..

	public void laySoldiersOnMap() {

	}

}

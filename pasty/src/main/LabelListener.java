package main;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class LabelListener implements MouseListener {

	@Override
	public void mouseClicked(MouseEvent arg0) {
		
	}

	/* (non-Javadoc)
	 * @see java.awt.event.MouseListener#mouseEntered(java.awt.event.MouseEvent)
	 * 
	 * 
	 */
	@Override
	public void mouseEntered(MouseEvent arg0) {
		JLabel labelX=(JLabel)arg0.getSource(); 
		labelX.setBorder(BorderFactory
				.createLineBorder(Color.YELLOW));
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		JLabel labelX=(JLabel)arg0.getSource(); 
		labelX.setBorder(BorderFactory
				.createLineBorder(Color.BLACK));
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		JLabel labelX=(JLabel)arg0.getSource();
		JOptionPane.showMessageDialog(null, labelX.getText());
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
	

	}

}

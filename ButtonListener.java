package homework4;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

/**
 * Create JRadion Buttons.
 * Create 
 * @author aabdin02
 *
 */

public class ButtonListener implements ActionListener{

	private JPanel panel; // panel to redraw

	public ButtonListener(JPanel panel) {
		this.panel = panel;
		
		System.out.println("iahskeia;a");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		panel.repaint();
	}

}

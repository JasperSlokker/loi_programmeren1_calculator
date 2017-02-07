package rekenmachine.helpers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;

public class ButtonActie implements ActionListener {

	private JButton[] numButtons;
	private JTextField invoerVeld;

	public ButtonActie(JTextField invoerVeld, JButton[] numButtons) {
		this.invoerVeld = invoerVeld;
		this.numButtons = numButtons;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String invoer = invoerVeld.getText();
		Object source = e.getSource();
		System.out.println("Action event: " + e.getActionCommand());
		System.out.println("Verkregen invoer: " + invoer);
		for (int i = 0; i < numButtons.length; i++) {
			if (source == numButtons[i]) {
				invoer = invoer + numButtons[i].getText();
				System.out.println("Invoer na drukken: " + invoer);
			}
		}
		invoerVeld.setText(invoer);
	}
}

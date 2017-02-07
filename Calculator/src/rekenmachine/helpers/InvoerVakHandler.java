package rekenmachine.helpers;

import java.awt.event.ActionEvent;

import javax.swing.JTextField;

public class InvoerVakHandler {

	private JTextField invoerVak;

	public InvoerVakHandler(JTextField invoerVak) {
		this.invoerVak = invoerVak;
	}

	public void actionPerformed(ActionEvent e) {
		String invoer = invoerVak.getText();
		try {
			System.out.println(e.getActionCommand());
		} catch (NumberFormatException f) {

		}
	}
}

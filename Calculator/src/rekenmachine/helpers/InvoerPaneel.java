package rekenmachine.helpers;

import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.JTextField;

public class InvoerPaneel extends JPanel{
	private JTextField invoerVak;

	public InvoerPaneel() {
		invoerVak = new JTextField(10);
		invoerVak.setBounds(40, 40, 320, 300);
		invoerVak.addActionListener((ActionListener) new InvoerVakHandler(invoerVak));
		invoerVak.setHorizontalAlignment(JTextField.RIGHT);

		add(invoerVak);
	}
}

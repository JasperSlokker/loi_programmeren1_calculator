package rekenmachine.helpers;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class RekenmachinePaneel extends JPanel {
	private JButton[] numButtons;
	double invoergetal1, invoergetal2, resultaatgetal;
	private JTextField invoerVeld;
	public JLabel reclame;

	public RekenmachinePaneel() {
		setLayout(new BorderLayout(5, 5));

		JPanel buttons = new JPanel();
		buttons.setLayout(new GridLayout(4, 3, 100, 100));

		String[] buttonInput = new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "0", "-", "+", "/", "*", "c",
				"=" };
		numButtons = new JButton[buttonInput.length];

		invoerVeld = new JTextField();
		invoerVeld.setSize(new Dimension(100, 60));
		
		for (int i = 0; i < buttonInput.length; i++) {
			System.out.println("Huidige Button waarde: " + buttonInput[i]);
			JButton btn = new JButton(buttonInput[i]);
			btn.setSize(new Dimension(300, 300));
			btn.addActionListener(new ButtonActie(invoerVeld, numButtons));
			numButtons[i] = btn;
			buttons.add(btn);
		}

		reclame = new JLabel();
		reclame.setSize(new Dimension(60, 60));

		add(invoerVeld, BorderLayout.NORTH);
		add(buttons, BorderLayout.CENTER);
		add(reclame, BorderLayout.SOUTH);
	}
}

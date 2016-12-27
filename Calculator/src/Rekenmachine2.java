
/*
 *
 *
 * Rekentoestel
 *
 */

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.AbstractButton;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;

//Frame voor rekenmachine
public class Rekenmachine2 extends JFrame {

	public Rekenmachine2() {
		getContentPane().setLayout(null);
	}

	public static void main(String args[]) {
		JFrame frame = new Rekenmachine();
		frame.setSize(400, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Rekenmachine EV");

		frame.setContentPane(new RekenmachinePaneel());
		frame.setVisible(true);
	}
}

class InvoerPaneel extends JPanel {
	private JTextField invoerVak;

	public InvoerPaneel() {
		invoerVak = new JTextField(10);
		invoerVak.setBounds(40, 40, 320, 300);
		invoerVak.addActionListener(new InvoerVakHandler());
		invoerVak.setHorizontalAlignment(JTextField.RIGHT);

		add(invoerVak);
	}

	class InvoerVakHandler implements ActionListener {
public void actionPerformed(ActionEvent e) {
String invoer = invoerVak.getText();
try {
double invoerGetal = Double.parseDouble(invoer);
if (invoerGetal <= 99999999) {
// errorMessage.setText("");
}
else {
// errorMessage.setText("Invoer te groot");
}
{
catch (NumberFormatException f ) {
        // errorMessage.setText("Invoer van onjuist getal");
      		}
		}
    }
  }
	}

	class RekenmachinePaneel extends JPanel {

		private JButton[] numButtons;
		double invoergetal1, invoergetal2, resultaatgetal;
		private JTextField invoerVeld;
		//public JLabel reclame;
		private JButton reclame;

		public RekenmachinePaneel() {
			setLayout(new BorderLayout(5, 5));

			JPanel buttons = new JPanel();
			buttons.setLayout(new GridLayout(4, 4, 10, 10));

			String[] buttonInput = new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "0", "-", "+", "/", "*",
					"c", "=" };
			numButtons = new JButton[buttonInput.length];
			for (int i = 0; i < buttonInput.length; i++) {
				JButton btn = new JButton(buttonInput[i]);
				btn.setSize(new Dimension(60, 60));
				btn.addActionListener(new ButtonActie());
				numButtons[i] = btn;
				buttons.add(btn);
				
			
			}

			invoerVeld = new JTextField();
			invoerVeld.setSize(new Dimension(60, 60));
		

			reclame = new JButton("Reclame");
			//reclame.setSize(new Dimension(60, 60));
			

			add(invoerVeld, BorderLayout.NORTH);
			add(buttons, BorderLayout.CENTER);
			add(reclame, BorderLayout.SOUTH);
		}

		class ButtonActie implements ActionListener {
			public void actionPerformed(ActionEvent e) {
				String invoer = invoerVeld.getText();
				Object source = e.getSource();

				for (int i = 0; i < numButtons.length; i++) {
					if (source == numButtons[i]) {
						invoer = invoer + numButtons[i].getText();
					}
				}
				invoerVeld.setText(invoer);
			}
		}
	}
}

// public class DigitButton extends JButton implements ActionListener {
// final int digit;
//
// public DigitButton(int digit) {
// super("" + digit); // trucje om het getal als een string te gebruiken..
// this.digit = digit;
// addActionListener(this);
// }
//
// public void actionPerformed(ActionEvent e) {
// invoer.setText(invoer.getText() + digit); //plakt het nieuwe getal aan het
// bestaande getal...
// }
// }
//// met de volgende code maak je 9 buttons aan.
//
//
// mainPanel.add(invoer);
// for (int i = 1 ; i<= 9 ; i++) {
// mainPanel.add(new DigitButton(i));

/*
 *  * class maalHandler implements ActionListener { public void  *
 * actionPerformed(ActionEvent e) { String invoer1 = invoervak.getText();  *
 * invoergetal1 = Double.parseDouble(invoer1); String invoer2 =  *
 * invoervak2.getText(); invoergetal2 = Double.parseDouble(invoer2);  *
 * resultaatgetal = invoergetal1 * invoergetal2; resultaat.setText("" +  *
 * resultaatgetal); } } class plusHandler implements ActionListener { public  *
 * void actionPerformed(ActionEvent e) { String invoer1 = invoervak1.getText();
 *  * invoergetal1 = Double.parseDouble(invoer1); String invoer2 =  *
 * invoervak2.getText(); invoergetal2 = Double.parseDouble(invoer2);  *
 * resultaatgetal = invoergetal1 + invoergetal2; resultaat.setText("" +  *
 * resultaatgetal); } } class delenHandler implements ActionListener { public  *
 * void actionPerformed(ActionEvent e) { String invoer1 = invoervak1.getText();
 *  * invoergetal1 = Double.parseDouble(invoer1); String invoer2 =  *
 * invoervak2.getText(); invoergetal2 = Double.parseDouble(invoer2);  *
 * resultaatgetal = invoergetal1 / invoergetal2; resultaat.setText("" +  *
 * resultaatgetal); } } class aftrekkenHandler implements ActionListener {  *
 * public void actionPerformed(ActionEvent e) { String invoer1 =  *
 * invoervak1.getText(); invoergetal1 = Double.parseDouble(invoer1); String  *
 * invoer2 = invoervak2.getText(); invoergetal2 = Double.parseDouble(invoer2);
 *  * resultaatgetal = invoergetal1 - invoergetal2; resultaat.setText("" +  *
 * resultaatgetal); } } }  
 */

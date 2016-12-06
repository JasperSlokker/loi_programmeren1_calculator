/*
 * 
 *
 * Rekentoestel
 *
 */

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class Rekenmachine extends JFrame {
	public static void main( String args[ ]) {
		JFrame frame = new Rekenmachine();
		frame.setSize(400, 600);
		frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		frame.setTitle (" Rekenmachine" );
		frame.setContentPane( new RekenmachinePaneel() );
		frame.setVisible(true);
	}
}
class RekenmachinePaneel extends JPanel {
	private JTextField invoerVak;
	private JButton maal, plus, delen, aftrekken, resultaat, correctie, getaleen, getaltwee, getaldrie, getalvier, getalvijf, getalzes, getalzeven, getalacht, getalnegen, getalnul; 
	double invoergetal1, invoergetal2, resultaatgetal;
	private Rekenmachine rekenmachine;
	
	
	public RekenmachinePaneel() {
		setLayout( null );
//		Border border = BorderFactory.createEmptyBorder(5,5,5,5);
//		setBorder( border );
//		
	rekenmachine = new Rekenmachine();
	
	invoerVak = new JTextField( 10 );
	invoerVak.setBounds(40, 40, 320, 40);
	invoerVak.addActionListener( new InvoerVakHandler());
	invoerVak.setHorizontalAlignment(JTextField.RIGHT);
	
	getaleen = new JButton ("1");
	getaleen.setBounds( 40, 150, 60, 60);
	getaltwee = new JButton ("2");
	getaltwee.setBounds( 126, 150, 60, 60);
	getaldrie = new JButton ("3");
	getaldrie.setBounds( 213, 150, 60, 60);
	plus = new JButton("+");
	plus.setBounds( 300, 150, 60, 60);
	
	getalvier = new JButton ("4");
	getalvier.setBounds(40, 236, 60, 60);
	getalvijf = new JButton ("5");
	getalvijf.setBounds( 126, 236, 60, 60);
	getalzes = new JButton ("6");
	getalzes.setBounds( 213, 236, 60, 60);
	aftrekken = new JButton("-");
	aftrekken.setBounds( 300, 236, 60, 60);
		
	getalzeven = new JButton ("7");
	getalzeven.setBounds( 40, 323, 60, 60);
	getalacht = new JButton ("8");
	getalacht.setBounds( 126, 323, 60, 60);
	getalnegen = new JButton ("9");
	getalnegen.setBounds( 213, 323, 60, 60);
	maal = new JButton("x");
	maal.setBounds( 300, 323, 60, 60);	
	
	correctie = new JButton("C");
	correctie.setBounds(40, 410, 60, 60);
	getalnul = new JButton ("0");
	getalnul.setBounds(126, 410, 60, 60);
	resultaat = new JButton("=");
	resultaat.setBounds(213, 410, 60, 60);
	delen = new JButton("/");
	delen.setBounds(300, 410, 60, 60);

		add (getaleen);
		add (getaltwee );
		add (getaldrie );
		add (getalvier );
		add (getalvijf );
		add (getalzes );
		add (getalzeven );
		add (getalacht);
		add (getalnegen );
		add (getalnul );		
		add (invoerVak);
		add (maal);
		add (plus);
		add (delen);
		add (aftrekken);
		add (resultaat);
		add (correctie);
			
	}
	
	class InvoerVakHandler implements ActionListener {
		public void actionPerformed ( ActionEvent e) {
			String invoer = invoerVak.getText();
			double invoerGetal = Double.parseDouble( invoer );
			
		}
	}
	
//	public class DigitButton extends JButton implements ActionListener {
//        final int digit; 
//        
//        public DigitButton(int digit) {
//            super("" + digit); // trucje om het getal als een string te gebruiken..
//            this.digit = digit;
//            addActionListener(this);
//        }
//        
//        public void actionPerformed(ActionEvent e) {
//           invoer.setText(invoer.getText() + digit); //plakt het nieuwe getal aan het bestaande getal... 
//        }
//}
////met de volgende code maak je 9 buttons aan. 
//
//
//mainPanel.add(invoer);
//    for (int i = 1 ; i<= 9 ; i++) {
//        mainPanel.add(new DigitButton(i));

}


/*
	class maalHandler implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			String invoer1 = invoervak.getText();
			invoergetal1 = Double.parseDouble(invoer1);

			String invoer2 = invoervak2.getText();
			invoergetal2 = Double.parseDouble(invoer2);

			resultaatgetal = invoergetal1 * invoergetal2;
			resultaat.setText("" + resultaatgetal);
		}
	}

	class plusHandler implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String invoer1 = invoervak1.getText();
			invoergetal1 = Double.parseDouble(invoer1);

			String invoer2 = invoervak2.getText();
			invoergetal2 = Double.parseDouble(invoer2);

			resultaatgetal = invoergetal1 + invoergetal2;
			resultaat.setText("" + resultaatgetal);
		}

	}

	class delenHandler implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String invoer1 = invoervak1.getText();
			invoergetal1 = Double.parseDouble(invoer1);

			String invoer2 = invoervak2.getText();
			invoergetal2 = Double.parseDouble(invoer2);

			resultaatgetal = invoergetal1 / invoergetal2;
			resultaat.setText("" + resultaatgetal);
		}

	}

	class aftrekkenHandler implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String invoer1 = invoervak1.getText();
			invoergetal1 = Double.parseDouble(invoer1);

			String invoer2 = invoervak2.getText();
			invoergetal2 = Double.parseDouble(invoer2);

			resultaatgetal = invoergetal1 - invoergetal2;
			resultaat.setText("" + resultaatgetal);
		}

	} 
}*/
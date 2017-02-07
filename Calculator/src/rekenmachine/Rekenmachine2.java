package rekenmachine;

/*
*
*
* Rekentoestel
*
*/

import javax.swing.JFrame;

import rekenmachine.helpers.RekenmachinePaneel;

//Frame voor rekenmachine
public class Rekenmachine2 extends JFrame {

	public Rekenmachine2() {
		getContentPane().setLayout(null);
	}
	
	public static void main(String args[]) {
		JFrame frame = new Rekenmachine2();
		frame.setSize(400, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle(" Rekenmachine 4");

		frame.setContentPane(new RekenmachinePaneel());
		frame.setVisible(true);
	}
}
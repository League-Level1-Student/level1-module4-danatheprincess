package _01_nasty_surprise;

import java.awt.Frame;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class NastySurprise {

	
	JFrame frame=new JFrame();
	JPanel panel=new JPanel();
	JButton button=new JButton("Trick");
	JButton button1=new JButton("Treat");
	void run() {
		frame.setVisible(true);
		frame.add(panel);
		panel.add(button);
		
	}
	
}

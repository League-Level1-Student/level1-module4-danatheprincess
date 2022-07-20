package _04_chuckle_clicker;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener {
	JFrame frame=new JFrame();
	JPanel panel=new JPanel();
	JButton button=new JButton("joke");
	JButton button1 =new JButton("punchline");
	
public ChuckleClicker(){
	
	
	
	frame.add(panel);
	frame.setVisible(true);
	panel.add(button);
	
	panel.add(button1);
	button.addActionListener(this);
	frame.pack();
	
	
	
	
	
	
}

@Override
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
	//if(button==mousedPressed) {
		JOptionPane.showMessageDialog(null, "hi");
	}
}

}

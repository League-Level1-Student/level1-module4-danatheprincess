package _01_nasty_surprise;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NastySurprise implements ActionListener {

	
	JFrame frame=new JFrame();
	JPanel panel=new JPanel();
	JButton button=new JButton("Trick");
	JButton button1=new JButton("Treat");
	void run() {
		frame.setVisible(true);
		frame.add(panel);
		panel.add(button);
		panel.add(button1);
		button.addActionListener(this);
		button1.addActionListener(this);
		frame.pack();
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("click");
	if(arg0.getSource()==button) {
		String puppy="https://s3.amazonaws.com/cdn-origin-etr.akc.org/wp-content/uploads/2021/05/25082143/Alaskan-Malamute-puppy-laying-down-outdoors.jpg";
	    showPictureFromTheInternet(puppy);
	 }else {
		 String scary="https://i.pinimg.com/550x/74/3d/a7/743da7dd3f887cf416237dcb35c298d8.jpg";
		 showPictureFromTheInternet(scary);
	 }
	}
	private void showPictureFromTheInternet(String imageUrl) {
	    try {
	        URL url = new URL(imageUrl);
	        Icon icon = new ImageIcon(url);
	        JLabel imageLabel = new JLabel(icon);
	        JFrame frame = new JFrame();
	        frame.add(imageLabel);
	        frame.setVisible(true);
	        frame.pack();
	    } catch (MalformedURLException e) {
	        e.printStackTrace();
	    }
	}
}

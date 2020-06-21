

/**
 * 
 */
package Program;

import javax.swing.JFrame;


import javax.swing.JOptionPane;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.*;

import java.awt.Color;
import java.awt.FlowLayout;


/**
 * @author Safkat Khan
 *
 */
public class GuiProgram {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		JFrame myWindow = new JFrame("myWindow");
		myWindow.setLayout(new FlowLayout());
		//add icon
				myWindow.setVisible(true);
				Icon rocket = new ImageIcon(GuiProgram.class.getResource("spring-swing-rocket.png"));
				
		//add label
		JLabel myLabel = new JLabel("My Label", rocket,SwingConstants.LEFT);
		myLabel.setForeground(Color.WHITE);
		myLabel.setToolTipText("This is my Label");
		myLabel.setIcon(rocket);
		myLabel.setHorizontalTextPosition(SwingConstants.LEFT);
		myWindow.add(myLabel);
		//Add textField
		JTextField myTextField = new JTextField("Enter your name: ", 20);
		myTextField.setLocation(0,40);
		myWindow.add(myTextField);
		
		
		//modify myWindo properties
		myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myWindow.setSize(500,500);
		myWindow.setAlwaysOnTop(true);
		myWindow.getContentPane().setBackground(Color.GREEN);
		myWindow.setLocation(200,200);
		myWindow.setResizable(true);
		

		
		
	

	}

}

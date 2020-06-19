

/**
 * 
 */
package Program;

import javax.swing.JFrame;

import javax.swing.JOptionPane;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.*;
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
		String firstNumber = "";
		String secondNumber= "";
		JFrame myWindow = new JFrame("myWindow");
		myWindow.setLayout(new FlowLayout());
		//add icon
				myWindow.setVisible(true);
				Icon rocket = new ImageIcon(GuiProgram.class.getResource("spring-swing-rocket.png"));
				
		//add label
		JLabel myLabel = new JLabel("My Label", rocket,SwingConstants.LEFT);
	
		myLabel.setToolTipText("This is my Label");
		myLabel.setIcon(rocket);
		myWindow.add(myLabel);
		
		
		try {
			 firstNumber = 
						JOptionPane.showInputDialog("Enter First Integer");
			 System.out.println(firstNumber);
			 secondNumber = 
						JOptionPane.showInputDialog("Enter second Integer");
			 System.out.println(secondNumber);
			 
				
				int number1 = Integer.parseInt(firstNumber);
				int number2 = Integer.parseInt(secondNumber);
				
				int sum = number1 + number2;
				

				JOptionPane.showMessageDialog(null, "The sum is "+ sum, " Sum of two integers ", JOptionPane.PLAIN_MESSAGE);
				
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, "incorrect Values Entered");
			System.out.println(e);
		}
		
	

	}

}

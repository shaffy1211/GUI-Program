

/**
 * 
 */
package Program;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

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

package Program;

import javax.swing.JFrame;


import javax.swing.JOptionPane;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.*;

import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JFrame;

import javax.swing.JOptionPane;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.*;
import java.awt.FlowLayout;


public class BuildingJPanel {
//JLabel: Displays uneditable text or icons
	//Jtextfield: recieves input from the user
	//Jbutton: triggers an event when clicked with the mouse
	//JCheckbox: Specifies an option that can be selected or not selected
	//JComboBox: A drop down List of items which user can make a selection
	//Jlist: A list of items from which the user can make a selection by clicking on any one of them
	//JPanel: the whole area all the above components can be placed in
	public static void main(String[] args) {
	
	String firstNumber = "";
	String secondNumber = "";
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

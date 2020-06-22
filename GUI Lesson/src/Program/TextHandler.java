package Program;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import javax.swing.JPasswordField;

import javax.swing.JTextField;

public class TextHandler implements ActionListener {
	
	private JTextField _textField1;
	private JPasswordField _passwordField;
	
	public TextHandler(JTextField textField,JPasswordField passwordField) {
		this._textField1 = textField;
		this._passwordField = passwordField;
	}
	
	
	@Override
	public void actionPerformed(ActionEvent event) {
		
	if(event.getSource() == this._textField1) {
		System.out.println("textfield clicked");
	}else if(event.getSource() == this._passwordField) {
		System.out.println("passwordfield clicked");
	}else {
		System.out.println("something else happened");
	}
	}

}

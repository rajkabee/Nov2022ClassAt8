package com.swingGui;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class SwingFormFields {
	static JTextField nameField;
	static JTextField emailField;
	static JTextField phoneField;
	static JPasswordField passwordField; 
	static JPasswordField confirmPasswordField;
	static JRadioButton maleRadio;
	static JRadioButton femaleRadio;
	
	
	public static void main(String[] args) {
		Frame frame = new Frame("Swing Form Fields");
		setUIFont(new javax.swing.plaf.FontUIResource("Serif",Font.ITALIC,20));
		frame.setLayout(null);
		
		JLabel header = new JLabel("SignUp Form");
		header.setBounds(200, 10, 400, 40);
		header.setHorizontalAlignment(JLabel.CENTER);
		header.setFont(new Font("algerian", 0, 40));
		frame.add(header);
		
		JLabel nameLabel = new JLabel("Name: ");
		nameLabel.setBounds(200, 80, 200, 30);
		frame.add(nameLabel);
		
		JLabel emailLabel = new JLabel("Email: ");
		emailLabel.setBounds(200, 110, 200, 30);
		frame.add(emailLabel);
		
		JLabel phoneLabel = new JLabel("Phone No.: ");
		phoneLabel.setBounds(200, 140, 200, 30);
		frame.add(phoneLabel);
		
		JLabel passwordLabel = new JLabel("Password: ");
		passwordLabel.setBounds(200, 170, 200, 30);
		frame.add(passwordLabel);
		
		JLabel confirmPasswordLabel = new JLabel("Confirm Password: ");
		confirmPasswordLabel.setBounds(200, 200, 200, 30);
		frame.add(confirmPasswordLabel);
		
		JLabel genderLabel = new JLabel("Gender: ");
		genderLabel.setBounds(200, 230, 200, 30);
		frame.add(genderLabel);
		
		JLabel countryLabel = new JLabel("Country: ");
		countryLabel.setBounds(200, 260, 200, 30);
		frame.add(countryLabel);
		
		
		nameField = new JTextField();
		nameField.setBounds(400, 80, 200, 30);
		frame.add(nameField);
		
		emailField = new JTextField();
		emailField.setBounds(400, 110, 200, 30);
		frame.add(emailField);
		
		phoneField = new JTextField();
		phoneField.setBounds(400, 140, 200, 30);
		frame.add(phoneField);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(400, 170, 200, 30);
		frame.add(passwordField);
		
		confirmPasswordField = new JPasswordField();
		confirmPasswordField.setBounds(400, 200, 200, 30);
		frame.add(confirmPasswordField);
		
		
		maleRadio = new JRadioButton("Male");
		maleRadio.setBounds(400, 230, 100, 30);
		frame.add(maleRadio);
		
		femaleRadio = new JRadioButton("Female");
		femaleRadio.setBounds(500, 230, 100, 30);
		frame.add(femaleRadio);
		
		ButtonGroup genderBtnGroup = new ButtonGroup();
		genderBtnGroup.add(femaleRadio);
		genderBtnGroup.add(maleRadio);
		
		String country[]={"Nepal","Aus","U.S.A","England","Newzealand"};        
	    JComboBox<String> countryCombo=new JComboBox(country);    
	    countryCombo.setBounds(400, 260, 200, 30);    
		frame.add(countryCombo);
		
		
		
		JButton submitBtn =  new JButton("Submit");
		submitBtn.setBounds(350, 370, 100, 30);
		submitBtn.addActionListener(new MyActionListener());
		frame.add(submitBtn);
		frame.setVisible(true);
		
	}
	
	public static void setUIFont (javax.swing.plaf.FontUIResource f){
	    java.util.Enumeration keys = UIManager.getDefaults().keys();
	    while (keys.hasMoreElements()) {
	      Object key = keys.nextElement();
	      Object value = UIManager.get (key);
	      if (value instanceof javax.swing.plaf.FontUIResource)
	        UIManager.put (key, f);
	      }
	    }
	
}
class MyActionListener implements ActionListener {
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(SwingFormFields.nameField.getText());;
	} 
}

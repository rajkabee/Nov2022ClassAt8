package com.swingGui.layouts;

import java.awt.CardLayout;
import java.awt.Container;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class CardLayoutExample extends JFrame implements ActionListener {
	Container cPane;
	CardLayout crd;
	JButton btnOne; 
	JButton btnTwo; 
	JButton btnThree; 
	public CardLayoutExample() {
		setTitle("Flow Layout Example");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 100, 800, 500);
		setIconImage(Toolkit.getDefaultToolkit().getImage("logo.jpg"));
		cPane = this.getContentPane();
		crd=new CardLayout();
		cPane.setLayout(crd);  
		JButton btnOne = new JButton("One"); 
		JButton btnTwo = new JButton("Two"); 
		JButton btnThree = new JButton("Three"); 
		btnOne.addActionListener(this);
		btnTwo.addActionListener(this);
		btnThree.addActionListener(this);
		cPane.add("One",btnOne);
		cPane.add("Two",btnTwo);
		cPane.add("Three",btnThree);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e)   
	{    
		crd.next(cPane);    
	}   
	public static void main(String[] args) {
		new CardLayoutExample();
	}
}

package com.swingGui.layouts;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;

import com.swingGui.Frame;

public class BorderLayoutExample {
	public static void main(String[] args) {
		Frame frame = new Frame("Border Layout Example");
		frame.setLayout(new BorderLayout());
		//frame.setSize(200, 100);
		JButton btnOne = new JButton("One"); 
		JButton btnTwo = new JButton("Two"); 
		JButton btnThree = new JButton("Three"); 
		JButton btnFour = new JButton("Four"); 
		JButton btnFive = new JButton("Five"); 
		frame.add(btnOne, BorderLayout.NORTH);
		frame.add(btnTwo, BorderLayout.WEST);
		frame.add(btnThree, BorderLayout.CENTER);
		frame.add(btnFour, BorderLayout.EAST);
		frame.add(btnFive, BorderLayout.SOUTH);
		frame.setVisible(true);
	}
}

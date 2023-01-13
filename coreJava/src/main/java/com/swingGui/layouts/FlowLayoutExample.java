package com.swingGui.layouts;

import java.awt.FlowLayout;

import javax.swing.JButton;

import com.swingGui.Frame;
import com.swingGui.jMenu.MyMenuBar;

public class FlowLayoutExample {
	public static void main(String[] args) {
		Frame frame = new Frame("Flow Layout Example");
		frame.setLayout(new FlowLayout(FlowLayout.CENTER));
		//frame.setSize(200, 100);
		JButton btnOne = new JButton("One"); 
		JButton btnTwo = new JButton("Two"); 
		JButton btnThree = new JButton("Three"); 
		JButton btnFour = new JButton("Four"); 
		JButton btnFive = new JButton("Five"); 
		frame.add(btnOne);
		frame.add(btnTwo);
		frame.add(btnThree);
		frame.add(btnFour);
		frame.add(btnFive);
		frame.setVisible(true);
	}
}

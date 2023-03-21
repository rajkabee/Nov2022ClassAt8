package com.swingGui.jPanel;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;

import com.swingGui.Frame;

public class JPanleOnly {
	public static void main(String[] args) {
		Frame frame = new Frame("Panels");
		frame.setLayout(null);
		
		JPanel panel1 = new JPanel();
		panel1.setBackground(Color.LIGHT_GRAY);
		JLabel label1 = new JLabel("Panel1");
		label1.setForeground(Color.WHITE);
		panel1.setBounds(0,0,785,100);
		panel1.add(label1);
		frame.add(panel1);
		JPanel panel2 = new JPanel();
		panel2.setBackground(Color.LIGHT_GRAY);
		panel2.setBounds(0,105,785, 355);
		frame.add(panel2);
		
		
		frame.setVisible(true);
		
	}
}

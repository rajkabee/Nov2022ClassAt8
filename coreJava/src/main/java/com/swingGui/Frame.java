package com.swingGui;

import java.awt.Toolkit;

import javax.swing.JFrame;

public class Frame extends JFrame{
	public Frame(String title) {
		
		setTitle(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 100, 800, 500);
		setIconImage(Toolkit.getDefaultToolkit().getImage("logo.jpg"));
		
	}
}

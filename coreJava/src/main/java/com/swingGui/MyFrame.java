package com.swingGui;

import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class MyFrame extends JFrame{

	public MyFrame() {
		
		setTitle("Apple");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 100, 800, 500);
		setIconImage(Toolkit.getDefaultToolkit().getImage("logo.jpg"));
		
		
		
	}
	public static void main(String[] args) {
		MyFrame frame = new MyFrame();
		
		frame.setVisible(true);
	}

	
	


}

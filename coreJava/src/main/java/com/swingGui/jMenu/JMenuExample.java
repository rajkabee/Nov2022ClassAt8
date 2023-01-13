package com.swingGui.jMenu;

import com.swingGui.Frame;

public class JMenuExample {
	public static void main(String[] args) {
		Frame frame = new Frame("JMenu Example");
		frame.setJMenuBar(new MyMenuBar());
		frame.setVisible(true);
	}
	
}

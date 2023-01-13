package com.swingGui.scrollPane;

import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import com.swingGui.Frame;

public class JScrollPaneExample {
	public static void main(String[] args) {
		Frame frame = new Frame("ScrollPane example");
		frame.setLayout(null);
		JTextArea textArea = new JTextArea(20,20);
		JScrollPane scrollPane = new JScrollPane(textArea);
		scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(100, 20, 300, 400);
		frame.add(scrollPane);
		
		frame.setVisible(true);
	}
}

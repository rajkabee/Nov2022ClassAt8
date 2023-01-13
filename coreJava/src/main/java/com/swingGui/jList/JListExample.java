package com.swingGui.jList;

import javax.swing.DefaultListModel;
import javax.swing.JList;

import com.swingGui.Frame;

public class JListExample {
	public static void main(String[] args) {
		Frame frame = new Frame("JList Example");
		frame.setLayout(null);
		DefaultListModel<String> listModel = new DefaultListModel<>();
		listModel.addElement("C++");
		listModel.addElement("Java");
		listModel.addElement("Python");
		listModel.addElement("PHP");
		JList<String> list =  new JList<>(listModel);
		list.setBounds(100, 100, 200, 70);
		frame.add(list);
		
		frame.setVisible(true);
	}
}

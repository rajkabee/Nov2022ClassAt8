package com.swingGui.jTable;

import javax.swing.JScrollPane;
import javax.swing.JTable;

import com.swingGui.Frame;

public class JTableExample {
	public static void main(String[] args) {
		Frame frame = new Frame("JTable Example");
		frame.setLayout(null);
		String[] cols = {"Sn.", "Name", "Email", "Phone"};
		String[][] data = {
				{"1", "Ramesh Thapa", "ramesh@gmail.com", "9876778865"},
				{"2", "Prakash Maharjan", "prakash@gmail.com", "9808443677"},
				{"3", "Sanjana Shrestha", "sanjama@gmail.com", "9843438255"},
				{"4","Jikesh Tamang", "jikesh@gmail.com", "9867775343"}
		};
		
		JTable table = new JTable(data, cols);
		JScrollPane sPane = new JScrollPane(table);
		sPane.setBounds(100, 100, 600, 300);
		//sPane.add(table);
		frame.add(sPane);
		frame.setVisible(true);
	}
}

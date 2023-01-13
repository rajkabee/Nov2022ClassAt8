package com.swingGui.jTable;

import java.awt.Frame;
import java.util.Arrays;
import java.util.List;

import javax.swing.JScrollPane;
import javax.swing.JTable;

public class DefaultTableModelExample {
	public static void main(String[] args) {
		Frame frame = new Frame();
		String  cols[] = {"Sn.", "Name", "Email", "Contact"};
		List<User> data = Arrays.asList(
				new User(1, "Sujana Thapa", "sujana@gmail.com", 9876678855l),
				new User(2, "Yogesh Pradhan", "yogesh@gmail.com", 9873453322l),
				new User(3, "Subodh Mishra", "subodh@gmail.com", 9835536332l),
				new User(4, "Jasmine Rai", "Jasmine@gmail.com", 9854663725l),
				new User(5, "Rita Lama", "rita@gmail.com", 9845446635l)	
				);
		MyTableModel model = new MyTableModel(cols, data);
		JTable table = new JTable(model);
		JScrollPane sPane = new JScrollPane(table);
		frame.add(sPane);
		frame.setVisible(true);
	}
}

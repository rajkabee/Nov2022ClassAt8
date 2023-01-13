package com.swingGui.jList;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;

import com.swingGui.Frame;

public class ListActionListener {
	
	public static void main(String[] args) {
		final Frame frame = new Frame("JList Example");
		frame.setLayout(null);
		DefaultListModel<String> listModel1 = new DefaultListModel<>();
		listModel1.addElement("C++");
		listModel1.addElement("Java");
		listModel1.addElement("Python");
		listModel1.addElement("PHP");
		JList<String> list1 =  new JList<>(listModel1);
		list1.setBounds(100, 100, 200, 70);
		frame.add(list1);
		
		DefaultListModel<String> listModel2 = new DefaultListModel<>();
		listModel2.addElement("Struts");
		listModel2.addElement("Spring");
		listModel2.addElement("Django");
		listModel2.addElement("Laravel");
		final JList<String> list2 =  new JList<>(listModel2);
		list2.setBounds(500, 100, 200, 70);
		frame.add(list2);
		
		final JButton button = new JButton("Show");
		button.setBounds(350, 200, 100, 30);
		frame.add(button);
		
		final JLabel label = new JLabel();
		label.setBounds(100, 250, 600, 40);
		frame.add(label);
		
		button.addActionListener(e->{
			String data="";
			if(list1.getSelectedIndex()!=-1) {
				//list2.setSelectedIndex(list1.getSelectedIndex());
				data = "selected Programming  languaga: "+list1.getSelectedValue();
			}
			if(list2.getSelectedIndex()!=-1) {
				data += "   selected framework: "+list2.getSelectedValue();
			}
			label.setText(data);
			//JOptionPane.showMessageDialog(frame,data,"Alert",JOptionPane.ERROR_MESSAGE);
			JOptionPane.showConfirmDialog(frame, "Please Confirm:");
			String name = JOptionPane.showInputDialog(frame, "Name");
			label.setText(name);
		});
		
		
		frame.setVisible(true);
	}
	
}

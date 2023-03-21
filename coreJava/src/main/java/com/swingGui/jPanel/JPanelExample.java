package com.swingGui.jPanel;

import java.awt.Button;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JPanelExample extends JFrame{  
    public static void main(String[] args) {  
    	JPanelExample a = new JPanelExample();  
        }  
    public JPanelExample() {  
    	setSize(300, 300);  
        setPreferredSize(getSize());   
        setDefaultCloseOperation(EXIT_ON_CLOSE);  
		GridBagConstraints gbc = new GridBagConstraints();    
        setTitle("GridBag Layout Example");  
        GridBagLayout layout = new GridBagLayout();  
	    setLayout(layout);  
	    gbc.fill = GridBagConstraints.HORIZONTAL; 
	    gbc.ipady = 10;
	    gbc.ipadx = 100;
	    gbc.gridx = 0;  
	    gbc.gridy = 0;
	    gbc.gridwidth = 3;
	    JPanel topPanel = new JPanel();
	    topPanel.setBackground(Color.MAGENTA);
	    JLabel label =  new JLabel("Grid Bag Layout With JPanel");
	    label.setBounds(30, 100, 200, 80);
	    //topPanel.setLayout(null);
	    topPanel.add(label);
//	    topPanel.setAlignmentY(CENTER_ALIGNMENT);
//	    topPanel.setAlignmentX(CENTER_ALIGNMENT);
	    add(topPanel, gbc);
	    

	    gbc.fill = GridBagConstraints.HORIZONTAL;  
	      
	    gbc.ipady = 50;  
	    gbc.gridx = 0;  
	    gbc.gridy = 1; 
	    gbc.gridwidth = 1;
	    add(new Button("Button Three"), gbc); 
	    gbc.fill = GridBagConstraints.HORIZONTAL;
	    gbc.gridx = 1;  
	    gbc.gridy = 1;  
	    add(new Button("Button Four"), gbc);
	    gbc.gridx = 2;  
	    gbc.gridy = 1; 
	    add(new Button("Button Two"), gbc);
	    gbc.gridx = 0;  
	    gbc.gridy = 2;  
	    gbc.fill = GridBagConstraints.HORIZONTAL;  
	    gbc.gridwidth = 2;  
	    add(new Button("Button Five"), gbc);  
        
	    
	    setVisible(true); 
    }  
      
}  
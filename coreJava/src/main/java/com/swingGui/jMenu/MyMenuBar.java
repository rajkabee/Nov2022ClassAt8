package com.swingGui.jMenu;

import java.awt.FlowLayout;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MyMenuBar extends JMenuBar{

	public MyMenuBar() {
		setLayout(new FlowLayout(FlowLayout.LEFT));
		JMenuItem home = new JMenuItem("Home");
		JMenuItem products = new JMenuItem("Products");
		JMenuItem purchase = new JMenuItem("purchase");
		JMenuItem sell = new JMenuItem("Sell");
		JMenuItem finance = new JMenuItem("Finance");
		JMenuItem contact= new JMenuItem("Contact");
		JMenuItem aboutUs = new JMenuItem("About Us");
		JMenu services = new JMenu("Services");
		services.add(purchase);
		services.add(sell);
		services.add(finance);
		add(home);
		add(products);
		add(services);
		add(contact);
		add(aboutUs);
	}
	
}

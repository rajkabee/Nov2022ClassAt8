package com.swingGui.jTable;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.DefaultTableModel;

public class MyTableModel extends DefaultTableModel {
	String[] cols = {"Sn.", "Name", "Email", "Contact"};
	List<User> data = null;
	public MyTableModel(String[] cols, List<User> data) {
		super();
		this.cols = cols;
		this.data = data;
	}
	@Override
	public int getColumnCount() {
		if(cols==null) {
			return 0;
		}else {
			return cols.length;
		}
	}
	@Override
	public int getRowCount() {
		if(data==null) {
			return 0;
		}else {
			return data.size();
		}
	}
	
	@Override
	public String getColumnName(int column) {
		return this.cols[column];
	}
	
	@Override
	public Object getValueAt(int row, int col) {
		Object value=null;
		if(col==0) {
			value=this.data.get(row).getId();
		}
		else if(col==1) {
			value=this.data.get(row).getName();
		}
		else if(col==2) {
			value=this.data.get(row).getEmail();
		}
		else {
			value=this.data.get(row).getContact();
		}
		return value;
	}
	
	@Override
	public Class<?> getColumnClass(int col) {
		if(col==0) {
			return Integer.class;
		}
		else if(col==3) {
			return Long.class;
		}
		else {
			return String.class;
		}
	}
	
}

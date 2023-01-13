package com.example.coreJava.controlStatements.conditionals;

public class TerneryOperator {
	public static void main(String[] args) {
		int noOfMarbles = 125;
		//String relation = noOfMarbles>10?"friends":"not friends";
		//System.out.println("Relation: "+relation);
		
		/*
		 * con?if_true:if_False;
		 */
		String relation = 
				noOfMarbles>100?"Best Friends":noOfMarbles>20?"Friends":"not friends";
		System.out.println("Relation: "+relation);
		
	}
}

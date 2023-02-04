package com.skilldistillery.blackjack.entities;

public enum Rank {
//	Setting the value field to 2-10, king, queen, jack, and ace
	TWO(2, "Two"), THREE(3, "Three"), FOUR(4, "Four"), FIVE(5, "Five"), SIX(6, "Six"), SEVEN(7, "Seven"), 
	EIGHT(8, "Eight"), NINE(9, "Nine"),TEN(10, "Ten"), KING(10, "King"), QUEEN(10, "Queen"), JACK(10, "Jack"), ACE(11, "Ace");

	private int value;
	private String niceName;
	
	Rank(int thyVal, String name) {
	value = thyVal;
	niceName = name;
	} 

	

	public int getValue() { // The field value is an integer so I need to convert an int to a string
		return  value; //this is a way to convert an int to a String --Concatenate
	}

	public String toString() {
		return niceName + " " ;
	}

}

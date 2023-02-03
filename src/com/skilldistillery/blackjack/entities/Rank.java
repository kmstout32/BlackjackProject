package com.skilldistillery.blackjack.entities;

public enum Rank {
//	Setting the value field to 2-10, king, queen, jack, and ace
	TWO(2, "2"), THREE(3, "3"), FOUR(4, "4"), FIVE(5, "5"), SIX(6, "6"), SEVEN(7, "7"), 
	EIGHT(8, "8"), NINE(9, "9"), KING(10, "10"), QUEEN(10, "10"), JACK(10, "10"), ACE(11, "11");

	private int value;
	private String niceName;
	
	Rank(int thyVal, String name) {
	value = thyVal;
	niceName = name;
	} 

	Rank(int theVal) { //
		this.value = theVal;
	}

	public int getValue() { // The field value is an integer so I need to convert an int to a string
		return  value; //this is a way to convert an int to a String --Concatenate
	}

	public String getNiceName() {
		return niceName;
	}

}

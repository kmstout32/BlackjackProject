package com.skilldistillery.blackjack.entities;

public enum Suit {
//	constants (in order) and set the name fields
//	Here I decided to use unicode to retrieve the symbols in the output console.
	HEARTS("\u2665"), DIAMONDS("\u2666"), SPADES("\u2660"), CLUBS("\u2663");

// field of name - All fields in an enum are private, I don't have to be so implicit.
	private String name;

//no args ctor
	Suit() {
	}

	Suit(String cardName) {
		this.name = cardName;
	}

	public String getCardName() {
		return this.name;
	}

//	toString method to output the name of each/any card
	@Override // the override will show the simple string of the constants
	public String toString() {
		return name;
	}
}

package com.skilldistillery.blackjack.entities;

import java.util.Objects;

public class Card {
//	Each card has a rank and a suit
	private Rank rank;
	private Suit suit;
	
	
//	Add values of card
	public int getValue() {
		return rank.getValue();
		
	}
	public Card( ) {
		
	}
//	Used to assign the field variables
	public Card(Suit aSuit, Rank aRank) {
		suit = aSuit;
		rank = aRank;
	}
//Getters & Setters
	public Rank getRank() {
		return rank;
	}

	public void setRank(Rank rank) {
		this.rank = rank;
	}

	public Suit getSuit() {
		return suit;
	}

	public void setSuit(Suit suit) {
		this.suit = suit;
	}
//Program toString for cards
	@Override
	public String toString() {
		return "Card: " + getRank() + getSuit() + " || " +rank.getValue()  ;
	}

	@Override
	public int hashCode() {
		return Objects.hash(rank, suit);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Card other = (Card) obj;
		return rank == other.rank && suit == other.suit;
	}

	
	
}

package com.skilldistillery.blackjack.entities;

import java.util.ArrayList;
import java.util.List;
//This class cannot create or instantiate a new hand but blackjack hand can
public abstract class Hand {
//	Field of hands -- List of cards is a hand
	protected List<Card> cards ;
//no arg ctor - someone else might need it for a different purpose
	public Hand() {
	}
//	Create a hand (Initial value of two cards in hand)
//	A hand is an initial value of 2 cards
	public Hand(List<Card>hand) {
		this.cards = hand;
	}
//This method will add the values of cards
	public void addCard(List<Card> card) {
		cards.add(card.remove(getHandValue()));
	}
//This method will clear the game 	
	public void clear() {
		
	}
//This method will retrieve the total value of cards 
	public abstract int getHandValue();
	
//This method will put the cards and the value together	
	public String toString() {
		String currHand = " ";
		for (Card card : cards) {
			currHand += card;
			
		}
		return currHand;
	}
	public int getHandValue(int valueofCard) {
		// TODO Auto-generated method stub
		return 0;
	}
}

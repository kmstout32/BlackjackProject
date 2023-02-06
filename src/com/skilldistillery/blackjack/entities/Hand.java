package com.skilldistillery.blackjack.entities;

import java.util.ArrayList;
import java.util.List;

//This class cannot create or instantiate a new hand but blackjack hand can
public abstract class Hand {
//	Field of hands -- List of cards is a hand
	protected List<Card> hand;

//no arg ctor - someone else might need it for a different purpose
	public Hand() {
		hand = new ArrayList<>();
	}

//	Create a hand (Initial value of two cards in hand)
//	A hand is an initial value of 2 cards
	public Hand(List<Card> hand) {
		this.hand = hand;
	}

//This method will add the values of cards
	public void addCard(Card card) {
		hand.add(card);
	}

//This method will clear the game 	
//	public void clear(List<Card>card) {
//		hand.removeAll(card);
//	}
//This method will retrieve the total value of cards 
	public abstract int getHandValue();

//This method will put the cards and the value together	
	public String toString() {
		String currHand = " ";
		for (Card card : hand) {
			currHand += card;

		}
		return currHand;
	}

	public void takeCardFromDeck(Deck deck) {
		hand.add(deck.takeCard());
	}

}

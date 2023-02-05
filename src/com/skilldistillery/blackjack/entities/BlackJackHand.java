package com.skilldistillery.blackjack.entities;

import java.util.ArrayList;
import java.util.List;

public class BlackJackHand extends Hand {
//	
//no arg ctor - someone else might need it for a different purpose
	public BlackJackHand() {
		super();
	}

	public BlackJackHand(List<Card> hand) {
//		super(hand);
		this.cards = hand;
	}
//Checks the values of each player
	public boolean isBlackjack() {
		return true;
			
	}
//Used to get another card when a player hits
	public Card drawCard() {
		return cards.remove(0);
	}


	@Override
	public int getHandValue() {
		int sumOfCards=0;
		int aceValue = 0;
//	The person has an 8 and 6 in hand
		for (Card card : cards) { 
			sumOfCards += + card.getValue();
//			if (card.getValue() == 11);
//			aceValue++;
		}
//		if (sumOfCards > 21 && aceValue > 0) {
//			while (aceValue > 0 && sumOfCards > 21) {
//				aceValue--;
//				sumOfCards= sumOfCards - 10;
//			}
//		}
		return sumOfCards;
	}
	public boolean isBust() {
		return false;
	}
}

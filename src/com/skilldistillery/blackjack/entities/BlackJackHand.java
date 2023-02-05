package com.skilldistillery.blackjack.entities;

import java.util.ArrayList;
import java.util.List;

public class BlackJackHand extends Hand {
	
//no arg ctor - someone else might need it for a different purpose
	public BlackJackHand() {
		super();
	}

	public BlackJackHand(List<Card> hand) {
//		super(hand);
		this.hand = hand;
	}
//Checks the values of each player
	public boolean isBlackjack() {
		return true;
			
	}
//Used to get another card when a player hits
	public void drawCard(List<Card>hand) {
		hand.add(hand.remove(getHandValue()));
	}

	@Override
	public int getHandValue() {
		int sumOfCards=0;
//	The person has an 8 and 6 in hand
		for (Card card : hand) { 
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

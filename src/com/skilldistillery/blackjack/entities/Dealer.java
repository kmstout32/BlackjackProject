package com.skilldistillery.blackjack.entities;

import java.util.ArrayList;
import java.util.List;

public class Dealer extends Player {
	private Deck deck = new Deck();
	protected BlackJackHand bjHand = new BlackJackHand();

	public Dealer() {
		super.setName("Dealer");
	}

//Dealer must shuffle cards
	public void shuffleDeck() {
		deck.shuffle();
	}

//Dealer must deal cards
	public List<Card> dealCards() {
		List<Card> cards = new ArrayList<>();

		for (int i = 0; i < 2; i++) {
			cards.add(deck.dealCard());

		}
		return cards;
	}

//	this toString - hide dealers first card
	public void showOneCard() {
		Card card;

		for (int i = 1; i < this.hand.cards.size(); i++) {
			card = this.hand.cards.get(i);
//	The two lines below are identical
//			card.getValue();
//			hand.cards.get(i).getValue();
//	"Card: " + getRank() + getSuit() + " || " +rank.getValue() 
//			this is what happens when I call card ^^^
			System.out.println(card);
		}
	}

	public void dealCard(Player player) {
		Card card = deck.dealCard();
		player.hit();
	}

	public void showHand() {
		System.out.println(hand);
		System.out.println(hand.getHandValue());
		
	}

//Dealer must hit
//	public void hit() {
//			cards.add(deck.dealCard());
//
//	}
//Dealer must stay

}

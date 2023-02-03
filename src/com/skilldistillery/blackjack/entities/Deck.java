package com.skilldistillery.blackjack.entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
// Each deck has 52 cards in a deck. I used an arrayList b/c I can remove cards from the list
//	The arrayList is better bc it helps provide what I need to do with the deck
	private List<Card> cardsODeck = new ArrayList<>(52);

//	NEXT- I need to create a deck of cards- Populate with a foreach loop
//	
	public Deck() {
		Rank[] ranks = Rank.values(); //values() returns all ranks as an array
		Suit[] suits = Suit.values();
//Each card has a rank and suits
		
		for (Suit suit : suits) {
//			create each of the 13 ranks
			for (Rank rank : ranks) {
				Card card = new Card(suit,rank);
				cardsODeck.add(card);
//				System.out.println(card);

			}
		}
	}

// NEXT - A method to check the size of the deck
// WHY do we care? -- We need to make sure we don't run out of cards. 
	public int checkDeckSize() {
		return cardsODeck.size();
	}
//	NEXT - A method to shuffle the deck of cards
//	The shuffle method needs to go before the deal Card
//	It will shuffle the original list. The shuffle method does NOT return anything
	public void shuffleDeck() {
		Collections.shuffle(cardsODeck);
	}
//	NEXT - A method to deal the cards
//	the return the card whichis removed from the card
//	dealt from the top of the deck at 0 spot.
	public Card dealCard() {
		return cardsODeck.remove(0);         
	}
	


}


package com.skilldistillery.blackjack.entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
// Each deck has 52 cards in a deck. I used an arrayList b/c I can remove cards from the list
//	The arrayList is better bc it helps provide what I need to do with the deck
	private List<Card> cardsODeck = new ArrayList<>();

//	NEXT- I need to create a deck of cards- Populate with a foreach loop
//	
	public Deck() {
		Suit[] suits = Suit.values();
		Rank[] ranks = Rank.values(); //values() returns all ranks as an array
//Each card has a rank and suits
//for each of the four suits, I need to create a card
		for (Suit suit : suits) {
//			create each of the 13 ranks
			for (Rank rank : ranks) {
				Card card = new Card(suit,rank);
//	Together they create a card
				cardsODeck.add(card);
			}
		}

	
	}
	
	@Override
	public String toString() {
		return "Deck [cardsODeck: " + cardsODeck + "]" ;
	}
//Used to bring a deck into the game
	public List<Card> getCardsODeck() {
		return cardsODeck;
	}
	

	public void setCardsODeck(List<Card> cardsODeck) {
		this.cardsODeck = cardsODeck;
	}
//Can only deal from the top of the deck 
	public Card dealCard() {
		return cardsODeck.remove(0);
	}
//Checks how many cards are left in the dec
	public int checkDeckSize() {
	
		return cardsODeck.size();
	}
//Randomizes the deck of cards
	public void shuffle() {
		Collections.shuffle(cardsODeck);
		
	}

	

}


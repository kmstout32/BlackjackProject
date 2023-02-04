package com.skilldistillery.blackjack.testing;

import java.util.Scanner;

import com.skilldistillery.blackjack.entities.Card;
import com.skilldistillery.blackjack.entities.Deck;

public class DealingCards {

	public static void main(String[] args) {
		// deal 5 cards from the deck, displaying each of the dealt cards
		DealingCards dealer = new DealingCards();
		dealer.deal();
	}

	public void deal() {
		Deck theDeck = new Deck();
		System.out.println("How many cards: ");
		Scanner sc = new Scanner(System.in);
		int numCards = sc.nextInt();
		sc.nextLine();
		
		theDeck.shuffle();
		
		for(int numCardsDealtSoFar = 0; numCardsDealtSoFar < numCards; numCardsDealtSoFar++) {
			Card aCard = theDeck.dealCard(); //A need to deal a card from the deck
			System.out.println(theDeck.checkDeckSize() + " cards left, just dealt " + aCard);
		}
		
		sc.close();
	}
}
	
	
	
	
	
	
	
	
	
	
	
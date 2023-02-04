package com.skilldistillery.blackjack.app;

import java.util.Scanner;

import com.skilldistillery.blackjack.entities.BlackJackHand;
import com.skilldistillery.blackjack.entities.Card;
import com.skilldistillery.blackjack.entities.Dealer;
import com.skilldistillery.blackjack.entities.Deck;
import com.skilldistillery.blackjack.entities.Player;

public class BlackjackApp {
	Player player = new Player();
	Scanner sc = new Scanner(System.in);
	Dealer dealer = new Dealer();
	Card card = new Card();
	Deck deck = new Deck();

//all of the logic will happen in this class
	public static void main(String[] args) {

		BlackjackApp app = new BlackjackApp();

		app.launch();
	}

	/**
	 * #1 - Get a deck of cards #2 - Get a player and dealer (Call the classes) A
	 * player and a dealer are --IS A-- BOTH players (or people) #3 - A person --HAS
	 * A-- hand #4 - A hand -OF- Cards
	 * 
	 * 
	 * 
	 * 
	 */

	public void launch() {
		dealer.shuffleDeck(); // dealer starts by shuffling
		System.out.println("Enter your name:"); // Asks for the players name
		player.setName(sc.next()); // Saves users name into the player object
		diplayPlayerCards(); // program jumps to next method
	}

	public void diplayPlayerCards() {
		System.out.println("****************************************************************");
		System.out.println("Hello " + player.getName() + ", Welcome to the Blackjack Terminal!");
		System.out.println("****************************************************************");
		System.out.println(player.getName()+"'s cards" );
		player.setHand(new BlackJackHand(dealer.dealCards()));
		System.out.println(player.getHand().getHandValue() + "-Score");//get hand converts the hand to integer
		displayDealerCards();
	}
	public void displayDealerCards() {
		System.out.println("");
		System.out.println(dealer.getName()+"'s cards" );
	//get hand converts the hand to integer
		dealer.setHand(new BlackJackHand(dealer.dealCards()));
		dealer.showOneCard();
	}
}

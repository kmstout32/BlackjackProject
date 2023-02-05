package com.skilldistillery.blackjack.app;

import java.util.Scanner;

import com.skilldistillery.blackjack.entities.BlackJackHand;
import com.skilldistillery.blackjack.entities.Card;
import com.skilldistillery.blackjack.entities.Dealer;
import com.skilldistillery.blackjack.entities.Deck;
import com.skilldistillery.blackjack.entities.Hand;
import com.skilldistillery.blackjack.entities.Player;

public class BlackjackApp {
	Player player = new Player();
	Scanner sc = new Scanner(System.in);
	Dealer dealer = new Dealer();
	
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
		System.out.println(player.getName() + "'s hand: ");
		player.setHand(new BlackJackHand(dealer.dealCards()));
		player.printPlayerHand();
		System.out.println(player.getHand().getHandValue());
		displayDealerCards();
	}

	public void displayDealerCards() {

		System.out.println("");
		System.out.println(dealer.getName() + "'s hand: ");
		// get hand converts the hand to integer
		dealer.setHand(new BlackJackHand(dealer.dealCards()));
		dealer.showOneCard();
		interactWithPlayer(player.getHand().getHandValue(), sc);
	}

	public void interactWithPlayer(int cardVal, Scanner choice) {
		String pName = player.getName();
		if (cardVal < 10 == true) {
			System.out.println( pName +", would you like to hit?");
		} else if (cardVal > 5 && cardVal < 21) {
			System.out.println(pName + ", would you like to 1) hit or 2) stay");
		} else if (cardVal == 21) {
			System.out.println("Blackjack! Nice job, " + pName + "!");
		}
		String userChoice = " ";
		do {
			userChoice = choice.next();

		} while (!userChoice.equalsIgnoreCase("Hit") && !userChoice.equalsIgnoreCase("Stay"));
		if (userChoice.equalsIgnoreCase("Hit")) {
			player.hit(deck);
			} else { // if stay the dealer will hit if card val is <17
			System.out.println(" ");
			evaluateCards();
		}

	}

//	public void evalDealerCards(Dealer dealer, Hand hand) {
//
//		if (dealer.getHand().getHandValue() < 17) {
//			System.out.println(" Dealer Hits");
//			dealer.hit(deck);
//		}
//	}

	public void evaluateCards() {

		System.out.println("Dealer's card's ");
		dealer.showHand();
//		assigned each players cardValue sum to a local variable & scope purposes
		int playerScore = player.getHand().getHandValue();
		int dealerScore = dealer.getHand().getHandValue();
		System.out.println("************************");
		System.out.println("* Score-> " + playerScore);
		System.out.println("* Dealer's Score->" + dealerScore);
		System.out.println("************************");

		if (playerScore > dealerScore) {
			System.out.println("YOU WON! GO GET THAT MONEY HONEY!!");
		} else if (playerScore > 21) {
			System.out.println("BUSTED!");
		} else if (dealerScore > playerScore) {
			System.out.println("YOU LOSE BOOBOO!");
		} else if (dealerScore > 21) {
			System.out.println("Dealer Busted...YOU WIN!");
		} else if (dealerScore == playerScore) {
			System.out.println("It's a tie");

		}

	}
}

package com.skilldistillery.blackjack.entities;

import java.util.List;

public class Player extends Person{
//attributes- what things describe a player(what should they have)
//	each player has a name and a hand of cards
	private String name;
	protected Hand hand = new BlackJackHand();
	
	
	public Player() {
		
	}

	
//create a ctor to create a different player
//this.super is instantiating the abstract class
	public Player(Hand hand){
		super.getName();
	
	}
//Sending the 
	public Player(String name, Hand hand){
		this.name = name;
		this.hand = hand;
	}
	public void printPlayerHand() {
//		for (dataType name : collectionOfDataType) {
		for (Card card : hand.hand) {
//			hand.cards.get(0).getValue()
//			card.getValue();
			System.out.println(card );
		
		}
	}
	public void addCard(Card card) {
		hand.addCard(card);
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Hand getHand() {
		return hand;
	}


	public void setHand(Hand hand) {
		this.hand = hand;
	}
	
	public void hit() {
		System.out.println("Hit");
	}
	public void stay() {
		System.out.println("Stay");
	}
	
}
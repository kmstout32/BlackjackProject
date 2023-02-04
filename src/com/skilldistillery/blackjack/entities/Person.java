package com.skilldistillery.blackjack.entities;

public abstract class Person {
//I had to add an abstract class bc Player and Dealer have shared data
	
//	
	private BlackJackHand hand;
	private String name;

// creation of the person
	public Person() {
		this.hand = new BlackJackHand();
		this.name = " ";
	}

	public Hand getHand() {
		return hand;
	}

	public void setHand(Hand hand) {
		this.hand = (BlackJackHand) hand;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}










}

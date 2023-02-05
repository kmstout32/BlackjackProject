package com.skilldistillery.blackjack.entities;

public class Person {
	
//	
	protected BlackJackHand bjHand;
	private String name;

// creation of the person
	public Person() {
		this.bjHand = new BlackJackHand();
		this.name = " ";
	}
	

	public Hand getHand() {
		return bjHand;
	}

	public void setHand(Hand hand) {
		this.bjHand = (BlackJackHand) hand;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	









}

package com.skilldistillery.blackjack.entities;

public abstract class Person {
	
//	fields of class
	private String name;

// creation of the person
	public Person() {
		this.name = " ";
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void hit(Deck deck) {
		System.out.println("Im in the dealer class");

	}









}

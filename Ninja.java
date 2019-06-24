package com.codingdojo.dnd;

public class Ninja extends Human {
	public Ninja () {
		this.stealth = 10;
	}
	public Ninja steal(Human h) {
		System.out.println("The Ninja attempts to steal!");
		int stolenHealth; 
		stolenHealth = h.health -= stealth;
		this.health += stolenHealth;
		return this;
		
	}
	public Ninja runAway() {
		System.out.println("The Ninja runs away!");
		this.health -= 10;
		return this;
	}

}

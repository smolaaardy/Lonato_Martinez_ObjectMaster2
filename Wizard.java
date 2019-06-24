package com.codingdojo.dnd;

public class Wizard extends Human {
	public Wizard() {
		this.health = 50;
		this.intelligence = 8;
	}
	public Wizard heal(Human h) {
		System.out.println("The Wizard casts cure!");
		h.health += intelligence;
		return this;
	}
	public Wizard fireball(Human h) {
		System.out.println("The Wizard casts Firaga!");
		int fireDamage;
		fireDamage = intelligence * 3;
		h.health -= fireDamage;
		return this;
	}

}

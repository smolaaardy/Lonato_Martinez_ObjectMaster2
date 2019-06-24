package com.codingdojo.dnd;

public class Samurai extends Human{
	private static int counter;
	public Samurai() {
		counter ++;
		this.health = 200;
	}
	public Samurai deathBlow(Human h) {
		System.out.println("The Samurai kills the target!");
		h.health = 0;
		this.health /= 2;
		return this;
	}
	public Samurai meditate() {
		System.out.println("The Samurai starts meditating.");
		int meditateHealth;
		meditateHealth = this.health / 2;
		this.health += meditateHealth;
		return this;
	}
	public Samurai howMany() {
		System.out.println("The Samurai counts his peers! There are" + counter + "!");
		return this;		
		
	}
	

}

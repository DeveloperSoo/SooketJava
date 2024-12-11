package com.sooket.day11.oop.interfacepkg.animalfarm;

public class Yard {
	public static void main(String[] args) {
		Animal animal = new Cat();
		animal.speak();
		animal = new Dog();
		animal.speak();
		animal = new Hen();
		animal.speak();
		
	}
}

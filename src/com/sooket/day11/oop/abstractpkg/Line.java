package com.sooket.day11.oop.abstractpkg;

public class Line extends Shape { // Shape가 추상클래스가 됨 
	//The type Line must implement the inherited abstract method Shape.draw()
	//클래스 자체에 추상클래스를 선언하거나 오버라이딩시 해결되는 오류
	@Override
	public void draw() {
		System.out.println("I'm Line");
		
	}
}

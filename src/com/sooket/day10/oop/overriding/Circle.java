package com.sooket.day10.oop.overriding;

public class Circle extends Shape{

	@Override // 생략 가능
	public void draw() {
		System.out.println("Circle");
		//super.draw();
	}
}

package com.sooket.day10.oop.overriding;

public class Rectangle extends Shape {
	@Override
	public void draw() {
		System.out.println("Rect");
		
		//super.draw(); 부모클래스의 draw 메소드를 자동 생성
	}	
}

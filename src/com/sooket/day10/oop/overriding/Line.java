package com.sooket.day10.oop.overriding;

public class Line extends Shape{
	
	@Override
	public void draw() {
		System.out.println("Line");
		//super.draw();
		//super.draw(); // 부모가 가진 draw 메소드를 자동 생성
	}
}

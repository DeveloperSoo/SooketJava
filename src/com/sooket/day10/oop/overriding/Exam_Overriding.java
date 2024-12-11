package com.sooket.day10.oop.overriding;

public class Exam_Overriding {
	public static void main(String[] args) {
		Shape shape = new Shape();
		shape.draw();
		//////////////////////////////////////////왜 이렇게 동작하는지 알아야함
		shape = new Line();
		shape.draw();
		//////////////////////////////////////////
		Line line = new Line();
		line.draw();
		Rectangle rect = new Rectangle();
		rect.draw();
		Circle circle = new Circle();
		circle.draw();
	}
}


package com.sooket.day10.oop.inheritance;

import com.sooket.day10.oop.inheritance.point.ColorPoint;
import com.sooket.day10.oop.inheritance.point.Point;

public class Exam_Inheritance {
	public static void main(String[] args) {
		Point point = new Point();
		point.setX(11);
		point.setY(18);
		point.showPoint();
		
		ColorPoint colorPoint = new ColorPoint();
		colorPoint = new ColorPoint(12,25,"red");
		colorPoint.showColorPoint();
		colorPoint.setX(11);
		colorPoint.setY(25);
		colorPoint.setColor("Yellow");
		colorPoint.showColorPoint();
		

	}
}

package com.sooket.day11.oop.objectpkg.exercise;

public class Point_teacher {
	private int x, y;
	
	public Point_teacher() {}
	public Point_teacher(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public boolean equals(Object obj) {
		Point_teacher p = (Point_teacher)obj;
		return this.x == p.x && this.y == p.y;
//		return super.equals(obj);
	}
}

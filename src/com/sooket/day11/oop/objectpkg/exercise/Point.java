package com.sooket.day11.oop.objectpkg.exercise;


public class Point {
	private int x, y;
	
	public Point() {} // 기본생성자
	
	public Point(int x , int y) { //매개변수를 이용한 기본생성자
		this.x = x;
		this.y = y;
	}
	
	@Override

	public boolean equals(Object obj) { // 여기서 p1이 업캐스팅됨
		Point p = (Point)obj; // 다시 다운캐스팅을 통해 x,y 에 접근
		return this.x == p.x && this.y == p.y;	
//		return super.equals(obj);
	}
	
	
	 
}

package com.sooket.day10.oop.inheritance.point;

public class ColorPoint extends Point{
//	private int x , y; 상속받았기 때문에 안적어도됨
	private String color;
	
	
	public ColorPoint() {
		super();
	}
	
	public ColorPoint(int x , int y, String color) {
		super(x,y);
		this.color= color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void showColorPoint() {
//		super.x = 10; 부모의 필드가 private이여서 못가져옴
//		super.y = 20;
		super.showPoint();
		System.out.println(this.color + "색의 점입니다.");
	}
	
}

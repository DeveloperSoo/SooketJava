package com.sooket.day10.oop.encapsulation;
		
class CircleVO {
	private int radius; //캡슐화로 인해 접근이 제한됨
						// 필드는 프라이빗 메소드는 퍼블릭
	public CircleVO() {}
		
	public CircleVO(int radius) {
		this.radius = radius;
	}	
	
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	
	public double getArea() { // 필드가 private으로 캡슐화가 진행되었기 때문에 값을 입력하기 위한 메소드
		return 3.14*radius*radius;
	}	
}


public class Circle {

		
	public static void main(String[] args) {
		CircleVO circle = new CircleVO();
		circle.setRadius(10); //캡슐화로 인해 메소드를 통한 값 입력
		//CircleVO circle = new CircleVO(10);
		//circle.radius = 10;
		System.out.println("넓이 : " + circle.getArea()); 

	}	
	
}

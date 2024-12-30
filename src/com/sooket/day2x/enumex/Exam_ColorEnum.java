package com.sooket.day2x.enumex;

public class Exam_ColorEnum {
	public enum Color {
		RED, GREEN, BLUE
	}
	
	public static void main(String[] args) {
		Color myColor = Color.RED;
		//myColor = Color.YELLOW; -> 오류가 발생하여 들어가지 못함, 타입안정성 보장
		//String color = "YELLOW";
		printColor(myColor);	
	}
	
	// Enum 안에는 애초에 작성된 것들만 가져다 쓸 수 있기 때문에 예외처리를 진행하지 않아도 된다
	static void printColor(Color color) {
		switch(color) {
			case RED : 
				System.out.println("빨강");
				break;
				
			case GREEN : 
				System.out.println("초록");
				break;
				
			case BLUE :
				System.out.println("파랑");
				break;	
		}
	}
}

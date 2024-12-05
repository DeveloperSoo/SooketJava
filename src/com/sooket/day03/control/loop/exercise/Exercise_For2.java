package com.sooket.day03.control.loop.exercise;

public class Exercise_For2 {
	public static void main(String[] args) {
		/*
		 * 문제 2-1
		 * 1부터 10까지의 덧셈을 구하는 프로그램을 작성하여라.
		 * 55
		 * 
		 * 문제 2-2
		 * 1부터 10까지 덧셈을 표시하고 합도 구하는 프로그램을 작성하여라.
		 * 1+2+3+4+5+6+7+8+9+10=55
		 * 
		 */
		int sum = 0;
		for(int i = 1; i <=10; i++) {
			sum = sum + i; // sum += i
			/*
			 * sum = 1;
			 * sum = 1+2; -> sum = sum + 2;
			 * sum = 1+2+3; -> sum = sum + 3;
			 * sum = 1+2+3+4; -> sum = sum + 4;
			 */
		}
		System.out.println(sum);
		
		
		int sum1 = 0; // 누적합을 위한 선언 i++ 의 값을 저장해줌
		for(int i = 1; i <= 10; i++) {
			if(i != 10) {
				System.out.print(i + " + ");
			}else {
				System.out.print(i + " = ");
			}
			sum1 += i; // 누적합
		} System.out.println(sum1);
		
		
		int sum2 = 0;
		for(int i = 1 ; i <= 10 ; i ++) {
			if(i != 10) {
				System.out.print(i + "+");				
			}else {
				System.out.print(i + "=");								
			}
			sum2 += i;
		} System.out.println(sum2);
		
		
	}
}


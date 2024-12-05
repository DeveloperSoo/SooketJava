package com.sooket.day01.inputsc;

import java.util.Scanner;

public class Exercise_Scanner1 {
	public static void main(String[] args) {
		/*
		 * 이름, 도시, 나이, 체중, 독신 여부를 빈칸으로 분리하여 입력받으세요
		 * kim seoul 20 65.1 true
		 * 이름은 Kim, 도시는 Seoul, 나이는 20살, 체중은 65.1kg, 독신 여부는 true입니다.
		 */
		
		Scanner sc = new Scanner(System.in);
		//System.out.println("이름을 입력하세요");
		String name = sc.next();
		//System.out.println("사는 도시를 입력하세요");
		String city = sc.next();
		//System.out.println("나이를 입력하세요");
		int age = sc.nextInt();
		//System.out.println("체중을 입력하세요");
		double weight = sc.nextDouble();
		//System.out.println("독신여부(true / false)");
		boolean soloYn = sc.nextBoolean();
		
		//System.out.println("이름은 " + name + ", 도시는 " + city + ", 나이는 " + age +"살, 체중은 " + weight+"kg"+ ", 독신 여부는 " + soloYn + "입니다.");
		System.out.printf("이름은 %s, 도시는 %s , 나이는 %d살, 체중은 %fkg, 독신여부는 %b입니다.\n"
				, name, city, age, weight, soloYn);
	}
}

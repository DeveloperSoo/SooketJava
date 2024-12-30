package com.sooket.day2x.innerclass;

public class MonsterBall {
	int size = 100;
	int price = 5000;
	
	class PocketMonster {
		String name = "이상해씨";
		int level = 100;
		static final int cost = 1000;	// 인스턴스 클래스 내부에서 final 상수만 선언가능 (jdk15 이전)
		static int cost2 = 1000;		// 인스턴스 클래스 내부에서는 static 선언가능 (jdk16 부터 도입)
		
		
		public void getPocketMember() {
			System.out.println(name);
			System.out.println(level);
			System.out.println(cost);
			
			System.out.println(size);
			System.out.println(price);
		}
	}
	
	public static void main(String[] args) {
		MonsterBall ball = new MonsterBall();
		MonsterBall.PocketMonster pokemon = ball.new PocketMonster();
		
		pokemon.getPocketMember();
		
		
	}
}

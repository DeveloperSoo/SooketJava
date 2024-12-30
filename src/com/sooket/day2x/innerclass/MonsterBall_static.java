package com.sooket.day2x.innerclass;

public class MonsterBall_static {
	static int size = 100;		// static 클래스에서 사용하기 위해 멤버가 static이 되야함
	static int price = 5000;
	
	
	public void showPokemonster() {
		//static final int exp = 4000;
		
		record PoketMonster() {
			static String name = "꼬부기";
			static int level = 100;
			
			public void getPoketLevel() {
				System.out.println(level);
				//System.out.println(exp);
			}
		}
	}
	
	
	// static이 아닌 경우 외부와 연결되어 있는 외부 참조를 갖게됨.
	// 메모리가 더 사용되고 느려지므로 static 권장
	
	static class PocketMonster { // static 추가하면 static 내부 클래스가 됨
		String name = "이상해씨";
		int level = 100;
		static final int cost = 1000;	// 밖에 있는 필드를 안건들거면 static을 쓰도록 권장됨 
		
		public void getPocketMember() {
			System.out.println(name);
			System.out.println(level);
			System.out.println(cost);
			
			System.out.println(size);
			System.out.println(price);
		}
	}
	
	public static void main(String[] args) {
		// static 클래스여서 객체없이 바로 호출해버릴 수 있음.
		MonsterBall_static ball = new MonsterBall_static();
		// 										new MonsterBall_static.PocketMonster();
		MonsterBall_static.PocketMonster pokemon = new PocketMonster(); 
		pokemon.getPocketMember();	
	}
}

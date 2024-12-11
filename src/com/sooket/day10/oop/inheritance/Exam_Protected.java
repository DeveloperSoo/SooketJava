package com.sooket.day10.oop.inheritance;

import com.sooket.day10.oop.inheritance.point.Point;

class Super {
	public int pub; 	// public 은 모두 공개
	int def;			// dafault는 같은 패키지 내에서
	protected int pro;	// protected는 같은 패키지 + 상속한 자식클랙스에만
	private int pri; 	// private은 외부로부터 차단
}

class Sub extends Super{
	void set() { //메소드 부분
		super.pub = 1;
		super.def = 2;
		super.pro = 3; // protected여서 자식은 물려받을수 있음
		//super.pri = 4; // private는 자식이여도 못 물려받음
		
		Super sup = new Super();
		sup.pub = 502;
		sup.def = 1118;
		sup.pro = 1225;
		//sup.pri = 101; // pricate 못 가져옴
	}
}

class ShapePoint extends Point {
	void set() {
		Point p = new Point();	
		p.pub = 114;
		//p.def = 119;	//같은 패키지 아님
		//p.pri = 113;	// private이니까 안 됨
		//p.pro = 911; // 같은 패키지가 아님
		super.pub = 111;
		//super.def = 113; //같은 패키지가 아님
		super.pro = 112;	// 상속한 경우 가능
		//super.pri = 114;
		//p.pro = 911;
		

	}
}


public class Exam_Protected {

}

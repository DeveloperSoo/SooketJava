package com.sooket.day08.oop;

/*
 * 접근지정자(제한자)
 * 종류 : public, protected, default, private 
 */
class Sample{
	//필드
	public int everyone; 
	private int onlyme;
	int onlyus;
}




public class Exam_Access {
	public static void main(String[] args) {
		Sample smp = new Sample();
		smp.everyone = 1118;
// 		smp.onlyme;  private 멤버이기 때문에 불가능함
		smp.onlyus = 502;
		
	}
}

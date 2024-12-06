package com.sooket.day08.method;

public class Run_Method {

	public static void main(String[] args) {
		Exam_Method em = new Exam_Method();
		
		// 리턴형 X , 매개 변수 X
		em.noReturnNoParam();
		
		// 리턴형 X , 매개 변수 O
		em.noReturnYesParam(20250502);
		
		// 리턴형 O, 매개변수 X
		System.out.println(em.yesReturnNoParam()); // 반환형이 int로 return값이 정해져있기 때문에 바로 출력하면 됨
		
		// 리턴형 O, 매개변수 O
		System.out.println(em.yesReturnYesParam(1000));
		int result = em.yesReturnYesParam(1000);
		System.out.println(result);

		
		result = em.sum(1,2,3,4,5);
		System.out.println("result : " + result);
		
	}
}

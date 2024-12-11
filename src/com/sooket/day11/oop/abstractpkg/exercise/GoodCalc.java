package com.sooket.day11.oop.abstractpkg.exercise;

	public class GoodCalc extends Calculator{// 추상클래스를 상속받은 클래스

		@Override
		public int add(int a, int b) {
			
			return a + b;
		}

		@Override
		public int subtract(int a, int b) {
			
			return a - b;
		}

		@Override
		public double average(int[] a) {
			// int [] a = new int[5];
			// 평균 = 합 / 크기
			// 합 : 배열에 있는 값을 꺼내서 더함(누적합)
			int sum = 0;
			for(int i = 0 ; i < a.length; i++) {
				sum += a[i];
			}
			double avg = (double)sum / a.length;
			
			return avg;	
		} 
		
		
//      public class GoodCalc extends Calculator{// 추상클래스를 상속받은 클래스		
//		@Override
//		public int add(int a, int b) { // 오버라이딩을 통한 오류 해결
//			int result = a + b;
//			return result;
//		}
//		
//		@Override
//		public int subtract(int a, int b) { // 오버라이딩을 통한 오류 해결
//			int result = a - b;
//			return result;
//		}
//		
//		
//		@Override
//		public double average(int[] a) { 		// 오버라이딩을 통한 오류 해결
//			double sum = 0;      				// 누적합으로 총합 구하기 위한 변수 선언
//			for(int i = 0; i < a.length; i++) { // 배열 a 의 모든 인덱스값 추출위한 반복문
//				sum += a[i]; 					// sum 에 a 의 모든 배열값 누적
//			}
//			double result = sum/a.length; 		//총합을 a 의 길이로 나누기
//		
//			return result;
//		}
//		
		public static void main(String[] args) {
			//Calculator calculator = new Calculator(); 추상클래스라 객체생성 불가

			// 업캐스팅을 통한 오버라이딩
			Calculator calculator = new GoodCalc();					
			int num = calculator.add(11,18);
			System.out.println(num);
			System.out.println(calculator.add(1,2));	
			System.out.println(calculator.subtract(3,4));		
			int [] arrs = {11, 18, 5, 2};
			System.out.println(calculator.average(arrs));			
			System.out.println(calculator.average(new int [] {5,6,7,8,9,10})); //
			
			// 추상메소드 상속으로 인한 오버라이딩
			GoodCalc calc = new GoodCalc();
			num = calc.add(11,18);
			System.out.println(num);
			System.out.println(calc.add(1,2));		
			System.out.println(calc.subtract(3,4));	
			int [] nums = {11, 18, 5, 2};
			System.out.println(calc.average(nums));			
			System.out.println(calc.average(new int [] {5,6,7,8,9,10})); //
		}	
}

	
	
	
	
	
	
	
	
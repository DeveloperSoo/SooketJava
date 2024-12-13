package com.sooket.day12.javaapi;

public class Exam_String {
	public static void main(String[] args) {
		String msg = "Hello";
		if("Hello" == msg) // 상수풀에 있는 값을 재사용
			System.out.println("같은 값임");
		String data = new String("Hello");
		if(msg == data) // 새로운 객체 생성되어 비교 오류 -> equals를 사용해야함.
			System.out.println("같은 값임");
		else
			System.out.println("다른 값임");
	
		System.out.println();
		// String 객체가 가지고 있는 유용한 메소드
		// 문자열 길이
		String data1 = new String(" C#");
		String data2 = new String(",C++ ");
		System.out.println(data1 + "의 길이는 " + data1.length() +"입니다.");
							// 결과 : C#의 길이는 3입니다.
		System.out.println(data2 + "의 길이는 " + data2.length() +"입니다.");
							// 결과 : ,C++ 의 길이는 5입니다.
		System.out.println();
		// 문자열이 포함되어 있는지 체크
		System.out.println(data1 + "에 #이 있는가? : " + data1.contains("#"));
							// 결과 :  C#에 #이 있는가? : true
		
		// 문자열 연결
		data1 = data1.concat(data2);
		System.out.println("연결된 문자열 : " + data1);
							// 결과 : 연결된 문자열 :  C#,C++
		
		// 문자열 공백 제거
		System.out.println("문자열 공백 제거 전 : " + data1.length());
							// 결과 : 문자열 공백 제거 전 : 8
		data1 = data1.trim();
		System.out.println("문자열 공백 제거 후 : " + data1.length());
							// 결과 : 문자열 공백 제거 후 : 6
		
		// 문자열 교체 C# -> JAVA
		data1 = data1.replace("C#", "JAVA");
		System.out.println("문자열 교체 확인 : "+ data1);
							// 결과 : 문자열 교체 확인 : JAVA,C++

		// 문자열 자르기1 - 기준 문자열 전후로 잘라서 배열에 넣어줌
		String [] words = data1.split(","); // 이렇게 안하면 안짤림
		for(int i = 0 ; i < words.length; i++) {
			System.out.println(words[i]);
		}
							//결과 : 
							//JAVA
							//C++
		
		for(String word : words) { // for~each 문으로 동일하게 출력 가능
			System.out.println(word);
		}
		System.out.println();
		
		// 문자열 자르기 2 - 인덱스값을 기준으로 자르기
		System.out.println("문자열 자르기 전 : " + data1);
							// 결과 : 문자열 자르기 전 : JAVA,C++
//		data1 = data1.substring(0,4); // 이렇게 자르면 처음부터 4전까지
		data1 = data1.substring(4);  //이렇게 자르면 4앞은 사라짐
		System.out.println("문자열 자르기 후 : " + data1);
							// 결과 : 문자열 자르기 후 : JAVA

		// 문자열 -> 문자로 만들기
		char word = data1.charAt(0);
		System.out.println("문자열 -> 문자 : " + word);
		
	}
}

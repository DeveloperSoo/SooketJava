package com.sooket.day14.collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Exam_MapCollection {
	public static void main(String[] args) {
		/*  
		 * 전화번호부에서 지역번호를 입력하면 지역을 출력해주는 프로그램을 작성해주세요.
		 *  
		 */ 
		Scanner sc = new Scanner(System.in);
		Map<String, String> phoneMap = new HashMap<String, String>(); //key와 value값이 있기 때문에 제너릭이 두개
		phoneMap.put("02", "서울");
		phoneMap.put("031", "경기도");
		phoneMap.put("032", "인천");
		phoneMap.put("051", "부산");
		phoneMap.put("052", "울산");
		phoneMap.put("053", "대구");
		String localNumber = "";
		
		do {
			System.out.print("지역번호 입력 : ");
			localNumber = sc.next();
			
//		System.out.println("저장된 데이터 수 : " + phoneMap.size());	
//		System.out.println("031를 누르면 : " + phoneMap.get("02"));
//		System.out.println("031를 누르면 : " + phoneMap.get("031"));
			
			//입력받은값 편하게 저장
			String result = phoneMap.get(localNumber); 
			
			//분기처리 -> 선생님
			if(result != null) {
				System.out.println("검색하신 지역은: "+ result);			
			}else {
				System.out.println("데이터가 존재하지 않습니다.");			
			}
			
		} while(!"exit".equals(localNumber));
		
		
		//////////////////////////////////////////////////
		// 분기처리를 하지 않았을 때 내 풀이
	
		
		System.out.println("검색하신 지역은: "+ phoneMap.get(localNumber));
		
		////////////////////////////////////////////////////////
		// 분기처리 했을 때 내 풀이
		
		if(phoneMap.containsKey(localNumber)) {
			System.out.println("검색하신 지역은: "+ phoneMap.get(localNumber));
		}else {
			System.out.println("잘못된 지역 입력");
		}
		
		
		
		
		
//		switch(localNumber) {
//		case "02" : System.out.println("서울입니다."); break;
//		case "031" : System.out.println("경기도입니다."); break;
//		}
//		
//		if("02".equals(localNumber)) {
//			System.out.println("서울입니다.");
//		}else if("031".equals(localNumber)) {
//			System.out.println("경기도입니다.");
//		}
	}
}

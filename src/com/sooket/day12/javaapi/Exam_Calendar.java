package com.sooket.day12.javaapi;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Exam_Calendar {
	public static void main(String[] args) {
		// 그레고리안 달력, 이슬람력, 유대력, 태음력
		Calendar calendar = new GregorianCalendar();
		Calendar today = Calendar.getInstance(); 
		Calendar startDate = Calendar.getInstance();
		startDate.set(2024, 10, 18);
		startDate.set(Calendar.HOUR_OF_DAY,9);
		startDate.set(Calendar.MINUTE, 10);
		printDate("개강일",startDate);
		System.out.println();
		
		printDate("지금",today);
		// 지금은 2024/12/12/목요일(16시) 오후 4시 31분 0초 0밀리초 입니다
		// 2024/11/18/화요일(9)시 오전 9시 00분 0초 0밀리초에 개강하였습니다.
		
//		System.out.println(today.get(Calendar.YEAR)+"년");
//		System.out.println((today.get(2)+1)+"월");
//		System.out.println((today.get(Calendar.MONTH)+1)+"월");
//		System.out.println(today.get(Calendar.DAY_OF_MONTH)+"일");
//		System.out.println(today.get(Calendar.DATE)+"일");
//		System.out.println(today.get(Calendar.HOUR)+"시");
//		System.out.println(today.get(Calendar.HOUR_OF_DAY)+"시");
//		System.out.println(today.get(Calendar.MINUTE)+"분");
//		System.out.println(today.get(Calendar.SECOND)+"초");
//		System.out.println(today.get(Calendar.MILLISECOND)+"초");
//		System.out.println(today.get(Calendar.AM_PM));

	}
	
	public static void printDate(String content, Calendar date) {
		int year = date.get(Calendar.YEAR);
		int month = date.get(Calendar.MONTH)+1;
		int day = date.get(Calendar.DAY_OF_MONTH);
		int dayOfWeek = date.get(Calendar.DAY_OF_WEEK);
		int hour = date.get(Calendar.HOUR_OF_DAY);
		int hourOfDay = date.get(Calendar.HOUR);
		int minute = date.get(Calendar.MINUTE);
		int second = date.get(Calendar.SECOND);
		int ampm = date.get(Calendar.AM_PM);
		int miliSecond = date.get(Calendar.MILLISECOND);
		
		String days = "";
		switch(dayOfWeek) {
		case 1 : 
			days = "일요일";
			break;
		case 2 :
			days = "월요일";
			break;
		case 3 :
			days = "화요일";
			break;
		case 4 :
			days = "수요일";
			break;
		case 5 :
			days = "목요일";
			break;
		case 6 :
			days = "금요일";
			break;
		case 0 :
			days = "토요일";
			break;
		}
		
		String dayWeek = "" ;
		switch(dayOfWeek) {
		case Calendar.SUNDAY : dayWeek = "일요일"; break;
		case Calendar.MONDAY : dayWeek = "월요일"; break;
		case Calendar.TUESDAY : dayWeek = "화요일"; break;
		case Calendar.WEDNESDAY : dayWeek = "수요일"; break;
		case Calendar.THURSDAY : dayWeek = "목요일"; break;
		case Calendar.FRIDAY : dayWeek = "금요일"; break;
		case Calendar.SATURDAY : dayWeek = "토요일"; break;
		}
		
		
		
		String noon = "";
		if (Calendar.PM == ampm) {
			noon = "오후 ";
		}else {
			noon = "오전 ";
		}
		
		//String content = "";	
		System.out.print(content + "은 " + year+"/"+month+"/"
		+day+"/"+days+"("+hour+"시)"+ " "+noon + hourOfDay + "시 "
		+ minute + "분 " + second + "초 " + miliSecond + "밀리초" + " 입니다.");
		
	}
}

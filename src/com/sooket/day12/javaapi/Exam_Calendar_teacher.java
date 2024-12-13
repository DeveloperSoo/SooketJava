package com.sooket.day12.javaapi;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Exam_Calendar_teacher {
	public static void main(String[] args) {
		// 그레고리안 달력, 이슬람력, 유대력, 태음력
		Calendar calendar = new GregorianCalendar();
		Calendar today = Calendar.getInstance();
		Calendar startDate = Calendar.getInstance();
		startDate.set(2024, 10, 18);
		startDate.set(Calendar.HOUR_OF_DAY, 9);
		startDate.set(Calendar.MINUTE, 10);
		printDate("개강일", startDate);
		printDate("지금", today);

		
	}
	// 
	public static void printDate(String content, Calendar date) {
		int year = date.get(Calendar.YEAR);
		int month = date.get(Calendar.MONTH)+1;
		int day = date.get(Calendar.DAY_OF_MONTH);
		// 요일
		int dayOfWeek = date.get(Calendar.DAY_OF_WEEK);
		int hour = date.get(Calendar.HOUR);
		// 24시간표시
		int hourOfDay = date.get(Calendar.HOUR_OF_DAY);
		int minute = date.get(Calendar.MINUTE);
		int second = date.get(Calendar.SECOND);
		int millisecond = date.get(Calendar.MILLISECOND);
		// 오전오후
		int ampm = date.get(Calendar.AM_PM);
		String dayWeek = "";
		switch(dayOfWeek) {
			case Calendar.SUNDAY    : dayWeek = "일요일"; break; 
			case Calendar.MONDAY    : dayWeek = "월요일"; break; 
			case Calendar.TUESDAY   : dayWeek = "화요일"; break; 
			case Calendar.WEDNESDAY : dayWeek = "수요일"; break; 
			case Calendar.THURSDAY  : dayWeek = "목요일"; break; 
			case Calendar.FRIDAY    : dayWeek = "금요일"; break; 
			case Calendar.SATURDAY  : dayWeek = "토요일"; break; 
		}
		String ap = "";
		if(Calendar.AM == ampm) {
			ap = "오전";
		}else {
			ap = "오후";
		}
			
		//String content = "";
		System.out.println(content + "은 "+year+"/"+month+"/"+day
				+"/"+dayWeek+"("+hourOfDay+"시) "+ap+" "+hour+"시 "+minute+"분 "+second+"초 "+millisecond+"밀리초입니다.");
		//System.out.println("2024/11/18/화요일(9시) 오전 9시 00분 0초 0밀리초에 개강하였습니다.");
	}
}











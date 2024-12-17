package com.sooket.day15.stream.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Exam_InputStreamRead {
	public static void main(String[] args) {
		try {
			InputStream is = new FileInputStream("C:\\Windows\\system.ini"); //inputStream으로 업캐스팅
			int readByte;
			
			// #1 while문 사용한 반복
			while((readByte = is.read()) != -1) {
				System.out.print((char)readByte);
			}
			
			
			// #2 do~while문 사용한 반복
			do {
				readByte = is.read();
				System.out.print((char)readByte);
			}while(readByte != -1);
			
			
			
			// #3 while(true)문
			while(true) { // 언제까지?? 다 읽을때까지 -> 다 읽은건 어떻게 알지? -> is.read() == -1 이면 다 읽은거
				readByte = is.read();
				if(readByte == -1) break;
				System.out.print((char)readByte);			
			}
			         
			
			// #4 for문
			for(;;) { // 언제까지?? 다 읽을때까지 -> 다 읽은건 어떻게 알지? -> is.read() == -1 이면 다 읽은거
				readByte = is.read();
				if(readByte == -1) break;
				System.out.print((char)readByte);			
			}
			is.close();
			//is.read();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

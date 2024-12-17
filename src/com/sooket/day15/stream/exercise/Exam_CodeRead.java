package com.sooket.day15.stream.exercise;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Exam_CodeRead {
	/*
	 * Exam_InputStreamReadByteOff.java 파일을 읽어서 콘솔에 출력해보세요
	 * 단, 문자기반 스트림을 이용하세요!
	 */
	public static void main(String[] args) {
		try {
			Reader rd= new FileReader("src/com/sooket/day15/stream/inputstream/Exam_InputStreamReadByteOff.java");
			int readCount;
			char [] cBuf = new char[3];
			String result = "";
			while((readCount = rd.read(cBuf, 0, 3)) != -1) {
				result += new String(cBuf, 0, readCount);
				
				//System.out.println(readCount);
			}
			System.out.println(result);
			rd.close();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}

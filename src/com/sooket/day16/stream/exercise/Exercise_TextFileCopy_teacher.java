package com.sooket.day16.stream.exercise;

import java.io.*;

public class Exercise_TextFileCopy_teacher {
	/*
	 * C:\\Windows\\system.ini을 복사해서
	 * C:\\Temp\\system.txt로 만들어주세요.
	 * 단, 문자 기반 스트림을 사용하세요
	 */
	public static void main(String[] args) {
		Reader reader = null;
		Writer writer = null;
		
		try {
			reader = new FileReader("C:\\Windows\\system.ini");
			writer = new FileWriter("C:\\Temp\\system.txt");
			int readCount;
			char [] cBuf = new char[1024];
			while(true) {
				readCount = reader.read(cBuf);
				if(readCount == -1) break;
				writer.write(cBuf, 0, readCount);
				writer.flush();
			}
			System.out.println("복사가 완료되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// close
			try {
				reader.close();
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}

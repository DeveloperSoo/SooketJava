package com.sooket.day16.stream.bufferedstream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Exam_BufferedStream {
	public static void main(String[] args) {
		Reader reader = null;				// 우리는 여태 Reader만 사용했는데
		BufferedReader bReader = null;		// 보조스트림을 통해 편하게 할 수 있음
		
		try {
			reader = new FileReader("src/com/sooket/day16/stream/exercise/Exercise_TextFileCopy.java");
			bReader = new BufferedReader(reader); // 보조스트림 객체 생성시 주스트림을 전달 해주어야함
//			int readCount;
//			readCount = reader.read(null);
			String line; 							   //읽은 데이터를 저장하는 변수
			while((line = bReader.readLine()) != null) //읽은 값이 없으면 더이상 동작하지 않도록 함.
				System.out.println(line);// readLine()이라는 보조스트림이 제공하는 메소드 사용해보기
				
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				reader.close();
				bReader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

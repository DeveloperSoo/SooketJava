package com.sooket.day16.stream.exercise;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class Exercise_TextFileCopy {
	/*
	 * C:\\Windows\\system.ini을 복사해서
	 * C:\\Temp\\system.txt로 만들어주세요.
	 * 단, 문자 기반 스트림을 사용하세요
	 */

	public static void main(String[] args) {
		
		try {
			Reader fr = new FileReader("C:\\Windows\\system.ini");
			Writer wr = new FileWriter("C:\\Temp\\system.txt");
			String result = "";
			
			int readByte;
			char [] readBytes = new char[1024];
			while((readByte = fr.read(readBytes)) != -1) {
				result += new String(readBytes , 0 , readByte);
			}

			
			String text = result;
			System.out.println("복사 완료됨요");
			fr.close();
			
			//System.out.println(text);
			
			
		
			wr.write(result);
			wr.flush();
			wr.close();
			
			System.out.println("저장됐나 확인요");
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	
}

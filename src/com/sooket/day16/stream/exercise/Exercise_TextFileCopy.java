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
		/*
		 * 파일을 복사하려고해
		 * C드라이브 밑 Windows 폴더 밑에 system.ini파일을 복사하려고해
		 * main() 메소드를 기준으로 생각했을때 해당 파일을 읽어야 하기
		 * 때문에 입력스트림을 사용해야해.
		 * 입력스트림을 사용해서 파일을 읽은 다음에 읽은 내용은
		 * 목적지 C:\\Temp\\system.txt 파일에 써야해
		 * main() 메소드를 기준으로 생각했을 때 해당 내용을 내보내야 하기
		 * 때문에 출력스트림을 사용해야해
		 * 출력스트림을 사용해서 읽은 내용은 system.txt 파일에 저장돼.
		 * 출력스트림을 쓸 때에는 flush(), close()를 해주어야해
		 * 둘중 하남나 해도 동작해. 그런데 우리는 다 써야해.
		 * 
		 */
		
		
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

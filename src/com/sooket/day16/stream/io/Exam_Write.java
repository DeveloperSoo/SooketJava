package com.sooket.day16.stream.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;

public class Exam_Write {
	public static void main(String[] args) {
		
		try {
			OutputStream os = new FileOutputStream("src/com/sooket/day16/stream/io/writing.txt");
			Writer fw = new FileWriter("src/com/sooket/day16/stream/io/writing2.txt");
			
			byte [] byteArrs = "헬로우 입출력".getBytes(); //배열에 스트링을 바이트로 변경해서 넣어줌
			os.write(byteArrs);
			os.flush(); //버퍼 비우기 , 남아있는것들 싹 털어넣는것
			os.close(); //포탈 닫음 / 자원해제
			System.out.println("파일쓰기 완료");
			
			fw.write("문자열 그대로 입력, 배열 변환 필요 없음");
			fw.flush();
			fw.close();
			System.out.println("패키지 클릭 후 F5를 눌러 확인해보세요.");
			
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

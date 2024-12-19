package com.sooket.day16.stream.exercise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Exercise_ImageCopy {

	/*
	 * C:\Windows\Web\Wallpaper\Windows\img0.jpg 를 복사해서
	 * C:\Temp\Copying.jpg로 만들어주세요.
	 * 단, 바이트 기반 스트림을 사용하세요
	 */
	
	public static void main(String[] args) {
				InputStream is = null;
				OutputStream os = null; 
		
		try {
			is = new FileInputStream("C:\\Windows\\Web\\Wallpaper\\Windows\\img0.jpg");
			os = new FileOutputStream("C:\\Temp\\Copying.jpg");
			
			int readCount;
			byte [] readBytes = new byte[1024];
			while(true) {
				readCount = is.read(readBytes);				
				if(readCount == -1) break;			// 다 읽었으면 멈춰
				// 읽은 내용은 몾겆기 파일에 저장해야해. 코드를 적어
				os.write(readBytes , 0 , readCount);
				/// flush() 해주어야해. 코드를 적어
				os.flush();
			}
			System.out.println("파일 복사 완료");
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
		
			e.printStackTrace();
		} finally {
			try {
				os.close();
				is.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
//String result = new String(cBuf, 0 , readCount);
//is.close();

//System.out.println("복사는 된듯요");
//
//int writeCount;
//byte [] writeBytes = result.getBytes();
//os.write(writeBytes);
//os.flush();
//os.close();
//
//System.out.println("한번 확인해보셔야할듯요");



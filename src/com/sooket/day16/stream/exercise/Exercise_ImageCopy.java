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
		try {
			InputStream is = new FileInputStream("C:\\Windows\\Web\\Wallpaper\\Windows\\img0.jpg");
			OutputStream os = new FileOutputStream("C:\\Temp\\Copying.jpg");
			
			int readCount;
			byte [] readBytes = new byte[1024];
			readCount = is.read(readBytes);
			String result = new String(readBytes, 0 , readCount);
			//System.out.println(result);
			is.close();
			
			System.out.println("복사는 된듯요");
			
			int writeCount;
			byte [] writeBytes = result.getBytes();
			os.write(writeBytes);
			os.flush();
			os.close();
			
			System.out.println("한번 확인해보셔야할듯요");
			
			
			
			
			
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}
	
	
	
	
}

package com.sooket.day09.objectarray;

import java.util.Scanner;

class Book {
	String name 	 = ""; // 생성자를 생략할 수 있도록 만듬
	String author 	 = "";
	String price	 = "";
	String publisher = "";
	
	
//	public Book() {  //이와 같은 방법으로 생성자에서 초기화를 시키는게 정석
//		name = "" ;
//		author = "";
//		price = "";
//		publisher = "";
//	}
	
	void printInfomation() {
		System.out.println(name + "의 작가는  "+ author +"입니다. 출판사는 " 
							+ publisher + "이고, 가격은 " + price + "입니다" );
	}
}


public class BookArray {
	public static void main(String[] args) {
//		Book book = new Book();
//		book.name = "자바의 신";
//		book.author = "김자바";
//		book.price = "28000원";
//		book.publisher = "길벗이지톡";
//		book.printInfomation();
		
		Scanner sc = new Scanner(System.in);
		
		
		Book [] books = new Book[5]; //books 라는 배열 5개를 만들건데 거기엔 Book 클래스가 각 한개씩 들어갈 수 있다 (객체 생성)
		for(int i = 0 ; i < books.length; i++) {
			books[i] = new Book();
			System.out.print("작가 : ");
			books[i].name = sc.next();
			books[i].author = "김자바";
			books[i].price = "28,000원";
			books[i].publisher = "길벗이지톡";
			books[i].printInfomation();
		}

		
//		books[1] = new Book();
//		books[1].name = "자바의 신";
//		books[1].author = "김자바";
//		books[1].price = "28,000원";
//		books[1].publisher = "길벗이지톡";
//		books[1].printInfomation();
//		
//		books[2] = new Book();
//		books[2].name = "자바의 신";
//		books[2].author = "김자바";
//		books[2].price = "28,000원";
//		books[2].publisher = "길벗이지톡";
//		books[2].printInfomation();
//		
//		books[3] = new Book();
//		books[3].name = "자바의 신";
//		books[3].author = "김자바";
//		books[3].price = "28,000원";
//		books[3].publisher = "길벗이지톡";
//		books[3].printInfomation();
//		
//		books[4] = new Book();
//		books[4].name = "자바의 신";
//		books[4].author = "김자바";
//		books[4].price = "28,000원";
//		books[4].publisher = "길벗이지톡";
//		books[4].printInfomation();
		
		
	}
}

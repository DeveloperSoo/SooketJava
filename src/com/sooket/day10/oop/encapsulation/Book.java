package com.sooket.day10.oop.encapsulation;

public class Book {
	// 제목과 저자의 필드 생성
	private String title;
	private String author;
	
	
	// 생성자 생성
	public Book() {}
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	//getter / setter 생성
	public String getTitle() {
		return this.title;
	}
	public String getAuthor() {
		return this.author;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	public void setAuthor(String author) {
		this.author = author;
	}	
	public static void main(String[] args) {
		Book book = new Book(); // 기본생성자를 통한 객체 생성
		book = new Book("춘향뎐", "작자미상"); //생성자를 통한 생성
		book.setTitle("어린왕자"); //set 메소드를 통해 private필드를 수정
		book.setAuthor("쌩떽쥐페리"); // set 메소드를 통해 private필드를 수정
		
		System.out.println("책 제목 : " + book.getTitle()); 
		System.out.println("저자 : " + book.getAuthor());
	}
}


		

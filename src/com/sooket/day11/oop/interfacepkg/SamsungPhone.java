package com.sooket.day11.oop.interfacepkg;



//public class SamsungPhone extends Calculator{
	public class SamsungPhone implements PhoneInterface {

		@Override
		public void printLogo() {
			System.out.println("===== SAMSUNG =====");
		}

		@Override
		public void sendCall() {
			System.out.println("===== SAMSUNG CALL=====");	
		}
		

		public static void main(String[] args) {
			//Cannot instantiate the type PhoneInterface
			//PhoneInterface phone = new PhoneInterface(); //인터페이스 객체 생성 불가
			PhoneInterface phone = new SamsungPhone(); //업캐스팅
			phone.printLogo(); //동적바인딩에 의한 작동 가능
			phone.sendCall();
			
			SamsungPhone sPhone = new SamsungPhone();
			sPhone.printLogo();
			sPhone.sendCall();
		}
}

package com.sooket.day11.oop.interfacepkg.zoo;

public class Zoo {
	public static void main(String[] args) {
		ZooKeeper zooKeeper =  new ZooKeeper();
		//Bear bear = new Bear(); 선언해서 써도됨
		
		zooKeeper.feed(new Bear());
		
		zooKeeper.feed(new Camel());
		
		zooKeeper.feed(new Deer());
		
	}
}

package com.sooket.day14.collection.list;

public class IntList {
	int [] nums;
	int size;
	
	public IntList() {
		nums = new int[3];
		size = 0;
	}
	
	public void add(int num) { //배열에 삽입하는 것을 메소드화 한것
		nums[size] = num;
		size++;
	}
	
	public int get(int index) {
		return nums[index];
	}
	
	
	public int size() {
		return size;
	}
	
	
	public void clear() {
		nums = new int[3];
//		for(int i = 0; i < nums.length; i++) { // 굳이 반복문을 안써도 새롭게 선언해서 초기화 가능
//			nums[i] = 0;
//		}
		size = 0;
//		nums[0] = 0;
//		nums[1] = 0;
//		nums[2] = 0;
	}
	

	
	
}

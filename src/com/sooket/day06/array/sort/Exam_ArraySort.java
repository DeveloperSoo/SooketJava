package com.sooket.day06.array.sort;

public class Exam_ArraySort {
	public static void main(String[] args) {
		int [] arrs = {1, 3, 2};
		
		int temp = arrs[1];
		arrs[1] = arrs[2];
		arrs[2] = temp;
		
		for(int arr: arrs) {
			System.out.print(arr+" ");			
		}
	}
}






/*
4,1,7,5,6 -> 41
14756 47
14756 75
14576 76
14567 14
[1]4567 45
[14]567 56
[145]67 67
[14567]

45631 45
45631 56
45631 63
45361 61
45316 53
43516 51
43156 56
43156 43
34156 41
31456 31
13456 34
*/
package com.sooket.day07.dimarray;

// 기능용 클래스
public class Exercise_DimArray {
	public void practice1() {
		System.out.println("practice1");
		// 5 4 3 2 1
		// 10 9 8 7 6
		// 15 14 13 12 11
		// 20 19 18 17 16
		// 25 24 23 22 21
		int dimNum [][] = new int [5][5];
		
		int k = 1;
		for(int i = 0; i < dimNum.length; i++) {
			for(int j = (dimNum[0].length-1); j >=0 ; j--) {
				dimNum[i][j] = k;
				k++;
			}			
		}
		
		for(int i = 0; i < dimNum.length; i++) {
			for(int j = 0; j <dimNum[0].length; j++) {
					System.out.printf("%2d\t", dimNum[i][j]);
			}
			System.out.println();
		}
		
//		arrs[4][0] = 1;
//		arrs[3][0] = 2;
//		arrs[2][0] = 3;
//		arrs[1][0] = 4;
//		arrs[0][0] = 5;
		
//		arrs[4][1] = 6;
//		arrs[3][1] = 7;
//		arrs[2][1] = 8;
//		arrs[1][1] = 9;
//		arrs[0][1] = 10;
//
//		arrs[4][2] = 11;
//		arrs[3][2] = 12;
//		arrs[2][2] = 13;
//		arrs[1][2] = 14;
//		arrs[0][2] = 15;
//		
//		arrs[4][3] = 16;
//		arrs[3][3] = 17;
//		arrs[2][3] = 18;
//		arrs[1][3] = 19;
//		arrs[0][3] = 20;
//
//		arrs[4][4] = 21;
//		arrs[3][4] = 22;
//		arrs[2][4] = 23;
//		arrs[1][4] = 24;
//		arrs[0][4] = 25;
//

		
		
//		dimNum[0][0] = 5;
//		dimNum[0][1] = 4;
//		dimNum[0][2] = 3;
//		dimNum[0][3] = 2;
//		dimNum[0][4] = 1;
//		

	}
	
	public void practice2() {
		System.out.println("practice2");
		// 5 10 15 20 25
		// 4 9 14 19 24
		// 3 8 13 18 23
		// 2 7 12 17 22
		// 1 6 11 16 21
		int dimNum [][] = new int[5][5];
		
		int k = 1;
		 for(int i = 0; i < 5; i++){
			 for(int j = 4; j >= 0; j--){
				dimNum[j][i] = k;
				k++;
			}
		}
			for(int i = 0; i < dimNum.length; i++) {
				for(int j = 0; j <dimNum[0].length; j++) {
						System.out.printf("%2d\t", dimNum[i][j]);
				}
				System.out.println();
			}
	}
	
	
	public void practice3() {
		System.out.println("practice3");
		// 1 6 11 16 21
		// 2 7 12 17 22
		// 3 8 13 18 23
		// 4 9 14 19 24
		// 5 10 15 20 25
		
		int dimNum [][] = new int[5][5];
		int k = 1;
		for(int j = 0; j < dimNum[0].length ; j++) {
			for(int i = 0; i < dimNum.length; i ++) {
				dimNum[i][j] = k;
				k++;
			}			
		}
		
		for(int i = 0; i < dimNum.length; i++) {
			for(int j = 0; j <dimNum[0].length; j++) {
					System.out.printf("%2d\t", dimNum[i][j]);
			}
			System.out.println();
		}
	}
	
	public void practice4() {
		System.out.println("practice4");
		// 1 2 3 4 5
		// 10 9 8 7 6
		// 11 12 13 14 15
		// 20 19 18 17 16
		// 21 22 23 24 25
		
		int dimNum [][] = new int[5][5];
		int k = 1;
		for(int j = 0; j < dimNum.length; j++) {
			if(j % 2 == 0) {
				for(int i = 0; i < dimNum[0].length; i++) {
					dimNum[j][i] = k;
					k++;
				}				
			}else {
				for(int i = dimNum[0].length-1; i >= 0; i--) {
					dimNum[j][i] = k;
					k++;
			}
		}
	}
		for(int j = 0; j < dimNum.length; j++) {
			for(int i = 0; i < dimNum[0].length; i++) {
				System.out.printf("%2d\t", dimNum[j][i]);
			}
			System.out.println();
		}
	}
}
//
//dimNum[0][0] = 1;
//dimNum[0][1] = 2;
//dimNum[0][2] = 3;
//dimNum[0][3] = 4;
//dimNum[0][4] = 5;
//
//dimNum[1][4] = 6;
//dimNum[1][3] = 7;
//dimNum[1][2] = 8;
//dimNum[1][1] = 9;
//dimNum[1][0] = 10;
//
//dimNum[2][0] = 11;
//dimNum[2][1] = 12;
//dimNum[2][2] = 13;
//dimNum[2][3] = 14;
//dimNum[2][4] = 15;

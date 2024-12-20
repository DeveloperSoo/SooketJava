package com.sooket.lss.workoutProject_second;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Member {
	Scanner sc;
	String id;
	
	public Member() {
		sc = new Scanner(System.in);
	}
	
	public Member(String id) {
		this.id = id;
	}
}
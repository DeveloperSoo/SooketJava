package com.sooket.lss.workoutProject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Workout {
		private String name;
		private String part;
		private String date;
		private int set;
		private int rep;
		private Scanner sc;
		List<Workout> list ;
		
		public Workout () {
			sc = new Scanner(System.in);
			list = new ArrayList<Workout>();
		}
		
		
		
		public Workout(String part, String date, int set , int rep) {
			this.part = part;
			this.date = date;
			this.set = set;
			this.rep = rep;
		}
		
		public Workout insertWorkout () {
			Workout list = new Workout();
			System.out.println("운동 등록");
			System.out.print("이름 : ");
			list.setName(sc.next());
			System.out.print("날짜 : ");
			list.setPart(sc.next());
			System.out.print("부위 : ");
			list.setDate(sc.next());
			System.out.print("세트 : ");
			list.setSet(sc.nextInt());
			System.out.print("세트 당 횟수 : ");
			list.setRep(sc.nextInt());
			
			return list;
		}

		public String getName() {
			return name;
		}
		
		public void setName(String name) {
			this.name = name;
		}

		public String getPart() {
			return part;
		}



		public void setPart(String part) {
			this.part = part;
		}

		public String getDate() {
			return date;
		}

		public void setDate(String date) {
			this.date = date;
		}
		

		public int getSet() {
			return set;
		}



		public void setSet(int set) {
			this.set = set;
		}



		public int getRep() {
			return rep;
		}



		public void setRep(int rep) {
			this.rep = rep;
		}
		



		@Override
		public String toString() {
			return "WorkoutList [part=" + part + ", set=" + set + ", rep=" + rep + "]";
		}
		
		
}

package com.sooket.day2x.music.model.vo;

public class Music implements Comparable<Music>{ // 여기에서 사용하는 comparable은
	// 곡명 : title, 가수명 : singer
	private String title;
	private String singer;
	
	public Music () {}
	
	public Music(String title, String singer) {
		this.title = title;
		this.singer = singer;	
	}

	public String getTitle() {
		return title;
	}

	public String getSinger() {
		return singer;
	}

	@Override
	public String toString() {
		return "Music [title=" + title + ", singer=" + singer + "]";
	}
	
	@Override
	public int compareTo(Music o) {
		return this.title.compareTo(o.getTitle()); //-1 , 0 , 1
	}
	
}

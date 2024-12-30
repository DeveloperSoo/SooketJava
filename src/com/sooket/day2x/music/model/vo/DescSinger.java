package com.sooket.day2x.music.model.vo;

import java.util.Comparator;

public class DescSinger implements Comparator<Music>{

	@Override
	public int compare(Music o1, Music o2) {
		// TODO Auto-generated method stub
		return o1.getSinger().compareTo(o2.getSinger()) * -1;
	}

}

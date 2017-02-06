package com.sbsatter.springinaction.dao;

import org.springframework.stereotype.Component;

/**
 * Created by sbsatter on 2/6/17.
 */
@Component
public class DeathMagnetic implements Album {
	private String title = "Unforgiven III";
	private String artist = "Metallica";
	
	public String play(){
//		System.out.println("Currently playing: " + title + " by " + artist);
		String state = "Currently playing: " + title + " by " + artist;
		return state;
	}
}

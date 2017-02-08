package com.sbsatter.springinaction.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by sbsatter on 2/7/17.
 */
@Component
public class CDPlayer implements MediaPlayer {
	
	private CompactDisc compactDisc;
	
	@Autowired
	public CDPlayer(CompactDisc cd){
		this.compactDisc = cd;
	}
	
	@Autowired
	public void setCompactDisc(CompactDisc compactDisc) {
		this.compactDisc = compactDisc;
	}
	
	public void play(){
		compactDisc.play();
	}
}

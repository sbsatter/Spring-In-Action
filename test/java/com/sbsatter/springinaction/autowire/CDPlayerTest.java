package com.sbsatter.springinaction.autowire;

import org.hamcrest.CoreMatchers;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;


/**
 * Created by sbsatter on 2/6/17.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= CDPlayerConfig.class)
public class CDPlayerTest {
	
	@Rule
	public final StandardOutputStreamLog log = new StandardOutputStreamLog();
	
	@Autowired
	private CompactDisc compactDisc;
	
	@Autowired
	private MediaPlayer player;
	
	@Test
	public void albumShouldNotBeNull(){
		assertNotNull(compactDisc);
	}
	
	@Test
	public void albumShouldContainString(){
		assertThat(compactDisc.play(), CoreMatchers.containsString("Metallica"));
	}
	
	@Test
	public void Test(){
		player.play();
		assertEquals("Currently playing: Unforgiven III by Metallica\n", log.getLog());
	}
}

package com.sbsatter.springinaction.dao;

import com.sbsatter.springinaction.config.MusicPlayerConfig;
import org.hamcrest.CoreMatchers;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;


/**
 * Created by sbsatter on 2/6/17.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= MusicPlayerConfig.class)
public class MusicPlayerConfigTest {
	@Autowired
	private Album album;
	
	@Test
	public void albumShouldNotBeNull(){
		assertNotNull(album);
	}
	
	@Test
	public void albumShouldContainString(){
		assertThat(album.play(), CoreMatchers.containsString("play"));
	}
}

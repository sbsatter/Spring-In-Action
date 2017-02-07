package com.sbsatter.springinaction.autowire;

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
@ContextConfiguration(classes= CDPlayerConfig.class)
public class CDPlayerTest {
	@Autowired
	private CompactDisc compactDisc;
	
	@Test
	public void albumShouldNotBeNull(){
		assertNotNull(compactDisc);
	}
	
	@Test
	public void albumShouldContainString(){
		assertThat(compactDisc.play(), CoreMatchers.containsString("Metallica"));
	}
}

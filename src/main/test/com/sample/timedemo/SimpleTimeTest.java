package com.sample.timedemo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.sample.timedemo.SimpleTime;

public class SimpleTimeTest {

	private SimpleTime simpleTime;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		simpleTime = new SimpleTime();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public final void testGetTime() {
		
		assertNotNull(simpleTime.getTime());
	}

}

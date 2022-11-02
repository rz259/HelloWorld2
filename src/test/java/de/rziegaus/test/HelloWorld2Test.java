package de.rziegaus.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import de.rziegaus.HelloWorld2;

class HelloWorld2Test
{

	@BeforeAll
	static void setUpBeforeClass() throws Exception
	{
	}

	@BeforeEach
	void setUp() throws Exception
	{
	}

	@Test
	void testGetGreeting()
	{
		assertEquals(HelloWorld2.getGreeting(), "Hello World 2");
	}

	@Test
	void testAlwaysTrue()
	{
		assertTrue(true);
	}

}

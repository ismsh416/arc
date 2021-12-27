package com;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class TestJunit {
	@Test
public void testSetup()
{
	String str="JUNIT is working fine";
	assertEquals("JUNIT is working fine", str);
}
}

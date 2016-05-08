package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class triangleTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testMain() {
		triangle tri =new triangle();
		
		assertEquals(1,tri.triangle(2,2,2));
		assertEquals(2,tri.triangle(1,2,2));
		assertEquals(3,tri.triangle(4,3,5));
		assertEquals(4,tri.triangle(1,3,2));

	}

}

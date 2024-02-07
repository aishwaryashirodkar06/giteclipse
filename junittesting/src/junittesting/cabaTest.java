package junittesting;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class cabaTest {
	
	caba cb=new caba(2,4);
	

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testmoves() {
		int move=cb.move(2);
		assertEquals(3,move);
	}
	
	@Test
	public void testeat() {
		int eat=cb.eat(4);
		assertEquals(6,eat);
	}

}

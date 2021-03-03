import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class BeforeAndAfter {

	@Test
	public void testA() {
		System.out.println("test A");
	}
	@Test
	public void testB() {
		System.out.println("test B");
	}
	@Test
	public void testC() {
	System.out.println("test C");
	}
	@Before
	public void beforeTest() {
		System.out.println("beforeTest");
	}
	@After
	public void afterTest() {
		System.out.println("afterTest");	
	}
	@BeforeClass
	public static void beforeClassTest() {
		System.out.println("beforeClassTest");
	}
	@AfterClass
	public static void afterClassTest() {
		System.out.println("afterClassTest");
	}
}

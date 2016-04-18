package cn.edu.tju.scs.spm.my_app_simple;

import org.junit.Test;

import junit.framework.TestCase;
/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {


	@Test
	public void testWelcome() {
		App app = new App();
		String result = app.welcome("a");
		assertEquals(result, "Hello, a!");
	}
}

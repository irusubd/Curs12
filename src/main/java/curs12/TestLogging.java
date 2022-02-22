package curs12;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestNgListener.class)
public class TestLogging {
	
	@Test
	public void testlogin() {
		Log.info("This is a login test.");
	}
	
	@Test
	public void testProduct() {
		Log.info("this is a product test.");
		assertTrue(false);
	}

}

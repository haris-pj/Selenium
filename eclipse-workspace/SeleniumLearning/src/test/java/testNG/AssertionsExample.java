package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionsExample {
	
	String name="Dump";
	
	@Test
	public void checkEqual() {
		Assert.assertEquals(name, "Dump");
		Assert.assertNotEquals(name, "DUMP");
	}

}

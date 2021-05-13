package javaProblemsInterview;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SeleniumExample {

	@Test
	private void y() {
		System.out.println("Inside Y");
		try {
			a();
			b();
			c();
		} catch (AssertionError e) {
			Assert.fail("Inside Y => Test Has Failed");
		}

		Assert.assertTrue(true, "Inside Y => Test Has Passed");
	}

	private void a() {
		System.out.println("Inside A");
		Assert.assertTrue(true, "Inside A => Test Has Passed");
	}

	private void b() {
		System.out.println("Inside B");
		Assert.assertTrue(true, "Inside B => Test Has Passed");
		Assert.fail("Failed method : B");
	}

	private void c() {
		System.out.println("Inside C");
		Assert.assertTrue(true, "Inside C => Test Has Passed");
	}

}

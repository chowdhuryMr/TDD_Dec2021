package PageTests;

import org.testng.annotations.Test;

public class FunTests {
	@Test(groups = { "SanityTest" }, priority = 1)
	public void funTest2() {
		System.out.println("funTest 2 executed");
	}

	@Test(groups = { "RegressionTest" })
	public void funTest3() {
		System.out.println("funTest 3 executed");
	}
}

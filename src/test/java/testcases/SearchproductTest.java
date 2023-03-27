package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchproductTest {
	@Test
	public void SearchProductUser() {
		System.out.println("this is search product user test case");
	}
@Test(enabled = false)
public void searchProductUser() {
	Assert.fail("Some reason");
}
}

package TestingStuff;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.greenKart.pageObject.LandingPage;

import TestUtility.BaseTest;

public class TestExecutionFild extends BaseTest {

	@Test
	public void landing() {
		(new LandingPage(driver)).landPage();
	}

	@Test
	public void ValidateIconOfGreenKart() {
		(new LandingPage(driver)).logoOfGreenKart();
	}

	@Test(dataProvider = "getData")
	public void validateAddKartButton(String name, String name2, String name3) {
		System.out.println(name + name2);
		(new LandingPage(driver)).ItemNameAndAddKart(name, name2, name3);
	}

	@DataProvider
	public Object[][] getData() {

		return new Object[][] { { "Brocolli", "Cauliflowe", "Cucumber" }, { "Beans", "Brinjal", "Beetroot" } };
	}
}

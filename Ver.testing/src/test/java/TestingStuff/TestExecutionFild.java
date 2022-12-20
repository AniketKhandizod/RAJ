package TestingStuff;

import org.testng.annotations.Test;

import com.GreenKart.Ver.testing.BaseTest;
import com.GreenKart.Ver.testing.LandingPage;

public class TestExecutionFild extends BaseTest {

	@Test
	public void landing() {
		(new LandingPage(driver)).landPage();
	}
	@Test
	public void ValidateIconOfGreenKart() {
		(new LandingPage(driver)).logoOfGreenKart();
	}
}

package TestingStuff;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import org.testng.Assert;
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
	@Test
	public void failed01() throws IOException
	{
		
		Desktop.getDesktop().open(new File("C://Users//admin//git//RAJ//Ver.testing//ScreenShot//logo.png"));
		Assert.fail();
	}

	
}

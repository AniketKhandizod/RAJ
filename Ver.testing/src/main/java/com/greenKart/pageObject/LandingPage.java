package com.greenKart.pageObject;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Resources.AbstractComponents;

public class LandingPage extends AbstractComponents {

	WebDriver driver;

	public LandingPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "[class=\"brand greenLogo\"]")
	WebElement Logo;

	public void landPage() {
		String ExpectedUrl = "https://rahulshettyacademy.com/seleniumPractise/#/";
		String ActualUrl = driver.getCurrentUrl();
		Assert.assertEquals(ExpectedUrl, ActualUrl);
	}

	public void logoOfGreenKart() {
		SS(Logo, "logo");
	}

}

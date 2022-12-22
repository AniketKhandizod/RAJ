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

	@FindBy(css = "h4[class='product-name']")
	List<WebElement> nameOfProduct;

	@FindBy(css = ".product-action [type='button']")
	List<WebElement> AddKartButton;

	@FindBy(xpath = "(//td/strong)[1]")
	WebElement count;

	public void landPage() {
		String ExpectedUrl = "https://rahulshettyacademy.com/seleniumPractise/#/";
		String ActualUrl = driver.getCurrentUrl();
		Assert.assertEquals(ExpectedUrl, ActualUrl);
	}

	public void logoOfGreenKart() {
		SS(Logo, "logo");
	}

	public void ItemNameAndAddKart(String name1, String name2, String name3) {
		for (int i = 0; i < nameOfProduct.size(); i++) {

			if (nameOfProduct.get(i).getText().split("-")[0].trim().contains(name1)) {
				AddKartButton.get(i).click();
				System.out.println(count.getText());
			} else {
			}
			if (nameOfProduct.get(i).getText().split("-")[0].trim().contains(name2)) {
				AddKartButton.get(i).click();
				System.out.println(count.getText());
			} else {
			}
			if (nameOfProduct.get(i).getText().split("-")[0].trim().contains(name3)) {
				AddKartButton.get(i).click();
				System.out.println(count.getText());
			}
		}

	}

}

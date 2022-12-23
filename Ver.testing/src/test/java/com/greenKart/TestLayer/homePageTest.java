package com.greenKart.TestLayer;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.greenKart.pageObject.LandingPage;

import TestUtility.BaseTest;

public class homePageTest extends BaseTest {

	@Test
	public void landing() {
		(new LandingPage(driver)).landPage();
	}

	@Test
	public void ValidateIconOfGreenKart() {
		(new LandingPage(driver)).logoOfGreenKart();
	}


}

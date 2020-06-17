package com.testingshastra.pages;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Testing.Constants;
import com.Testing.MyntraKeyword;
import com.testingshastra.pages.loginHeaderPage;



public class logInHeaderTest {

	@Test
	public void signInTest() {
		MyntraKeyword.openBrowser("Chrome");
		MyntraKeyword.openUrl("https://www.myntra.com/");
		MyntraKeyword.windowMaximize();
		MyntraKeyword.implictWait();

		loginHeaderPage ph = PageFactory.initElements(Constants.driver, loginHeaderPage.class);
		ph.isLogoDisplayed();
		Assert.assertTrue(ph.isLogoDisplayed(), "Logo not visible");

		ph.mouseHoverOnProfile();
		ph.clickOnSignBtn();
		ph.logIn();
		ph.clickOnContinueBtn();
		ph.logInPasswordEnter();
		ph.clickOnLogInBtn();
		

	}

}

package com.testingshastra.pages;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Testing.Constants;
import com.Testing.MyntraKeyword;

public class SearchAndSelectTest {

	@Test
	public void searchAndSelect() {
		MyntraKeyword.openBrowser("Chrome");
		MyntraKeyword.openUrl("https://www.myntra.com/");
		MyntraKeyword.windowMaximize();
		MyntraKeyword.implictWait();

		SearcSelecthHeaderPage sn = PageFactory.initElements(Constants.driver, SearcSelecthHeaderPage.class);
          sn.searchText();
          sn.clickOnMagnifier();
          sn.clickOnLogoRedirectToHomPage();
	}

}

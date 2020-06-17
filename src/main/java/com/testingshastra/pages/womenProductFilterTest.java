package com.testingshastra.pages;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Testing.Constants;
import com.Testing.MyntraKeyword;

public class womenProductFilterTest {
	public class menProductFilterTest {
		@BeforeTest
		public void base() {
			MyntraKeyword.openBrowser("Chrome");
			MyntraKeyword.openUrl("https://www.myntra.com/");
			MyntraKeyword.windowMaximize();
			MyntraKeyword.implictWait();

		}

		@Test
		public void verifyCategeoriesCheckBoxFilter() {

			womenProductFilterpage pf = PageFactory.initElements(Constants.driver, womenProductFilterpage.class);
			pf.mouseHoveronwomenLink();
			pf.clickOnwomenproduct();
			pf.clickOnCategeoriesCheckBox();
			pf.clickOnBrandCheckBox();
			pf.pageScrollproductPage();
			pf.clickOnColourCheckBox();

		}
		
	}
}

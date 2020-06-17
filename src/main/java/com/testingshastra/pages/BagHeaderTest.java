package com.testingshastra.pages;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Testing.Constants;
import com.Testing.MyntraKeyword;

public class BagHeaderTest {
	@Test
	public void productaddToBag() {
		MyntraKeyword.openBrowser("Chrome");
		MyntraKeyword.openUrl("https://www.myntra.com/");
		MyntraKeyword.windowMaximize();
		MyntraKeyword.implictWait();

		BagHeaderPage bh = PageFactory.initElements(Constants.driver, BagHeaderPage.class);
		bh.mouseHoveronMenLink();
		bh.clickOnMenproduct();
		bh.clickOnProduct();
		bh.clickOnSelectSize();
		bh.clickOnAddToBag();

	}

}

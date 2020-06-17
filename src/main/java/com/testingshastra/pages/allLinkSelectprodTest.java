package com.testingshastra.pages;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Testing.Constants;
import com.Testing.MyntraKeyword;

public class allLinkSelectprodTest {
	@Test
	public void menLinkSelectProd() {
		MyntraKeyword.openBrowser("Chrome");
		MyntraKeyword.openUrl("https://www.myntra.com/");
		MyntraKeyword.windowMaximize();
		MyntraKeyword.implictWait();
		MyntraKeyword.deleteCookies();

		allLinkSelectProdpage ms = PageFactory.initElements(Constants.driver, allLinkSelectProdpage.class);
		ms.mouseHoverOnMenLink();
		ms.clickOnMenproduct();
		ms.mouseHoverOnWomenLink();
		ms.clickOnWomenproduct();
		ms.mouseHoverOnKidsLink();
		ms.clickOnKidsproduct();
		ms.mouseHoverOnHomeAndLiving();
		ms.clickOnHomeAndLivingProduct();
		ms.mouseHoverOnEssentialLink();
		ms.clickOnEssentialproduct();
	}
}

package com.testingshastra.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.Testing.MyntraKeyword;

public class SearcSelecthHeaderPage extends MyntraKeyword {
	@FindBy(xpath = "//input[@placeholder='Search for products, brands and more']")
	private WebElement SearchBar;

	@FindBy(xpath = "//span[@class='myntraweb-sprite desktop-iconSearch sprites-search']")
	private WebElement Magnifier;
	
	@FindBy(xpath="//a[@class='myntraweb-sprite desktop-logo sprites-headerLogo']")
	private WebElement clickLogo;

	public void  searchText() {
		SearchBar.sendKeys("Fastrack Watch");
	}

	public void clickOnMagnifier() {
		Magnifier.click();
	}
	public void clickOnLogoRedirectToHomPage() {
		clickLogo.click();

	}

}

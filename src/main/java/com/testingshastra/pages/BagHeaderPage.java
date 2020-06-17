package com.testingshastra.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.Testing.Constants;
import com.Testing.MyntraKeyword;

public class BagHeaderPage extends MyntraKeyword {

	@FindBy(xpath = "//a[@class='desktop-main'][contains(text(),'Men')]")
	private WebElement men;

	@FindBy(xpath = "//div[@class='desktop-navLinks']//div[1]//div[1]//div[1]//div[1]//div[1]//li[1]//ul[1]//li[7]//a[1]")
	private WebElement jacket;

	@FindBy(xpath = "//li[1]//a[1]//div[1]//div[1]//div[1]//div[1]//picture[1]//img[1]")
	private WebElement product;

	@FindBy(xpath = "//div[@class='desktop-navLinks']//div[1]//div[1]//div[1]//div[1]//div[1]//li[1]//ul[1]//li[7]//a[1]")
	private WebElement size;
	
	
	@FindBy(xpath="//div[contains(text(),'ADD TO BAG')]")
	private WebElement addToBag;

	public void mouseHoveronMenLink() {
		action = new Actions(Constants.driver);
		action.moveToElement(men).perform();
	}

	public void clickOnMenproduct() {
		jacket.click();

	}

	public void clickOnProduct() {
		product.click();
	}

	public void clickOnSelectSize() {
		size.click();

	}
	public void clickOnAddToBag() {
		addToBag.click();
	}


}

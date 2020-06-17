package com.testingshastra.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.Testing.Constants;
import com.Testing.MyntraKeyword;

public class allLinkSelectProdpage extends MyntraKeyword {

	@FindBy(xpath = "//a[@class='desktop-main'][contains(text(),'Men')]")
	private WebElement menLink;

	@FindBy(xpath = "//a[contains(text(),'Casual Shirts')]")
	private WebElement casualshirt;

	@FindBy(xpath = "//a[contains(text(),'Women')]")
	private WebElement womenLink;

	@FindBy(xpath = "//a[@class='desktop-main'][contains(text(),'Kids')]")
	private WebElement kids;

	@FindBy(xpath = "//div[3]//div[1]//div[1]//div[1]//div[1]//li[2]//ul[1]//li[2]//a[1]")
	private WebElement kidsdresses;

	@FindBy(xpath = "//a[contains(text(),'Kurtas & Suits')]")
	private WebElement kurtasandSuits;

	@FindBy(xpath = "//a[@class='desktop-main'][contains(text(),'Home & Living')]")
	private WebElement homeAndLiving;

	@FindBy(xpath = "//a[contains(text(),'Plants & Planters')]")
	private WebElement plantAndPlanters;

	@FindBy(xpath = "//a[contains(text(),'Essentials')]")
	private WebElement essential;

	@FindBy(xpath = "//a[contains(text(),'Masks')]")
	private WebElement masks;

	public void mouseHoverOnMenLink() {
		action = new Actions(Constants.driver);
		action.moveToElement(menLink).perform();

	}

	public void mouseHoverOnWomenLink() {
		action = new Actions(Constants.driver);
		action.moveToElement(womenLink).perform();

	}

	public void clickOnWomenproduct() {
		kurtasandSuits.click();

	}

	public void clickOnMenproduct() {
		casualshirt.click();
	}

	public void mouseHoverOnKidsLink() {
		action = new Actions(Constants.driver);
		action.moveToElement(kids).perform();

	}

	public void clickOnKidsproduct() {
		kids.click();
	}

	public void mouseHoverOnHomeAndLiving() {
		action = new Actions(Constants.driver);
		action.moveToElement(homeAndLiving).perform();

	}

	public void clickOnHomeAndLivingProduct() {
		plantAndPlanters.click();
	}

	public void mouseHoverOnEssentialLink() {
		action = new Actions(Constants.driver);
		action.moveToElement(essential).perform();

	}

	public void clickOnEssentialproduct() {
		masks.click();
	}

}

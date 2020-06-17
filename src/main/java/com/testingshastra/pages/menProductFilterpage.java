package com.testingshastra.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.Testing.Constants;
import com.Testing.MyntraKeyword;

public class menProductFilterpage extends MyntraKeyword {
	@FindBy(xpath = "//a[@class='desktop-main'][contains(text(),'Men')]")
	private WebElement men;

	@FindBy(xpath = "//div[@class='desktop-navLinks']//div[1]//div[1]//div[1]//div[1]//div[1]//li[1]//ul[1]//li[7]//a[1]")
	private WebElement jacket;
	
	@FindBy(xpath="//label[contains(text(),'Jackets')]")
	private WebElement categeories;
	
	@FindBy(xpath="//label[contains(text(),'Puma')]")
	private WebElement brand;
	
	@FindBy(xpath="//html")
	private WebElement scrollBar;
	
	@FindBy(xpath="//div[4]//ul[1]//li[3]//label[1]//div[1]")
	private WebElement colour;
	

	public void mouseHoveronMenLink() {
		action = new Actions(Constants.driver);
		action.moveToElement(men).perform();
	}

	public void clickOnMenproduct() {
		jacket.click();

	}
	public void clickOnCategeoriesCheckBox() {
		categeories.click();
	}
	public void clickOnBrandCheckBox() {
       brand.click();
	}
 public void pageScrollproductPage() {
	 JavascriptExecutor js=(JavascriptExecutor)Constants.driver;
     js.executeScript("window.scrollBy(0,500)");
	
}
 public void clickOnColourCheckBox() {
	 colour.click();
} 
 
	

}

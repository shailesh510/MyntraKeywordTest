package com.testingshastra.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.Testing.Constants;
import com.Testing.MyntraKeyword;

public class womenProductFilterpage extends MyntraKeyword {
	
	@FindBy(xpath = "//a[contains(text(),'Women')]")
	private WebElement womenLink;
	
	@FindBy(xpath = "//a[contains(text(),'Kurtas & Suits')]")
	private WebElement kurtasSuits;
	
	@FindBy(xpath="//label[contains(text(),'Kurta Sets')]")
	private WebElement categeories;
	
	@FindBy(xpath="//label[contains(text(),'Biba')]")
	private WebElement brand;
	
	@FindBy(xpath="//html")
	private WebElement srollbar;
	
	@FindBy(xpath="//label[contains(text(),'Pink')]")
	private WebElement colour;
	
	public void mouseHoveronwomenLink() {
		action = new Actions(Constants.driver);
		action.moveToElement(womenLink).perform();
	}
	public void clickOnwomenproduct() {
		kurtasSuits.click();
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





package com.testingshastra.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.Testing.Constants;
import com.Testing.MyntraKeyword;

public class kidsProductFilterpage extends MyntraKeyword {

	@FindBy(xpath = "//a[@class='desktop-main'][contains(text(),'Kids')]")
	private WebElement kids;

	@FindBy(xpath = "//div[3]//div[1]//div[1]//div[1]//div[1]//li[2]//ul[1]//li[2]//a[1]")
	private WebElement kidsdresses;

	/*
	 * @FindBy(xpath = "//label[contains(text(),'Gini and Jony')]") private
	 * WebElement brand;
	 * 
	 * @FindBy(xpath = "//html") private WebElement scollBar;
	 * 
	 * @FindBy(xpath = "//div[4]//ul[1]//li[1]//label[1]//div[1]") private
	 * WebElement colour;
	 * 
	 * @FindBy(xpath =
	 * "//div[@class='search-rightContainer column-base']//li[1]//label[1]//span[1]"
	 * ) private WebElement age;
	 * 
	 * @FindBy(xpath = "//label[contains(text(),'0M-6M')]") private WebElement
	 * zeroto6month;
	 * 
	 * @FindBy(xpath = "//h4[contains(text(),'Bundles')]") private WebElement
	 * bundles;
	 * 
	 * @FindBy(xpath = "//label[contains(text(),'Single Styles')]") private
	 * WebElement singleStyle;
	 * 
	 * @FindBy(xpath = "//li[3]//label[1]//h4[1]") private WebElement febric;
	 * 
	 * @FindBy(xpath = "//label[contains(text(),'Cotton')]") private WebElement
	 * cotton;
	 * 
	 * @FindBy(xpath = "//h4[contains(text(),'Fabric Type')]") private
	 * WebElement febricType;
	 * 
	 * @FindBy(xpath = "//label[contains(text(),'Denim')]") private WebElement
	 * denim;
	 * 
	 * @FindBy(xpath = "//h4[contains(text(),'Length')]") private WebElement
	 * length;
	 * 
	 * @FindBy(xpath = "//label[contains(text(),'Maxi')]") private WebElement
	 * maxi;
	 * 
	 * @FindBy(xpath = "//h4[contains(text(),'Neck')]") private WebElement neck;
	 * 
	 * @FindBy(xpath = "//label[contains(text(),'Cowl Neck')]") private
	 * WebElement cowlNeck;
	 * 
	 * @FindBy(xpath = "//h4[contains(text(),'Occasion')]") private WebElement
	 * occasion;
	 * 
	 * @FindBy(xpath = "//label[contains(text(),'Party')]") private WebElement
	 * party;
	 */

	@FindBy(xpath = "//div[@class='atsa-more']//span[1]")
	private WebElement more8;

	@FindBy(xpath = "//li[8]//label[1]//h4[1]")
	private WebElement pattern;

	@FindBy(xpath = "//label[contains(text(),'Printed')]")
	private WebElement printed;

	@FindBy(xpath = "//h4[contains(text(),'Print or Pattern Type')]")
	private WebElement printOrPatternType;

	@FindBy(xpath = "//label[contains(text(),'Abstract')]")
	private WebElement abstrac;

	@FindBy(xpath = "//h4[contains(text(),'Shape')]")
	private WebElement shape;

	@FindBy(xpath = "//label[contains(text(),'A-Line')]")
	private WebElement a_Line;
	
	@FindBy(xpath="//h4[contains(text(),'Sleeve Length')]")
     private WebElement sleevLength;
	
	@FindBy(xpath="//label[contains(text(),'Short Sleeves')]")
	private WebElement shorts;
	
	@FindBy(xpath="//h4[contains(text(),'Sleeve Styling')]")
	private WebElement sleeveStyling;
	
	@FindBy(xpath="//label[contains(text(),'Cap Sleeves')]")
	private WebElement capSleves;
	
	@FindBy(xpath="//h4[contains(text(),'Stitch')]")
	private WebElement stitch;
	
	@FindBy(xpath="//label[contains(text(),'Ready to Wear')]")
	private WebElement readyToWear;
	
	@FindBy(xpath="//h4[contains(text(),'Sleeve Styling')]")
	private WebElement surfaceStyling;
	
	@FindBy(xpath="//label[contains(text(),'Bow')]")
	private WebElement bow;
	
	@FindBy(xpath="//h4[contains(text(),'Transparency')]")
	private WebElement transparency;
	
	@FindBy(xpath="//div//div//div//div//div//div//section//li[3]//label[1]//div[1]")
	private WebElement sheer;
	
	@FindBy(xpath="//span[contains(text(),'Recommended')]")
	private WebElement recommended;
	
	public void mouseHoveronKidsLink() {
		action = new Actions(Constants.driver);
		action.moveToElement(kids).perform();

	}

	public void clickOnKidsproduct() {
		kidsdresses.click();
	}

	/*
	 * public void clickOnbrandCheckbox() { brand.click(); }
	 * 
	 * public void pageScrollproductPage() { JavascriptExecutor js =
	 * (JavascriptExecutor) Constants.driver;
	 * js.executeScript("window.scrollBy(0,700)");
	 * 
	 * }
	 * 
	 * public void clickOnColourCategeories() { colour.click(); }
	 * 
	 * public void clickOnAgefltr() { age.click(); }
	 * 
	 * public void clickOn0to6month() { zeroto6month.click(); }
	 * 
	 * public void clickOnBundlesfltr() { bundles.click(); }
	 * 
	 * public void clickOnStyleSinglefltr() { singleStyle.click(); }
	 * 
	 * public void clickOnFebricfltr() { febric.click(); }
	 * 
	 * public void clickOnCottonfltr() { cotton.click(); }
	 * 
	 * public void clickOnFebricTypefltr() { febricType.click(); }
	 * 
	 * public void clickOnDenimfltr() { denim.click(); }
	 * 
	 * public void clickOnLengthfltr() { length.click(); }
	 * 
	 * public void clickOnLengthMaxifltr() { maxi.click(); }
	 * 
	 * public void clickOnNeckfltr() { neck.click(); }
	 * 
	 * public void clickOnCowlNeck() { cowlNeck.click(); }
	 * 
	 * public void clickOnOccasionfltr() { occasion.click(); }
	 * 
	 * public void clickOnpartyfltr() { party.click(); }
	 */
	public void clickOn8More() {
		more8.click();
	}

	public void clickOnPatternfltr() {
		pattern.click();
	}

	public void clickOnPrintedInPattern() {
		printed.click();
	}

	public void clickOnPrintOrPatternType() {
		printOrPatternType.click();
	}

	public void clickOnAbstractInPrintOrPattern() {
		abstrac.click();
	}

	public void clickOnShapefltr() {
		shape.click();
	}

	public void clickOnALineInShape() {
		a_Line.click();
	}
	public void clickOnSleeve_Length() {
		sleevLength.click();
	}
	public void clickOnShortInSleeveLength() {
		shorts.click();
	}
	public void clickOnSleeveStyling() {
		sleeveStyling.click();

	}
	public void clickOnCapSleeveInSleeveStyling() {
		capSleves.click();

	}
	public void clickOnStitchFltr() {
		stitch.click();
	}
	public void clickOnReadyTowearInStitch() {
		readyToWear.click();
	}
	public void clickOnSurfaceStyling() {
		surfaceStyling.click();
	}
	public void clickOnBowInSurfaceStyling() {
       bow.click();
	}
	public void clickOnTransparncy() {
		transparency.click();
	}
	public void clickOnSheerInTransparency() {
		sheer.click();

	}
	public void mouseHoverOnRecommended() {
		 action = new Actions(Constants.driver);
		action.moveToElement(recommended ).perform();

	}
}
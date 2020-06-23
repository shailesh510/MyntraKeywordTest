package com.TestingSearchComponent;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.MyntraCustomeUtil.PropertiesUtil;
import com.Testing.MyntraKeyword;

public class myntraSearchComponent {

	@BeforeTest
	private void base() {
		MyntraKeyword.openBrowser("Chrome");
		MyntraKeyword.openUrl("url");
		MyntraKeyword.windowMaximize();
		MyntraKeyword.pageLoadTimeOut();
		MyntraKeyword.implictWait();

	}

	/*@AfterMethod
	public void finalMethod() {
		MyntraKeyword.close();
	}*/

	@Test
	public void signUpLogin() {

		MyntraKeyword.MouseMoveToLocation("xpath", "//span[contains(text(),'Profile')]");
		MyntraKeyword.performClick("xpath", "//a[@class='desktop-linkButton']");
		MyntraKeyword.enterText("xpath", PropertiesUtil.getProperty("MobilenoInput"), "7387503935");
		MyntraKeyword.performClick("xpath", " //div[@class='submitBottomOption']");
		MyntraKeyword.enterText("xpath", "//input[@class='form-control has-feedback']", "@Shailesh$1234");
		MyntraKeyword.performClick("xpath", "//button[contains(@class,'lg block submitButton')]");

	}

	/*@Test
	public void verifySearch() {
		MyntraKeyword.enterText("xpath", "//input[@placeholder='Search for products, brands and more']", "shoes");
		MyntraKeyword.performClick("xpath", "//span[contains(@class,'myntraweb-sprite desktop-iconSearch')]");
	}

	@Test
	public void verifyMenLink() {
		MyntraKeyword.isDisplayed("xpath", "//a[@class='desktop-main'][contains(text(),'Men')]");
		Assert.assertEquals("MEN", "LocatorVlaue");
	}

	@Test
	public void verifyMenLinkAndSelect() {
		MyntraKeyword.MouseMoveToLocation("xpath", "//a[@class='desktop-main'][contains(text(),'Men')]");
		MyntraKeyword.implictWait();
		MyntraKeyword.performClick("xpath","//div[@class='desktop-navLinks']//div[1]//div[1]//div[1]//div[1]//div[1]//li[1]//ul[1]//li[2]//a[1]");
	}

	@Test
	public void verifyWomenLinkAndSelect() {
		MyntraKeyword.MouseMoveToLocation("xpath", "//a[contains(text(),'Women')]");
		MyntraKeyword.implictWait();
		MyntraKeyword.performClick("xpath", "//a[contains(text(),'Kurtas & Suits')]");
	}

	@Test
	public void verifyKidsLinkAndSelect() {
		MyntraKeyword.pageLoadTimeOut();
		MyntraKeyword.MouseMoveToLocation("xpath", "//a[@class='desktop-main'][contains(text(),'Kids')]");
		MyntraKeyword.performClick("xpath", "//div[3]//div[1]//div[1]//div[1]//div[1]//li[1]//ul[1]//li[2]//a[1]");
	}

	@Test
	public void verifyHomeAndLivingSelect() {
		MyntraKeyword.MouseMoveToLocation("xpath", "//a[@class='desktop-main'][contains(text(),'Home & Living')]");
		MyntraKeyword.implictWait();
		MyntraKeyword.performClick("xpath", "//a[contains(text(),'Plants & Planters')]");
	}

	@Test
	public void verifyEssentialsAndSelect() {
		MyntraKeyword.MouseMoveToLocation("xpath", "//a[contains(text(),'Essentials')]");
		MyntraKeyword.implictWait();
		MyntraKeyword.performClick("xpath", "//a[contains(text(),'Masks')]");

	}

	@Test
	public void addToWishListMenLink() {
		MyntraKeyword.MouseMoveToLocation("xpath", "//a[@class='desktop-main'][contains(text(),'Men')]");
		MyntraKeyword.performClick("xpath",
				"//div[@class='desktop-navLinks']//div[1]//div[1]//div[1]//div[1]//div[1]//li[1]//ul[1]//li[2]//a[1]");
		MyntraKeyword.MouseMoveToLocation("xpath", "//li[2]//div[3]//span[1]");
		MyntraKeyword.performClick("xpath", "//li[2]//div[3]//span[1]");

	}

	@Test
	public void verifyMenFilterCategoriesCheckbox() {
		MyntraKeyword.MouseMoveToLocation("xpath", "//a[@class='desktop-main'][contains(text(),'Men')]");
		MyntraKeyword.performClick("xpath",
				"//div[@class='desktop-navLinks']//div[1]//div[1]//div[1]//div[1]//div[1]//li[1]//ul[1]//li[2]//a[1]");
		MyntraKeyword.performClick("xpath", "//label[contains(text(),'Lounge Tshirts')]");

	}

	@Test
	public void verifyMenFilterSelectBrand() {
		MyntraKeyword.MouseMoveToLocation("xpath", "//a[@class='desktop-main'][contains(text(),'Men')]");
		MyntraKeyword.performClick("xpath","//div[@class='desktop-navLinks']//div[1]//div[1]//div[1]//div[1]//div[1]//li[1]//ul[1]//li[2]//a[1]");
		MyntraKeyword.performClick("xpath", "//label[contains(text(),'Puma')]");

	}*/

	/*
	 * @Test
	 * public void verifyMenFilterSelectPrice() {
	 * MyntraKeyword.MouseMoveToLocation("xpath", "//a[@class='desktop-main'][contains(text(),'Men')]");
	 * MyntraKeyword.performClick("xpath","//div[@class='desktop-navLinks']//div[1]//div[1]//div[1]//div[1]//div[1]//li[1]//ul[1]//li[2]//a[1]"); 
       MyntraKeyword.pageScroll(); MyntraKeyword.performClick("xpath","//label[contains(text(),'Rs. 500 to Rs. 2900')]");
	 * MyntraKeyword.performClick("xpath",label[contains(text(),'Rs. 2902 to Rs. 5285')]"); } }
	 */
	/*@Test
	public void verifyMenFilterSelectColour() {
		MyntraKeyword.MouseMoveToLocation("xpath", "//a[@class='desktop-main'][contains(text(),'Men')]");
		MyntraKeyword.performClick("xpath",
				"//div[@class='desktop-navLinks']//div[1]//div[1]//div[1]//div[1]//div[1]//li[1]//ul[1]//li[2]//a[1]");
		MyntraKeyword.pageScroll();
		MyntraKeyword.performClick("xpath", "//label[contains(text(),'Black')]");
	}

	@Test
	public void verifyMenFilterSelectDiscount() {
		MyntraKeyword.MouseMoveToLocation("xpath", "//a[@class='desktop-main'][contains(text(),'Men')]");
		MyntraKeyword.performClick("xpath",
				"//div[@class='desktop-navLinks']//div[1]//div[1]//div[1]//div[1]//div[1]//li[1]//ul[1]//li[2]//a[1]");
		MyntraKeyword.pageScroll();
		MyntraKeyword.performClick("xpath", "//label[contains(text(),'50% and above')]");

	}
	@Test
	public void verifyWomenFilterSelectCategeories() {
        MyntraKeyword.MouseMoveToLocation("xpath", "//a[contains(text(),'Women')]");
        MyntraKeyword.performClick("xpath", "//a[contains(text(),'Kurtas & Suits')]");
        MyntraKeyword.performClick("xpath", "//label[contains(text(),'Kurtas')]");
	}
	@Test
	public void verifyWomenFilterSelectBrand() {
		 MyntraKeyword.MouseMoveToLocation("xpath", "//a[contains(text(),'Women')]");
	     MyntraKeyword.performClick("xpath", "//a[contains(text(),'Kurtas & Suits')]");
         MyntraKeyword.performClick("xpath", "//label[contains(text(),'Anouk')]");
	}
	@Test
	public void verifyWomenFilterSelectPrice() {
		 MyntraKeyword.MouseMoveToLocation("xpath", "//a[contains(text(),'Women')]");
	     MyntraKeyword.performClick("xpath", "//a[contains(text(),'Kurtas & Suits')]");
         MyntraKeyword.pageScroll();
         MyntraKeyword.performClick("xpath", "");
	}
	@Test
	 public void verifyWomenFilterSelectColour() {
		 MyntraKeyword.MouseMoveToLocation("xpath", "//a[contains(text(),'Women')]");
	     MyntraKeyword.performClick("xpath", "//a[contains(text(),'Kurtas & Suits')]");
         MyntraKeyword.pageScroll();
         MyntraKeyword.performClick("xpath", "//label[contains(text(),'Red')]");
	}
	@Test
	public void verifyWomenFilterSelectDiscount() {
		MyntraKeyword.MouseMoveToLocation("xpath", "//a[contains(text(),'Women')]");
	    MyntraKeyword.performClick("xpath", "//a[contains(text(),'Kurtas & Suits')]");
        MyntraKeyword.pageScroll();
        MyntraKeyword.performClick("xpath", "//label[contains(text(),'40% and above')]");
	

			
	}*/
	
	
	
	

}
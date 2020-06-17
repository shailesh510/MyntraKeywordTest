package com.testingshastra.pages;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Testing.Constants;
import com.Testing.MyntraKeyword;

public class menProductFilterTest {
	@BeforeTest
	public void base(){
		MyntraKeyword.openBrowser("Chrome");
		MyntraKeyword.openUrl("https://www.myntra.com/");
		MyntraKeyword.windowMaximize();
		MyntraKeyword.implictWait();
		
	}	
         @Test
		public void verifyCategeoriesCheckBoxFilter(){

        menProductFilterpage mf = PageFactory.initElements(Constants.driver, menProductFilterpage.class);
        mf.mouseHoveronMenLink();
        mf.clickOnMenproduct();
        mf.clickOnCategeoriesCheckBox();
        mf.clickOnBrandCheckBox();
        mf.pageScrollproductPage();
        mf.clickOnColourCheckBox();
		}
         
         

}

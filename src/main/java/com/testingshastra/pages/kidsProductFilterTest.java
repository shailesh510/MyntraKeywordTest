package com.testingshastra.pages;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Testing.Constants;
import com.Testing.MyntraKeyword;

public class kidsProductFilterTest {

	public class menProductFilterTest {
		/**
		 * Browser launch code
		 */
		@BeforeTest
		public void base() {
			MyntraKeyword.openBrowser("Chrome");
			MyntraKeyword.openUrl("https://www.myntra.com/");
			MyntraKeyword.windowMaximize();
			MyntraKeyword.implictWait();

		}

		/**
		 * Test Case
		 */

		@Test
		public void verifyCategeoriesFilter() {

			kidsProductFilterpage mf = PageFactory.initElements(Constants.driver, kidsProductFilterpage.class);
			mf.mouseHoveronKidsLink();
			mf.clickOnKidsproduct();
//			mf.clickOnbrandCheckbox();
//			mf.pageScrollproductPage();
//			mf.clickOnColourCategeories();
//			mf.clickOnAgefltr();
//			mf.clickOn0to6month();
//			mf.clickOnBundlesfltr();
//			mf.clickOnStyleSinglefltr();
//			mf.clickOnFebricfltr();
//			mf.clickOnCottonfltr();
//			mf.clickOnFebricTypefltr();
//			mf.clickOnDenimfltr();
//			mf.clickOnLengthfltr();
//			mf.clickOnLengthMaxifltr();
//			mf.clickOnNeckfltr();
//			mf.clickOnCowlNeck();
//			mf.clickOnOccasionfltr();
//			mf.clickOnpartyfltr();
			mf.clickOn8More();
			mf.clickOnPatternfltr();
			mf.clickOnPrintedInPattern();
			mf.clickOnPrintOrPatternType();
			mf.clickOnAbstractInPrintOrPattern();
			mf.clickOnShapefltr();
			mf.clickOnALineInShape();
			mf.clickOnSleeve_Length();
			mf.clickOnShortInSleeveLength();
			mf.clickOnSleeveStyling();
			mf.clickOnCapSleeveInSleeveStyling();
			mf.clickOnStitchFltr();
			mf.clickOnReadyTowearInStitch();
			mf.clickOnBowInSurfaceStyling();
			mf.clickOnTransparncy();
			mf.clickOnSheerInTransparency();
			mf.mouseHoverOnRecommended();
		}
	}
}

package pages.Amazon;

import org.openqa.selenium.By;

import base.Page;

public class DisplaySearchedProductsPageAmazon extends Page {
	
	public SelectedProductDetailsPageAmazon selectDesiredProduct() {
		
		Page.driver.findElement(By.partialLinkText(config.getProperty("productDetails"))).click();
		
		return new SelectedProductDetailsPageAmazon();
	}



}

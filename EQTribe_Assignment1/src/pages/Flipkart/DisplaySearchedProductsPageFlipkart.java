package pages.Flipkart;

import org.openqa.selenium.By;

import base.Page;

public class DisplaySearchedProductsPageFlipkart extends Page {

	public SelectedProductDetailsPageFlipkart selectDesiredProduct() {
		
		Page.driver.findElement(By.partialLinkText(config.getProperty("productDetailsFlipkart"))).click();
		return new SelectedProductDetailsPageFlipkart();
	}

}

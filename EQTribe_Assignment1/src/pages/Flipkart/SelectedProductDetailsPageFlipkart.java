package pages.Flipkart;

import java.util.ArrayList;

import org.openqa.selenium.By;

import base.Page;

public class SelectedProductDetailsPageFlipkart extends Page {
	
	public String extractPriceFlipkart() {
		
		String oldTab = Page.driver.getWindowHandle();
	    ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
	    newTab.remove(oldTab);
	    // change focus to new tab
	    driver.switchTo().window(newTab.get(0));
		return Page.driver.findElement(By.cssSelector(OR.getProperty("productPriceElement_Flipkart_CSS"))).getText();
	}	
}

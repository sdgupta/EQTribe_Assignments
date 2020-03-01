package pages.Amazon;

import java.util.ArrayList;

import org.openqa.selenium.By;

import base.Page;

public class SelectedProductDetailsPageAmazon extends Page {

	public String extractPriceAmazon() {
		
		String oldTab = Page.driver.getWindowHandle();
	    //driver.findElement(By.linkText("Twitter Advertising Blog")).click();
	    ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
	    newTab.remove(oldTab);
	    // change focus to new tab
	    driver.switchTo().window(newTab.get(0));
		return Page.driver.findElement(By.cssSelector(OR.getProperty("productPriceElement_Amazon_CSS"))).getText();
		
	}

}

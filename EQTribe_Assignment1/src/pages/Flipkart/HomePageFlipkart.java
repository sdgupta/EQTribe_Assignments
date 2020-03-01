package pages.Flipkart;

import org.openqa.selenium.By;
import base.Page;

public class HomePageFlipkart extends Page {
	
	public HomePageFlipkart() {
		
		super();
	}

	public void selectDeal() {
		
		//Skipping code for this method as it is beyond the scope of the assignment
	}
	
	public void validateFooters() {
		
		//Skipping code for this method as it is beyond the scope of the assignment
	}

	public DisplaySearchedProductsPageFlipkart typeInSearchBoxAndSubmit(String searchBoxlocator, String searchText, String submitBtnLocator) {
		
		
		if (Page.driver.findElement(By.cssSelector(OR.getProperty("LoginPopUp_LogInBtn_Flipkart"))).isDisplayed())
			Page.driver.findElement(By.cssSelector(OR.getProperty("LoginPopUp_XBtn_Flipkart"))).click();
		Page.type(searchBoxlocator, searchText);
		Page.click(submitBtnLocator);
		return new DisplaySearchedProductsPageFlipkart(); 
		
	}

}



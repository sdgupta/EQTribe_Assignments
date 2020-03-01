package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import base.Page;

public class HomePage extends Page {
	
	public HomePage() {
		
		super();
	}

	public void doSignUp() {
		
		//Skipping code for this method as it's beyond the scope of this assignment
	}

	public void checkProfile() {
		
		//Skipping code for this method as it's beyond the scope of this assignment
	}

	public void checkInbox() {
		
		//Skipping code for this method as it's beyond the scope of this assignment
	}
	

	public SearchResultsPage typeInSearchBoxAndSubmit(String searchBoxlocator, String searchText, String submitBtnLocator) {
		Page.goToURL("siteURL");
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath(OR.getProperty(searchBoxlocator))));
		JavascriptExecutor js=(JavascriptExecutor)Page.driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		
		
		List<WebElement> elements = driver.findElements(By.xpath(OR.getProperty(searchBoxlocator)));
		System.out.println("No of search box elems found :" + elements.size());
		//int count=1;
		for (WebElement i : elements) {
			if (i.isDisplayed() && i.isEnabled()) {
				System.out.println("Attempting to click searchbox element");
				i.click();
				i.click();
				System.out.println("Clicked search box element");
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				i.sendKeys(config.getProperty(searchText));				
				break;
			}
		}
		
		
		//Page.click(searchBoxlocator);
		//Page.type(searchBoxlocator, searchText);
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath(OR.getProperty(submitBtnLocator))));
		List<WebElement> submitBtnElems=driver.findElements(By.xpath(OR.getProperty(submitBtnLocator)));
		System.out.println("No of search submit btn elems found :" + submitBtnElems.size());
		for (WebElement i : submitBtnElems) {
			if (i.isDisplayed() && i.isEnabled()) {
				
				js.executeScript("arguments[0].click()", i);
				break;
			}
		}
		
		//js.executeScript("arguments[0].click()", driver.findElement(By.xpath(OR.getProperty(submitBtnLocator))));
		
		//Page.click(submitBtnLocator);
		return new SearchResultsPage(); 
		
	}
}

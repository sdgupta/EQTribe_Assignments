package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;

import base.Page;

public class SelectedOptionDetailsPage extends Page {
	
	public ReviewDetailsPage clickOnWriteReview() {
		
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(OR.getProperty("reviewBtn_CSS"))));
		//Page.retryingFindClick(Page.driver.findElement(By.cssSelector(OR.getProperty("reviewBtn_CSS"))));
		//Page.driver.findElement(By.cssSelector(OR.getProperty("reviewBtn_CSS"))).click();
		JavascriptExecutor js = (JavascriptExecutor)Page.driver;
		js.executeScript("arguments[0].click()",Page.driver.findElement(By.cssSelector(OR.getProperty("reviewBtn_CSS"))));
		Page.switchToNewTab();
		return new ReviewDetailsPage();
		
	}

}

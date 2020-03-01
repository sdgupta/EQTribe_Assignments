package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import base.Page;

public class ReviewDetailsPage extends Page {

	public void reviewPageActions(){
		
		Page.mouseHoverElement("overallRating_CSS");
		JavascriptExecutor js=(JavascriptExecutor)Page.driver;
		js.executeScript("document.getElementById('bubble_rating').setAttribute('class', 'ui_bubble_rating fl bubble_50')");
		//js.executeScript("arguments[0].click(), Page.driver.findElement(By.cssSelector('.ui_bubble_rating.fl.bubble_50'))");
		//Page.click("overallRating_CSS");
		Page.type("reviewTitle_CSS", "reviewTitleText");
		Page.type("detailedReview_CSS", "detailedReviewText");
		if ((Page.driver.findElement(By.cssSelector(OR.getProperty("hotelRatingsText_CSS"))).isDisplayed()) && (Page.driver.findElement(By.cssSelector(OR.getProperty("hotelRatingsText_CSS"))).getText().equals("Hotel Ratings"))) {
			//WebElement i;
			//List<WebElement> elements=Page.driver.findElements(By.cssSelector(".detailsRatings>span"));
			js.executeScript("document.querySelector('.ratingBubbleTable>div:nth-child(1)>div:nth-child(2)>div>span').setAttribute('class','answersBubbles ui_bubble_rating fl qid12 bubble_50')");
			js.executeScript("document.querySelector('.ratingBubbleTable>div:nth-child(2)>div:nth-child(2)>div>span').setAttribute('class','answersBubbles ui_bubble_rating fl qid12 bubble_50')");
			js.executeScript("document.querySelector('.ratingBubbleTable>div:nth-child(3)>div:nth-child(2)>div>span').setAttribute('class','answersBubbles ui_bubble_rating fl qid12 bubble_50')");
		}
		/*
		try {
			//Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	*/
		//Page.driver.findElement(By.xpath(OR.getProperty("submitReviewChckBox_XPATH"))).click();	
		//Page.driver.findElement(By.xpath(OR.getProperty("submitReviewChckBox_XPATH"))).click();
		js.executeScript("arguments[0].click()", driver.findElement(By.xpath(OR.getProperty("submitReviewChckBox_XPATH"))));
		
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Page.quit();
	}
}

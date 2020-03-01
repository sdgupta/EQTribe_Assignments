package pages;
import base.Page;
import org.openqa.selenium.By;

public class SearchResultsPage extends Page {

	public SelectedOptionDetailsPage selectFirstSearchResult() {
		
		Page.driver.findElements(By.cssSelector(OR.getProperty("searchedElements_CSS"))).get(0).click();
		Page.switchToNewTab();
		return new SelectedOptionDetailsPage();
	}
}

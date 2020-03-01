package testcases;

import org.testng.annotations.Test;
import pages.*;

public class PerformActionsTest {

	@Test
	public void performActionsTest(){
		
		HomePage hp = new HomePage();
		SearchResultsPage srp = hp.typeInSearchBoxAndSubmit("searchBox_XPATH", "searchDetails", "searchSubmitBtn_XPATH");
		SelectedOptionDetailsPage sodp = srp.selectFirstSearchResult();
		ReviewDetailsPage rdp = sodp.clickOnWriteReview();
		
		rdp.reviewPageActions();
		
		
	}
	
}

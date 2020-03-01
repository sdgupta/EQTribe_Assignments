package pages.Amazon;

import base.Page;

public class HomePageAmazon extends Page {
	
	public HomePageAmazon() {
		
		super();
	}

	public void selectDeal() {
		
		//Skipping code for this method as it is beyond the scope of the assignment
	}
	
	public void validateFooters() {
		
		//Skipping code for this method as it is beyond the scope of the assignment
	}

	public DisplaySearchedProductsPageAmazon typeInSearchBoxAndSubmit(String searchBoxlocator, String searchText, String submitBtnLocator) {
		
		Page.type(searchBoxlocator, searchText);
		Page.click(submitBtnLocator);
		return new DisplaySearchedProductsPageAmazon(); 
		
	}

}



package testcases;
import pages.Amazon.*;
import pages.Flipkart.*;

import base.Page;
public class ComparePrice {
	
	double priceAmazon;
	double priceFlipkart;
	public ComparePrice(double priceAmazon, double priceFlipkart) {
		
		this.priceAmazon=priceAmazon;
		this.priceFlipkart=priceFlipkart;
	}

	
	public void comparePriceTest() {
		
		displayLowerPrice();
		//Assert.fail();
	}

	public static double getFlipkartPrice() {
		
		HomePageFlipkart hpA = new HomePageFlipkart();
		Page.goToURL("siteURL_Flipkart");
		DisplaySearchedProductsPageFlipkart dspA = hpA.typeInSearchBoxAndSubmit("searchBox_Flipkart_CSS", "productDetails", "searchSubmitBtn_Flipkart_CSS");
		SelectedProductDetailsPageFlipkart spdA = dspA.selectDesiredProduct();
		String FlipkartPrice=spdA.extractPriceFlipkart();
		Page.quit();
		return Double.parseDouble(FlipkartPrice.substring(1).substring(0,2).concat(FlipkartPrice.substring(1).substring(3)));		
	}

	public static double getAmazonPrice() {
		
		HomePageAmazon hpA = new HomePageAmazon();
		Page.goToURL("siteURL_Amazon");
		DisplaySearchedProductsPageAmazon dspA = hpA.typeInSearchBoxAndSubmit("searchBox_Amazon_CSS", "productDetails", "searchSubmitBtn_Amazon_CSS");
		SelectedProductDetailsPageAmazon spdA = dspA.selectDesiredProduct();
		String AmazonPrice=spdA.extractPriceAmazon();
		Page.quit();
		Page.driver=null;
		
		return Double.parseDouble(AmazonPrice.substring(2).substring(0,2).concat(AmazonPrice.substring(2).substring(3)));		
	}

	public void displayLowerPrice() {
		
		System.out.println("Product price on Amazon is Rs." + priceAmazon);
		System.out.println("Product price on Flipkart is Rs." + priceFlipkart);
		if (priceAmazon < priceFlipkart)
			System.out.println("Price on Amazon for the given product is cheaper than that on Flipkart");
		else if (priceAmazon > priceFlipkart)
			System.out.println("Price on Flipkart for the given product is cheaper than that on Amazon");
		else
			System.out.println("Price of the product is same on Flipkart and Amazon");
	}

	/*public static void main(String[] args) {
		
		ComparePriceTest test=new ComparePriceTest(ComparePriceTest.getAmazonPrice(), ComparePriceTest.getFlipkartPrice());
		test.comparePriceTest();
	}*/
}






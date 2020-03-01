package testcases;

import org.testng.annotations.Test;

public class ComparePriceTest {

  @Test
  public void comparePriceTest() {
    //throw new RuntimeException("Test not implemented");
	  ComparePrice test=new ComparePrice(ComparePrice.getAmazonPrice(), ComparePrice.getFlipkartPrice());
	  test.displayLowerPrice();
  }
}

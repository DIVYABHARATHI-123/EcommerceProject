package Ecommerce;

import static org.testng.Assert.assertTrue;

import org.junit.jupiter.api.Test;

public class HomePageTest extends BaseTest {
	
	   private final String baseURL = "https://www.bestbuy.com/";

	    @Test
	    public void testHomePageLoadsSuccessfully() {
	        driver.get(baseURL);
	        String pageTitle = driver.getTitle();
	        assertTrue(pageTitle.contains("Best Buy"));
	    }
	}



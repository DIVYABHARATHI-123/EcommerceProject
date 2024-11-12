package Ecommerce;

import static org.testng.Assert.assertTrue;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MenuNavigationTest {

	private WebDriver driver;
	
	  @Test
	    public void testMenuNavigation() {
	        driver.get("https://www.bestbuy.com/");
	        driver.findElement(By.linkText("Shop by Department")).click();
	        // Validate each sub-menu page
	        assertTrue(driver.getTitle().contains("Shop by Department"));
	    }
	}


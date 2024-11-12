package Ecommerce;

import static org.testng.Assert.assertTrue;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class CartTest extends BaseTest {
	
	  @Test
	    public void testAddToCart() {
	        driver.get("https://www.bestbuy.com/");
	        driver.findElement(By.id("search-field")).sendKeys("Laptop");
	        driver.findElement(By.id("search-button")).click();
	        driver.findElement(By.cssSelector("add-to-cart-button")).click();
	        assertTrue(driver.findElement(By.id("cart")).isDisplayed());
	    }
	}


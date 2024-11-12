package Ecommerce;

import static org.testng.Assert.assertTrue;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;



public class CheckoutTest extends BaseTest {
	
	   @Test
	    public void testCheckoutWithDummyPayment() {
	        // Navigate through adding a product to cart
	        driver.get("https://www.bestbuy.com/");
	        driver.findElement(By.id("search-field")).sendKeys("Laptop");
	        driver.findElement(By.id("search-button")).click();
	        driver.findElement(By.cssSelector("add-to-cart-button")).click();
	        
	        // Proceed to checkout
	        driver.findElement(By.id("checkout")).click();
	        
	        // Fill out payment form (add dummy details as placeholder)
	        driver.findElement(By.id("creditCardNumber")).sendKeys("5111111111111111");
	        driver.findElement(By.id("expirationDate")).sendKeys("12/25");
	        driver.findElement(By.id("cvv")).sendKeys("123");
	        driver.findElement(By.id("placeOrder")).click();
	        
	        // Assert order success message
	        assertTrue(driver.findElement(By.cssSelector("order-confirmation")).isDisplayed());
	   }

// Take Screenshots on Failure
	 
public void takeScreenshot(String testName) {
    File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
    try {
        FileUtils.copyFile(srcFile, new File("screenshots/" + testName + ".png"));
    } catch (IOException e) {
        e.printStackTrace();
    }

}

}
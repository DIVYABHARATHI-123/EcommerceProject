package Ecommerce;

import static org.testng.Assert.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BottomLinksTest extends BaseTest {
	
	   @Test
	    public void validateBottomLinks() {
	        driver.get("https://www.bestbuy.com/");
	        List<WebElement> bottomLinks = driver.findElements(By.cssSelector("footer a"));
	        for (WebElement link : bottomLinks) {
	            String href = link.getAttribute("href");
	            driver.get(href);
	            assertTrue(!driver.getTitle().contains("404"));
	        }
	    }
	}


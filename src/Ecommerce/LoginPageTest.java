package Ecommerce;


import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageTest extends BaseTest {

	 private WebDriver driver;

	    private By signUpLink = By.id("someSignUpLinkID");
	    private By emailField = By.id("email");
	    private By passwordField = By.id("password");
	    private By loginButton = By.id("loginButton");

	    public void LoginPage(WebDriver driver) {
	        this.driver = driver;
	    }

	    public void openSignUp() {
	        driver.findElement(signUpLink).click();
	    }

	    public void login(String email, String password) {
	        driver.findElement(emailField).sendKeys("dbharathi11997@gmail.com");
	        driver.findElement(passwordField).sendKeys("Ziya@1000");
	        driver.findElement(loginButton).click();
	    }
	

@Test
public void testLogin() {
    driver.get("https://www.bestbuy.com/");
    LoginPageTest loginPage = new LoginPageTest();
    loginPage.login("test@example.com", "testPassword123");
    // Assert login success with element that appears post-login
}

}
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
    //Locate form authentication page

    //locate username input field
    //locate password input field
    //locate submit button

    private By formAuthenticationLink = By.linkText("Form Authentication");

    public LoginPage clickFormAuthenticationLink() {
        driver.findElement(formAuthenticationLink).click();
        return new LoginPage(driver);
    }
}

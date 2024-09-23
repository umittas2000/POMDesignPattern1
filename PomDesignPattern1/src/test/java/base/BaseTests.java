package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;

public class BaseTests {
    private WebDriver driver;
    protected HomePage homePage;

    public void setUp(){
        driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/");

        homePage = new HomePage(driver);
    }

    public static void main(String[] args) {
        BaseTests test = new BaseTests();
        test.setUp();

    }
}

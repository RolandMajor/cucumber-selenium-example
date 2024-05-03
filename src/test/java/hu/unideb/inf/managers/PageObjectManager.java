package hu.unideb.inf.managers;

import hu.unideb.inf.HomePage;
import org.openqa.selenium.WebDriver;

public class PageObjectManager {
    private final WebDriver driver;

    private HomePage homePage;

    public PageObjectManager(WebDriver driver) {
        this.driver = driver;
    }

    public HomePage getHomePage() {
        if (homePage == null) {
            homePage = new HomePage(driver);
        }
        return homePage;
    }

}

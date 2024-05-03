package hu.unideb.inf;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;


import java.time.Duration;

public abstract class AbstractStepDefs {

    protected static HomePage homePage;

    public AbstractStepDefs(TestContext testContext) {
        homePage = testContext.getPageObjectManager().getHomePage();
    }
}

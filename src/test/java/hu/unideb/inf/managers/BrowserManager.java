package hu.unideb.inf.managers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class BrowserManager {

    private static final int WAIT_TIME = 10;

    public WebDriver getDefaultDriver() {
        WebDriverManager.getInstance().setup();
        WebDriver driver = WebDriverManager.getInstance().create();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(WAIT_TIME));
        return driver;
    }

    public WebDriver getChromeDriver() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(WAIT_TIME));
        return driver;
    }

    public WebDriver getFirefoxDriver() {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(WAIT_TIME));
        return driver;
    }

    public WebDriver getEdgeDriver() {
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(WAIT_TIME));
        return driver;
    }

}

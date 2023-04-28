package hu.unideb.inf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.HashMap;
import java.util.Map;

public class HomePage {

    private static final String PAGE_URL = "https://www.saucedemo.com/";

    private final WebDriver driver;

    @FindBy(css = "#login_button_container > div > form > div.error-message-container.error > h3")
    private WebElement errorMessage;
    @FindBy(css = "#checkout_summary_container > div > div.summary_info > div.summary_info_label.summary_total_label")
    private WebElement priceLabel;

    private static final Map<String, By> textFields = new HashMap<String, By>() {{
       put("Username", By.id("user-name"));
       put("Password", By.id("password"));
       put("First Name", By.id("first-name"));
       put("Last Name", By.id("last-name"));
       put("Zip Code", By.id("postal-code"));
    }};

    private static final Map<String, By> itemButtons = new HashMap<String, By>() {{
       put("Sauce Labs Backpack", By.id("add-to-cart-sauce-labs-backpack"));
       put("Sauce Labs Bike Light", By.id("add-to-cart-sauce-labs-bike-light"));
       put("Sauce Labs Bolt T-Shirt", By.id("add-to-cart-sauce-labs-bolt-t-shirt"));
       put("Sauce Labs Fleece Jacket", By.id("add-to-cart-sauce-labs-fleece-jacket"));
       put("Sauce Labs Onesie", By.id("add-to-cart-sauce-labs-onesie"));
       put("Test.allTheThings() T-Shirt (Red)", By.id("add-to-cart-test.allthethings()-t-shirt-(red)"));
    }};

    private static final Map<String, By> navigationButtons = new HashMap<String, By>() {{
        put("Login", By.id("login-button"));
        put("Cart", By.className("shopping_cart_link"));
        put("Checkout", By.id("checkout"));
        put("Continue", By.id("continue"));
    }};

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void openPage() {
        driver.get(PAGE_URL);
        PageFactory.initElements(driver, this);
    }

    public void closePage() {
        driver.quit();
    }

    public void fillOutField(String field, String text) {
        driver.findElement(textFields.get(field)).sendKeys(text);
    }

    public void clickButton(String button) {
        driver.findElement(navigationButtons.get(button)).click();
    }

    public String getErrorMessage() {
        return errorMessage.getText();
    }

    public void addItemToCart(String item) {
        driver.findElement(itemButtons.get(item)).click();
    }

    public String getTotal() {
        return priceLabel.getText();
    }

}
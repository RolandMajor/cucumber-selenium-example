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

    @FindBy(id = "user-name")
    private WebElement usernameField;
    @FindBy(id = "password")
    private WebElement passwordField;
    @FindBy(id = "login-button")
    private WebElement loginButton;
    @FindBy(css = "#login_button_container > div > form > div.error-message-container.error > h3")
    private WebElement errorMessage;
    @FindBy(className = "shopping_cart_link")
    private WebElement cart;
    @FindBy(id = "checkout")
    private WebElement checkoutButton;
    @FindBy(id = "first-name")
    private WebElement firstnameField;
    @FindBy(id = "last-name")
    private WebElement lastnameField;
    @FindBy(id = "postal-code")
    private WebElement zipcodeField;
    @FindBy(id = "continue")
    private WebElement continueButton;
    @FindBy(css = "#checkout_summary_container > div > div.summary_info > div.summary_info_label.summary_total_label")
    private WebElement priceLabel;

    private static final Map<String, By> itemButtons = new HashMap<String, By>() {{
       put("Sauce Labs Backpack", By.id("add-to-cart-sauce-labs-backpack"));
       put("Sauce Labs Bike Light", By.id("add-to-cart-sauce-labs-bike-light"));
       put("Sauce Labs Bolt T-Shirt", By.id("add-to-cart-sauce-labs-bolt-t-shirt"));
       put("Sauce Labs Fleece Jacket", By.id("add-to-cart-sauce-labs-fleece-jacket"));
       put("Sauce Labs Onesie", By.id("add-to-cart-sauce-labs-onesie"));
       put("Test.allTheThings() T-Shirt (Red)", By.id("add-to-cart-test.allthethings()-t-shirt-(red)"));
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

    public void fillOutUserName(String username) {
        usernameField.sendKeys(username);
    }

    public void fillOutPassword(String password) {
        passwordField.sendKeys(password);
    }

    public void clickLoginButton() {
        loginButton.click();
    }

    public String getErrorMessage() {
        return errorMessage.getText();
    }

    public void addItemToCart(String item) {
        driver.findElement(itemButtons.get(item)).click();
    }

    public void clickCart() {
        cart.click();
    }

    public void clickCheckoutButton() {
        checkoutButton.click();
    }

    public void fillOutFirstName(String firstname) {
        firstnameField.sendKeys(firstname);
    }

    public void fillOutLastName(String lastname) {
        lastnameField.sendKeys(lastname);
    }

    public void fillOutZipCode(String zipcode) {
        zipcodeField.sendKeys(zipcode);
    }

    public void clickContinue() {
        continueButton.click();
    }

    public String getTotal() {
        return priceLabel.getText();
    }

}

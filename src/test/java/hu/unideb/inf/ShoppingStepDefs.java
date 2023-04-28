package hu.unideb.inf;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShoppingStepDefs extends AbstractStepDefs {

    @Given("the {string} is added to the cart")
    public void somethingIsAddedToTheCart(String item) {
        homePage.addItemToCart(item);
    }

    @And("the Cart is clicked")
    public void theCartIsClicked() {
        homePage.clickCart();
    }

    @And("the Checkout button is clicked")
    public void theCheckoutButtonIsClicked() {
        homePage.clickCheckoutButton();
    }

    @And("the First Name field is filled with {string}")
    public void theFirstNameFieldIsFilledWith(String firstName) {
        homePage.fillOutFirstName(firstName);
    }

    @And("the Last Name field is filled with {string}")
    public void theLastNameFieldIsFilledWith(String lastName) {
        homePage.fillOutLastName(lastName);
    }

    @And("the Zip Code field is filled with {string}")
    public void theZipCodeFieldIsFilledWith(String zip) {
        homePage.fillOutZipCode(zip);
    }

    @When("the Continue button is clicked")
    public void theContinueButtonIsClicked() {
        homePage.clickContinue();
    }

    @Then("the price should read {string}")
    public void thePriceShouldRead(String total) {
        assertEquals(total, homePage.getTotal());
    }
}

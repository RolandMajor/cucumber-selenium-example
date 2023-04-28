package hu.unideb.inf;

import io.cucumber.java.AfterAll;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class CommonStepDefs extends AbstractStepDefs {

    @Given("the home page is opened")
    public void theHomePageIsOpened() {
        homePage.openPage();
    }

    @Given("the Username field is filled with {string}")
    public void theUsernameFieldIsFilledWithUsername(String username) {
        homePage.fillOutUserName(username);
    }

    @And("the Password field is filled with {string}")
    public void thePasswordFieldIsFilledWithPassword(String password) {
        homePage.fillOutPassword(password);
    }

    @When("the Login button is clicked")
    public void theLoginButtonIsClicked() {
        homePage.clickLoginButton();
    }

    @AfterAll
    public static void tearDown() {
        homePage.closePage();
    }
}

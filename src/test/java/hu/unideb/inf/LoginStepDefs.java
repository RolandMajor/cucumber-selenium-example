package hu.unideb.inf;

import io.cucumber.java.en.Then;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoginStepDefs extends AbstractStepDefs {

    public LoginStepDefs(TestContext testContext) {
        super(testContext);
    }

    @Then("the {string} message is shown")
    public void theErrorMessageMessageIsShown(String errorMessage) {
        assertEquals(errorMessage, homePage.getErrorMessage());
    }
}

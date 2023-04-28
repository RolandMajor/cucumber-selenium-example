package hu.unideb.inf;

import io.cucumber.java.en.Given;

public class CommonStepDefs extends AbstractStepDefs {

    @Given("the home page is opened")
    public void theHomePageIsOpened() {
        homePage.openPage();
    }
}

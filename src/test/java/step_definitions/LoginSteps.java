package step_definitions;

import context.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;

public class LoginSteps {

    TestContext context;

    public LoginSteps(TestContext testContext) {
        context = testContext;
        context.setDriver();
    }

    @Given("I am on the login page")
    public void iAmOnTheLoginPage() {
        HomePage homePage = new HomePage();
        homePage.open();
    }

    @When("Submitting credentials")
    public void submittingCredentials() {
        System.out.println("Test Step");
    }

    @Then("I can see the Products page")
    public void iCanSeeTheProductsPage() {
        System.out.println("Test Step");
    }

    @And("Using credentials")
    public void usingCredentials() {
        System.out.println("Test Step");
    }
}
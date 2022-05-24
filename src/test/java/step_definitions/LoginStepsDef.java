package step_definitions;

import context.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.PageObjectManager;

public class LoginStepsDef {

    TestContext context;
    PageObjectManager pom;

    public LoginStepsDef(TestContext testContext) {
        pom = testContext.getPageObjectManager();
        context = testContext;
    }

    @Given("I am on the login page")
    public void iAmOnTheLoginPage() {
        pom.getHomePO().open();
    }

    @And("Using credentials")
    public void usingCredentials() {
        pom.getHomePO().enterCredentials();
    }

    @When("Submitting credentials")
    public void submittingCredentials() {
        pom.getHomePO().submitCredentials();
    }

    @Then("I am on the Products page")
    public void iCanSeeTheProductsPage() {
        pom.getHomePO().verifyOnProductsPage();
    }

    @And("Using credentials {string} and {string}")
    public void usingCredentials(String username, String password) {
        pom.getHomePO().enterCredentials(username, password);
    }

    @Given("I am logged in")
    public void iAmLoggedIn() {
        iAmOnTheLoginPage();
        usingCredentials();
        submittingCredentials();
    }
}
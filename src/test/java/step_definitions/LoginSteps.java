package step_definitions;

import context.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import pages.PageObjectManager;

public class LoginSteps {

    TestContext context;
    PageObjectManager pom;

    public LoginSteps(TestContext testContext) {
        context = testContext;
        pom = context.getPageObjectManager();
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

    @Then("I can see the Products page")
    public void iCanSeeTheProductsPage() {
        pom.getHomePO().verifyOnProductsPage();
    }

    @And("Using credentials {string} and {string}")
    public void usingCredentialsUsernameAndPassword(String user, String pass) {
        pom.getHomePO().enterCredentials(user, pass);
    }
}
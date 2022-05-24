package step_definitions;

import context.TestContext;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CartPage;
import pages.ProductsPage;

public class CartStepsDef {

    TestContext context;
    CartPage cartPage;


    public CartStepsDef(TestContext testContext) {
        context = testContext;
        cartPage = testContext.getPageObjectManager().getCartPO();
    }

    @Then("I am directed to my shopping cart page")
    public void iAmDirectedToMyShoppingCartPage() {
        cartPage.waitForCartPage();
    }
}
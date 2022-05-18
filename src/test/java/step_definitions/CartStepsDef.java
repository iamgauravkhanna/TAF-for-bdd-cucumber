package step_definitions;

import context.TestContext;
import io.cucumber.java.en.When;
import pages.ProductsPage;

public class CartStepsDef {

    TestContext context;
    ProductsPage productsPage;

    public CartStepsDef(TestContext testContext) {
        context = testContext;
    }

    @When("I click the shopping cart icon")
    public void iClickTheShoppingCartIcon() {
        productsPage = context.getPageObjectManager().getProductsPO();
        productsPage.clickCartIcon();
    }
}

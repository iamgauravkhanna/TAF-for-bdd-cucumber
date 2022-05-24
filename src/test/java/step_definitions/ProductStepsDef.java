package step_definitions;

import context.TestContext;
import io.cucumber.java.en.When;
import pages.PageObjectManager;
import pages.ProductsPage;

public class ProductStepsDef {

    TestContext context;
    ProductsPage productsPage;

    public ProductStepsDef(TestContext testContext) {
        context = testContext;
        productsPage = testContext.getPageObjectManager().getProductsPO();
    }

    @When("I click the shopping cart icon")
    public void iClickTheShoppingCartIcon() {
        productsPage.clickCartIcon();
    }

    @When("I select the sorting dropdown by lowest to highest price")
    public void iSelectTheSortingDropdown() {
        productsPage.selectLowToHigh();
    }
}
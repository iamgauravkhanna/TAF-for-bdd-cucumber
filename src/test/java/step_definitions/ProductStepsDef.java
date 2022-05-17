package step_definitions;

import context.TestContext;
import io.cucumber.java.en.When;
import pages.PageObjectManager;

public class ProductStepsDef {

    TestContext context;
    PageObjectManager pom;

    public ProductStepsDef(TestContext testContext) {
        context = testContext;
        pom = context.getPageObjectManager();
    }

    @When("I select the sorting dropdown by lowest to highest price")
    public void iSelectTheSortingDropdown() {
        pom.getProductsPO().selectLowToHigh();
    }
}

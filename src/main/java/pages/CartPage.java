package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage {

    @FindBy(xpath = "//span[text()='Your Cart']")
    private WebElement cartHeading;

    public void waitForCartPage() {
        waitForElementVisibility(cartHeading);
        pause();
        assertElementIsPresent(cartHeading);
    }
}
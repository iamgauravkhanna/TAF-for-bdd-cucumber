package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsPage extends BasePage {

    @FindBy(className = "product_sort_container")
    private WebElement dropDown;

    @FindBy(xpath = "//a[@class='shopping_cart_link']")
    private WebElement cartIcon;

    @FindBy(xpath = "//span[text()='Your Cart']")
    private WebElement cartHeading;

    public void selectLowToHigh() {
        pause();
        selectByValue(dropDown, "lohi");
        pause();
    }

    public void clickCartIcon() {
        click(cartIcon);
        waitForElementVisibility(cartHeading);
        pause();
        assertElementIsPresent(cartHeading);
    }
}

package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsPage extends BasePage {

    @FindBy(className = "product_sort_container")
    private WebElement dropDown;

    public void selectLowToHigh() {
        pause();
        selectByValue(dropDown,"lohi");
        pause();
    }
}

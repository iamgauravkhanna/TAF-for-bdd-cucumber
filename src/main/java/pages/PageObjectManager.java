package pages;

import logger.TestLogger;
import org.openqa.selenium.WebDriver;

public class PageObjectManager {

    private HomePage homePage;
    private ProductsPage productsPage;
    private CartPage cartPage;

    public HomePage getHomePO() {
        return (homePage == null) ? homePage = new HomePage() : homePage;
    }

    public ProductsPage getProductsPO() {
        return (productsPage == null) ? productsPage = new ProductsPage() : productsPage;
    }

    public CartPage getCartPO() {
        return (cartPage == null) ? cartPage = new CartPage() : cartPage;
    }
}
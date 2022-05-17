package pages;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {

    private HomePage homePage;
    private ProductsPage productsPage;

    public HomePage getHomePO() {
        return (homePage == null) ? homePage = new HomePage() : homePage;
    }

    public ProductsPage getProductsPO() {
        return (productsPage == null) ? productsPage = new ProductsPage() : productsPage;
    }
}
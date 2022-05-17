package pages;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
    private WebDriver driver;
    private HomePage homePage;

    public HomePage getHomePO() {
        return (homePage == null) ? homePage = new HomePage() : homePage;
    }
}
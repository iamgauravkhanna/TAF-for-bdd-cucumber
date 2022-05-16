package pages;

public class HomePage extends BasePage {

    public void open() {
        webDriver.get("https://www.saucedemo.com/");
    }
}

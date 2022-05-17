package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(id = "user-name")
    private WebElement username;

    @FindBy(id = "password")
    private WebElement password;

    @FindBy(id = "login-button")
    private WebElement loginBtn;

    public void open() {
        webDriver.get("https://www.saucedemo.com/");
    }

    public void enterCredentials() {
        sendKeys(username, "standard_user");
        pause();
        sendKeys(password, "secret_sauce");
        pause();
    }

    public void enterCredentials(String user, String pass) {
        sendKeys(username, user);
        pause();
        sendKeys(password, pass);
        pause();
    }

    public void submitCredentials() {
        loginBtn.click();
        pause();
    }

    public void verifyOnProductsPage() {
        waitForElementVisibility(findElement(By.xpath("//*[text()='Products']")));
    }
}
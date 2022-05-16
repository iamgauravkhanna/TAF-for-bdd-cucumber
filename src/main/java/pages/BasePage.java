package pages;

import driver.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static constants.TestConstants.EXPLICIT_WAIT;

public class BasePage {

    protected WebDriver webDriver;
    protected WebDriverWait webDriverWait;

    public BasePage() {
        webDriver = DriverManager.getDriver();
        PageFactory.initElements(webDriver, this);
        webDriverWait = new WebDriverWait(webDriver, Duration.ofSeconds(EXPLICIT_WAIT));
    }
}

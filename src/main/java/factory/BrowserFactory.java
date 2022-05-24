package factory;

import io.github.bonigarcia.wdm.WebDriverManager;
import logger.TestLogger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;

import static constants.TestConstants.*;

public class BrowserFactory {

    public static WebDriver createDriverInstance(String browser) {

        WebDriver webDriver = null;

        if (System.getProperty("executionEnvironment").equalsIgnoreCase("local")) {
            switch (browser) {
                case BROWSER_CHROME: {
                    TestLogger.INFO("Creating Chrome Browser Instance");
                    WebDriverManager.chromedriver().setup();
                    webDriver = new ChromeDriver();
                    break;
                }
                case BROWSER_FIREFOX: {
                    TestLogger.INFO("Creating Firefox Browser Instance");
                    WebDriverManager.firefoxdriver().setup();
                    webDriver = new FirefoxDriver();
                    break;
                }
                case BROWSER_SAFARI: {
                    webDriver = new SafariDriver();
                    break;
                }
                case BROWSER_EDGE: {
                    WebDriverManager.edgedriver().setup();
                    webDriver = new EdgeDriver();
                    break;
                }
                case BROWSER_OPERA: {
                    WebDriverManager.operadriver().setup();
                    webDriver = new OperaDriver();
                    break;
                }
                default:
                    throw new IllegalStateException("INVALID BROWSER: " + browser);
            }
        }
        webDriver.manage().window().maximize();
        TestLogger.INFO("Returning new Driver with ID : " + webDriver.hashCode());
        return webDriver;
    }
}
package context;

import driver.DriverManager;
import logger.TestLogger;
import org.testng.annotations.Test;
import pages.PageObjectManager;

public class TestContext {

    private PageObjectManager pageObjectManager;

    public TestContext() {
        TestLogger.INFO("TestContext Constructor Called");
        pageObjectManager = new PageObjectManager();
    }

    public PageObjectManager getPageObjectManager() {
        TestLogger.INFO("pageObjectManager ID : " + pageObjectManager.hashCode());
        return pageObjectManager;
    }
}

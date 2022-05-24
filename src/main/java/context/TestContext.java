package context;

import logger.TestLogger;
import pages.PageObjectManager;

public class TestContext {

    private PageObjectManager pageObjectManager;
    private String myString;

    public TestContext() {
        TestLogger.INFO("TestContext Constructor Called");
        pageObjectManager = new PageObjectManager();
    }

    public PageObjectManager getPageObjectManager() {
        TestLogger.INFO("pageObjectManager ID : " + pageObjectManager.hashCode());
        return pageObjectManager;
    }

    public void setString(String a) {
        myString = a;
    }

    public void printString() {
        TestLogger.INFO("printString : " + myString);
    }

}

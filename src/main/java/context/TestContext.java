package context;

import driver.DriverManager;
import logger.TestLogger;

public class TestContext {

    public TestContext() {
        TestLogger.INFO("TestContext Constructor Called");
    }

    public void setDriver(){
        DriverManager.setDriver("chrome");
    }

}

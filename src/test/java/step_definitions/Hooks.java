package step_definitions;

import driver.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import logger.TestLogger;

public class Hooks {

    @Before
    public void beforeScenario(Scenario scenario) {
        TestLogger.INFO("This will run before the Scenario = " + scenario.getName());
        DriverManager.setDriver("chrome");
    }

    @After
    public void afterScenario(Scenario scenario) {
        TestLogger.INFO("This will run after the Scenario = " + scenario.getName());
        DriverManager.getDriver().quit();
    }
}

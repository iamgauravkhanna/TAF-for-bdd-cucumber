package step_definitions;

import driver.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import logger.TestLogger;

public class Hooks {

    @Before
    public void beforeScenario(Scenario scenario) {
        TestLogger.INFO_STEP("Scenario Started : " + scenario.getName());
        DriverManager.setDriver(System.getProperty("browser"));
    }

    @After
    public void afterScenario(Scenario scenario) {
        TestLogger.INFO_STEP("Scenario Finished : " + scenario.getName());
        DriverManager.getDriver().quit();
    }
}

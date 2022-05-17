package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(value = Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:target/cucumber.html", "junit:target/cucumber.xml"},
        features = "src/test/resources/features",
        glue = {"step_definitions"}
)
public class CucumberTestRunner {
}
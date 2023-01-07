package cucumberDemo.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(publish = true,plugin = "pretty",features = "src/test/resources/cucumberDemo/features/is_it_friday_yet.feature",glue = "cucumberDemo.stepdefs")
public class RunFridayTest {
}

package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\DELL\\eclipse-workspace\\Cucumber\\src\\test\\resources\\features\\orangehrmlogin.feature",
glue= "StepsDefinition"
)


public class RunnerClass {

}

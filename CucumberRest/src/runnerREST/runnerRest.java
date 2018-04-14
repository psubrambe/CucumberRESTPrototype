package runnerREST;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "features"
		,glue={"stepsDefinition"}
		)

public class runnerRest {

}
package pl.edu.agh.guitests.bdd.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features",
		glue = { "pl.edu.agh.guitests.bdd.steps" },
		dryRun = false)
public class RunCucumberTests {
}

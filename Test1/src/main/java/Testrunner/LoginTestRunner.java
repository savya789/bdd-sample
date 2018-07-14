package Testrunner;



import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "/Users/praveengaddam/bdd-sample/Test1/src/main/java/Features/freecrmlogin.feature", //the path of the feature files
        glue={"StepDefinition"},
        format= {"pretty","html:test-outout", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"}, //to generate different types of reporting
        monochrome = true,
        strict = true,
        dryRun = false
)

public class LoginTestRunner {
}

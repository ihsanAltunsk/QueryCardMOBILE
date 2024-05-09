package Runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty",
                "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
                "junit:target/xml-report/cucumber.xml",
                "rerun:target/failedRerun.txt"},
        features = "src/test/resources/features",

        glue = {"stepdefinitions" , "hooks"},
        tags = "@smoke" ,
        dryRun = false
)
public class Runner {
}

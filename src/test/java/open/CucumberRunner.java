package open;

import io.cucumber.testng.*;

@CucumberOptions(
        plugin = {"io.qameta.allure.cucumber6jvm.AllureCucumber6Jvm",
                  "pretty", "json:target/cucumber-report/report.json"},
        features = "src/test/java/open/features",
        glue = "open.steps",
        tags = "@regressTests"
)
public class CucumberRunner extends AbstractTestNGCucumberTests {
}

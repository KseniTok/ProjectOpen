package open;

import io.cucumber.testng.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@CucumberOptions(
        plugin = {"io.qameta.allure.cucumber6jvm.AllureCucumber6Jvm",
                "pretty", "json:target/cucumber-report/report.json"},
        features = "src/test/java/open/features",
        glue = {"open.steps"}
)
public class CucumberRunner extends AbstractTestNGCucumberTests {
//    private TestNGCucumberRunner testNGCucumberRunner;
//
//    @BeforeClass(alwaysRun = true)
//    public void beforeClass() {
//        testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
//    }
//
//    @Test(groups = "cucumber", description = "Runs Cucumber Scenarios", dataProvider = "scenarios")
//    public void scenario(PickleWrapper pickle, FeatureWrapper cucumberFeature) {
//        testNGCucumberRunner.runScenario(pickle.getPickle());
//    }
//    @DataProvider
//    public Object[][] scenarios() {
//        return testNGCucumberRunner.provideScenarios();
//    }
//
//    @AfterClass(alwaysRun = true)
//    public void afterClass() {
//        testNGCucumberRunner.finish();
//    }
}

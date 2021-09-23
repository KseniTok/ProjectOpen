package open.steps;

import driver.WebDriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
    @Before
    public void before() {
        WebDriverManager.initChrome();
    }

    @After
    public void after() {
        WebDriverManager.getCurrentDriver().quit();
    }
}

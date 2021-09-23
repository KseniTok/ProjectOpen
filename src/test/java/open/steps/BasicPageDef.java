package open.steps;

import driver.WebDriverManager;
import io.cucumber.java.en.When;


public class BasicPageDef {
    @When("^перейти на сайт '(.*)'$")
    public void перейтиНаСайт(String url) {
        WebDriverManager.getCurrentDriver().get(url);
    }
}

package steps;

import driver.WebDriverManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BasicPageDef {
    @Given("открыть браузер")
    public void открытьБраузер() {
        WebDriverManager.initChrome();
    }

    @Then("закрыть браузер")
    public void закрытьБраузер() {
        WebDriverManager.getCurrentDriver().quit();
    }

    @When("перейти на сайт {string}")
    public void перейтиНаСайт(String arg0) {
        WebDriverManager.getCurrentDriver().get(arg0);
    }
}

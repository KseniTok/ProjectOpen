package open.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.GooglePage;

public class GooglePageDef {
    GooglePage googlePage;

    @And("^выполнить поиск (.*)$")
    public void выполнитьПоиск(String text) {
        googlePage = new GooglePage();
        googlePage.getSearchField().sendKeys(text);
        googlePage.getSearchButton().click();
    }

    @Then("^проверить, что  в результатах поиска есть (.*)$")
    public void проверитьЧтоВРезультатахПоискаЕсть(String text) {
        Assert.assertTrue(googlePage.getResultSearch().stream().anyMatch(x -> x.getText().contains(text)), "В результатах поиска нет: " + text);
    }
}

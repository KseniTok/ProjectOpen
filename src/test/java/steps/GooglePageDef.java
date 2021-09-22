package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.GooglePage;

public class GooglePageDef {
    GooglePage googlePage;

    @And("выполнить поиск {string}")
    public void выполнитьПоиск(String arg0) {
        googlePage = new GooglePage();
        googlePage.getSearchField().sendKeys(arg0);
        googlePage.getSearchButton().click();
    }

    @Then("проверить, что  в результатах поиска есть {string}")
    public void проверитьЧтоВРезультатахПоискаЕсть(String arg0) {
        Assert.assertTrue(googlePage.getResultSearch().stream().anyMatch(x -> x.getText().contains(arg0)));
    }
}

package steps;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.OpenPage;

import java.util.List;

public class OpenPageDef {
    @Then("проверить в блоке «Курс обмена в интернет-банке», что курс продажи больше курса покупки, для USD и для EUR")
    public void проверитьВБлокеКурсОбменаВИнтернетБанкеЧтоКурсПродажиБольшеКурсаПокупкиДляUSDИДляEUR() {
        OpenPage openPage = new OpenPage();
        List<WebElement> exchangeRates = openPage.getExchangeRates();
        Assert.assertTrue(Double.parseDouble(exchangeRates.get(0).getText().replace(",", ".")) < Double.parseDouble(exchangeRates.get(1).getText().replace(",", ".")));
        Assert.assertTrue(Double.parseDouble(exchangeRates.get(2).getText().replace(",", ".")) < Double.parseDouble(exchangeRates.get(3).getText().replace(",", ".")));
    }
}

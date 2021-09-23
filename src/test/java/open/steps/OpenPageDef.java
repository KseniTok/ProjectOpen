package open.steps;

import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.OpenPage;

public class OpenPageDef {
    @Then("^проверить, что курс продажи больше курса покупки, для (.*)$")
    public void проверитьЧтоКурсПродажиБольшеКурсаПокупкиДляТипВалюты(String typeMoney) {
    OpenPage openPage = new OpenPage();
    Assert.assertTrue(
    Double.parseDouble(openPage.getCollectExchangeRates().stream()
                   .filter(x -> x.get("Валюта обмена").contains(typeMoney))
                   .findFirst().get().get("Банк покупает").replace(",","."))
                   <
                   Double.parseDouble(openPage.getCollectExchangeRates().stream()
                   .filter(x -> x.get("Валюта обмена").contains(typeMoney))
                   .findFirst().get().get("Банк продает").replace(",",".")), "Курс продажи меньше курса покупки, для " + typeMoney);
    }
}

package pages;

import driver.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class OpenPage implements Page {
    WebDriver driver;

    public OpenPage() {
        initPage();
        driver = WebDriverManager.getCurrentDriver();
    }

    @FindBy(xpath = "//span[@class='main-page-exchange__rate']")  private List<WebElement> exchangeRates;

    @Override
    public boolean isPageLoaded() {
        return exchangeRates.stream().allMatch(x -> x.isDisplayed());
    }

    public List<WebElement> getExchangeRates() {
        return exchangeRates;
    }
}

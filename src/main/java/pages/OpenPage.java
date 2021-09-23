package pages;

import driver.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OpenPage {
    WebDriver driver;
    @FindBy (xpath = "//tbody/tr[contains(@class,'header')]/td") private List<WebElement> tableHeaders;
    @FindBy (xpath = "//tbody/tr[contains(@class,'row')]") private List<WebElement> tableRows;
    private List<Map<String,String>> collectExchangeRates = new ArrayList<>();

    public OpenPage() {
        driver = WebDriverManager.getCurrentDriver();
        PageFactory.initElements(driver, this);
    }

    public List<WebElement> getTableHeaders() {
        return tableHeaders;
    }

    public List<WebElement> getTableRows() {
        return tableRows;
    }

    public List<Map<String,String>> getCollectExchangeRates() {
        for (int i = 0; i < tableRows.size(); i++){
            Map<String, String> collectRow = new HashMap<>();
            for (int j = 0; j < tableHeaders.size(); j++){
                collectRow.put(
                        tableHeaders.get(j).getText(),
                        tableRows.get(i).findElement(By.xpath("./td["+(j+1)+"]")).getText());
            }
            collectExchangeRates.add(collectRow);
        }
        System.out.println(collectExchangeRates);
        return collectExchangeRates;
    }
}

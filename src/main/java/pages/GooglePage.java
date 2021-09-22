package pages;

import driver.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class GooglePage implements Page{
    WebDriver driver;

    public GooglePage() {
        initPage();
        driver = WebDriverManager.getCurrentDriver();
    }

    @FindBy(xpath = "//input[@value='Поиск в Google']") private WebElement searchButton;
    @FindBy(xpath = "//input[@title='Поиск']") private WebElement searchField;
    @FindBy(xpath = "//div[@class='g']") private List<WebElement> resultSearch;

    @Override
    public boolean isPageLoaded() {
        return searchField.isDisplayed();
    }

    public WebElement getSearchButton() {
        return searchButton;
    }

    public WebElement getSearchField() {
        return searchField;
    }

    public List<WebElement> getResultSearch() {
        return resultSearch;
    }
}

package pages;

import driver.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class GooglePage {
    WebDriver driver;
    @FindBy(xpath = "//input[@value='Поиск в Google']") private WebElement searchButton;
    @FindBy(xpath = "//input[@title='Поиск']") private WebElement searchField;
    @FindBy(xpath = "//div[@class='g']") private List<WebElement> resultSearch;

    public GooglePage() {
        driver = WebDriverManager.getCurrentDriver();
        PageFactory.initElements(driver, this);
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

package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResultsPage {
    private WebDriver driver;

    @FindBy(xpath = "//p[@class='titulo' and contains(text(), 'Excelente Lote')]")
    private WebElement firstHouseButton;

    public SearchResultsPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    public PropertyDetail clickToPropertyDetail(){
        firstHouseButton.click();
        return new PropertyDetail(driver);
    }
}

package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePage {

    private WebDriver driver;

    @FindBy(css = "select[name='operacion[]']")
    private WebElement operationTypeSelect;

    @FindBy(css = "select[name='tipoPropiedad[]']")
    private WebElement propertyTypeSelect;

    @FindBy(css = "select[name='localidad[]']")
    private WebElement locationTypeSelect;

    @FindBy(xpath = "//img[@alt='buscar']/ancestor::button[1]")
    private WebElement searchButton;

    public HomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void selectOperationType(){
        Select select = new Select(operationTypeSelect);
        select.selectByValue("venta");
    }

    public void setPropertyTypeSelect(){
        Select select = new Select(propertyTypeSelect);
        select.selectByValue("casas");
    }

    public void setLocationTypeSelect(){
        Select select = new Select(locationTypeSelect);
        select.selectByValue("lomas-de-zamora");
    }

    public SearchResultsPage clickSearchButton(){
        searchButton.click();
        return new SearchResultsPage(driver);
    }






}

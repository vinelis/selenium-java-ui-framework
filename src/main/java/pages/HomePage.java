package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    private static final By operationTypeSelect = By.cssSelector("select[name='operacion[]']");
    private static final By propertyTypeSelect = By.cssSelector("select[name='tipoPropiedad[]']");
    private static final By locationTypeSelect = By.cssSelector("select[name='localidad[]']");
    private static final By searchBtn = By.xpath("//img[@alt='buscar']/ancestor::button[1]");

    public HomePage(WebDriver driver){
        super(driver);
    }

    public void setOperationLocationAndPropertyTypeSuccesfully(){
        driver.findElement(operationTypeSelect).sendKeys("Venta");
        driver.findElement(propertyTypeSelect).sendKeys("Casas");
        driver.findElement(locationTypeSelect).sendKeys("Lomas de Zamora");
    }

    public SearchResultsPage clickSearchButton(){
        safeClick(driver.findElement(searchBtn));
        return new SearchResultsPage(driver);
    }






}

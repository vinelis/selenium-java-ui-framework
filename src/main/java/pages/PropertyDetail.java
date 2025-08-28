package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PropertyDetail {

    private WebDriver driver;

    @FindBy(id = "consulta_form_nombre")
    private WebElement nameField;

    @FindBy(id = "consulta_form_email")
    private WebElement emailField;

    @FindBy(id = "consulta_form_telefono")
    private WebElement phoneNumberField;

    public PropertyDetail(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void setNameField(String name){
        nameField.sendKeys(name);
    }

    public void setEmailField(String email){
        emailField.sendKeys(email);
    }

    public void setPhoneNumberField(String phoneNumber){
        phoneNumberField.sendKeys(phoneNumber);
    }

    public String getFirstAndLastNameFieldText(){
        return nameField.getAttribute("value");
    }

    public String getEmailFieldText(){
        return emailField.getAttribute("value");
    }

    public String getPhoneNumberFieldText(){
        return phoneNumberField.getAttribute("value");
    }

}

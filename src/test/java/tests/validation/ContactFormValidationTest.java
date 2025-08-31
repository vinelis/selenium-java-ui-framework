package tests.validation;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.PropertyDetail;

public class ContactFormValidationTest extends BaseTests{

    @Test
    public void invalidEmailFormatValidationTest(){
        driver.get("https://osvaldovinelli.com.ar/propiedad/526204");
        PropertyDetail propertyDetail = new PropertyDetail(driver);

        String name = "Luca Vinelli";
        String invalidEmail = "invalid-email.com";
        String phone = "1112345678";

        propertyDetail.setNameField(name);
        propertyDetail.setEmailField(invalidEmail);
        propertyDetail.setPhoneNumberField(phone);
        propertyDetail.submitForm();

        String expectedErrorMessage = "Ingresá un email válido";
        String actualErrorMessage = propertyDetail.getEmailErrorText();

        Assert.assertEquals(actualErrorMessage, expectedErrorMessage,
                "The email validation error message was not correct.");

    }
}

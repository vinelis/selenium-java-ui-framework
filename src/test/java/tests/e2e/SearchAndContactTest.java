package tests.e2e;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.PropertyDetail;
import pages.SearchResultsPage;

public class SearchAndContactTest extends BaseTests {

    @Test
    public void successfullSearchAndContactFlowTest(){

        String operationtype = "Venta";
        String propertyType = "Casas";
        String locationType = "Lomas de Zamora";

        homePage.setOperationLocationAndPropertyTypeSuccesfully(operationtype,propertyType, locationType);
        SearchResultsPage searchResultsPage = homePage.clickSearchButton();
        PropertyDetail propertyDetail = searchResultsPage.clickToPropertyDetail();

        String name = "Luca Vinelli";
        String email = "Lucavinelli4@gmail.com";
        String phone = "1112345678";

        propertyDetail.setNameField(name);
        propertyDetail.setEmailField(email);
        propertyDetail.setPhoneNumberField(phone);

        Assert.assertEquals(propertyDetail.getFirstAndLastNameFieldText(), name, "The name field content is incorrect.");
        Assert.assertEquals(propertyDetail.getEmailFieldText(), email, "The email field content is incorrect.");
        Assert.assertEquals(propertyDetail.getPhoneNumberFieldText(), phone, "The phone number field content is incorrect.");
    }
}

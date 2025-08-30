package tests.functionality;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SearchResultsPage;

public class SearchFuncionalityTest extends BaseTests {

    @Test
    public void searchForNonExistentPropertyTest(){

        String operationtype = "Venta";
        String propertyType = "Departamentos";
        String locationType = "Arturo Segui";

        homePage.setOperationLocationAndPropertyTypeSuccesfully(operationtype, propertyType, locationType);
        SearchResultsPage searchResultsPage = homePage.clickSearchButton();

        String expectedMessage = "no se han encontrado resultados";
        String actualMessage = searchResultsPage.getNoResultMesagge();

        Assert.assertTrue(actualMessage.contains(expectedMessage), "The 'no results' warning message was not correct or not found.");

    }
}

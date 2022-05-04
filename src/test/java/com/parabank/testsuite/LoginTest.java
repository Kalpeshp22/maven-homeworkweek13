package com.parabank.testsuite;

import com.parabank.pages.LoginPage;
import com.parabank.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {

    LoginPage loginPage = new LoginPage();

    @Test
    public void userShouldLoginsuccessfullWithValidCredential() {
        loginPage.enterUserName("tomsmith");
        loginPage.enterpassword("SuperSecretPassword");
        loginPage.clickOnLoginButton();
        String expectedErrorMessage ="Secure Area";
        String actualErrorMessage  = loginPage.getErrorMessage();
        Assert.assertEquals(expectedErrorMessage,actualErrorMessage,"Error message Displyed");

    }@Test
    public void verifyTheUsernameErrorMeassge() {
        loginPage.enterUserName("tomsmith");
        loginPage.enterpassword("SuperSecretPassword");
        loginPage.clickOnLoginButton();
        String expectedErrorMessage = "The username and password could not be verified.";
        String actualErrorMessage = loginPage.getErrorMessage();
        Assert.assertEquals(actualErrorMessage, expectedErrorMessage, "Error message Displyed");
    }
    @Test
    public void verifypasswordErrorMeassge() {
        loginPage.enterUserName("tomsmith");
        loginPage.enterpassword("SuperSecretPassword");
        loginPage.clickOnLoginButton();
        String expectedErrorMessage = "The username and password could not be verified";
        String actualErrorMessage = loginPage.getErrorMessage();
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage, "Error message Displyed");
    }

}

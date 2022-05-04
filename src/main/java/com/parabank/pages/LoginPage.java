package com.parabank.pages;

import com.parabank.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {
    By usernamefield = By.name("username");
    By passwordField = By.name("password");
    By loginButton = By.xpath("//body/div[@id='mainPanel']/div[@id='bodyPanel']/div[@id='leftPanel']/div[@id='loginPanel']/form[1]/div[3]/input[1]");
    By verifyText = By.xpath("//p[contains(text(),'The username and password could not be verified.')]");
    By invalidVerifyText = By.xpath("//div[@id='flash");

    public void enterUserName(String username) {
        sendTextToElement(usernamefield, username);
    }

    public void enterpassword(String password) {
        sendTextToElement(passwordField, password);
    }

    public void clickOnLoginButton() {
        clickOnElement(loginButton);
    }

    public String getErrorMessage() {
        return getTextFromElement(verifyText);
    }

    public String getErrorMessageInvalid() {
        return getTextFromElement(invalidVerifyText);
    }

}

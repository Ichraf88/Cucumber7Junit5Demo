package com.example.locatiors;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Collection;

public class LoginPageLocators {

    @FindBy(css = "input[placeholder='Username']")
    public  WebElement userName;

    @FindBy(css = "input[placeholder='Password']")
    public WebElement passWord;

    @FindBy(css = "button[type='submit']")
    public WebElement loginButton;

    @FindBy(css = ".oxd-text.oxd-text--p.oxd-alert-content-text")
    public WebElement errorMsg;

    @FindBy(xpath = "//a[@href='https://www.linkedin.com/company/orangehrm/mycompany/']//*[name()='svg']")
    public WebElement linkdInIcon;

    @FindBy(xpath = "//a[@href='https://www.facebook.com/OrangeHRM/']//*[name()='svg']")
    public WebElement facebookIcon;

    @FindBy(css = ".oxd-text.oxd-text--p.orangehrm-login-forgot-header")
    public WebElement forgotPwButton;


}

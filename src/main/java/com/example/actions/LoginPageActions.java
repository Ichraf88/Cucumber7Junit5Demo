package com.example.actions;

import com.example.locatiors.LoginPageLocators;
import com.example.utils.ConfigFileReader;
import com.example.utils.HelperClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class LoginPageActions {

    LoginPageLocators loginPageLocators = null;

    public LoginPageActions(){
        this.loginPageLocators = new LoginPageLocators();
        PageFactory.initElements(HelperClass.getDriver(), loginPageLocators);
    }

    // set Username in textbox
    public void setUserName(String StrUserName){
        loginPageLocators.userName.clear();
         loginPageLocators.userName.sendKeys(StrUserName);
    }

    // set Password in textbox
    public void setPassWord(String StrPassWord){
        loginPageLocators.passWord.clear();
        loginPageLocators.passWord.sendKeys(StrPassWord);
    }
    // Click on Login Button
    public void clickLogin(){
        loginPageLocators.loginButton.click();

    }

    public String getErrorMessage(){
        return loginPageLocators.errorMsg.getText();
    }

    public void login (String StrUserName, String StrPassWord){
        //fill UserName
        this.setUserName(StrUserName);
        //Fill Password
        this.setPassWord(StrPassWord);
        //Click Login Button
        this.clickLogin();
    }

}
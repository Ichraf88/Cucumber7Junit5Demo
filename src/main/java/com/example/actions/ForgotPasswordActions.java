package com.example.actions;

import com.example.locatiors.ForgotPasswordLocators;
import com.example.utils.HelperClass;
import org.openqa.selenium.support.PageFactory;

public class ForgotPasswordActions {


    ForgotPasswordLocators forgotPasswordLocators = null;

    public ForgotPasswordActions(){
        this.forgotPasswordLocators = new ForgotPasswordLocators();
        PageFactory.initElements(HelperClass.getDriver(), forgotPasswordLocators);
    }

    public String getforgotPwMssg (){
       return forgotPasswordLocators.forgotPwMssg.getText();
    }

}

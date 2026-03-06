package com.example.actions;

import com.example.locatiors.HomePageLocators;
import com.example.utils.HelperClass;
import org.openqa.selenium.support.PageFactory;

public class HomePageActions {

    HomePageLocators homePageLocators ;
    public  HomePageActions (){
        this.homePageLocators = new HomePageLocators();
        PageFactory.initElements(HelperClass.getDriver(), homePageLocators);

    }
    //Get Username Fron Page
    public String getHomePageText(){
        return homePageLocators.homeDashboard.getText();
    }
}

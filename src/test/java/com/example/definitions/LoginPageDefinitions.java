package com.example.definitions;

import com.example.actions.HomePageActions;

import com.example.actions.LoginPageActions;
import com.example.utils.ConfigFileReader;
import com.example.utils.HelperClass;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class LoginPageDefinitions {

    HomePageActions homePageActions = new HomePageActions();
    ConfigFileReader configFileReader = new ConfigFileReader();
    LoginPageActions loginPageActions = new LoginPageActions();

    // ========== BACKGROUND ==========

    @Given("User is on HRMLogin page Orange HRM")
    public void userIsOnHrmLoginPageOrangeHRM() {
        HelperClass.openPage(configFileReader.getProperty("home.url"));
    }

    // ========== LOGIN ==========

    @When("User enters username as {string} and password as {string}")
    public void userEntersUsernameAsAndPasswordAs(String username, String password) {
       loginPageActions.login(username, password);
    }

    @Then("User should be able to login successfully and new page open {string}")
    public void userShouldBeAbleToLoginSuccessfullyAndNewPageOpen(String message) {
        //Verify Home Page
        Assertions.assertEquals(homePageActions.getHomePageText(), message);
    }

    // ========== INVALID LOGIN ==========

    @Then("User should be able to see error message {string}")
    public void userShouldBeAbleToSeeErrorMessage(String errorMessage) {
        Assertions.assertTrue(loginPageActions.getErrorMessage().contains("Invalid credentials"), errorMessage);
    }

    // ========== SOCIAL LINKS ==========

    @Then("User should be able to see FaceBook Icon")
    public void userShouldBeAbleToSeeFaceBookIcon() {
        // TODO: implement step
    }

    @Then("User should be able to see LinkedIn Icon")
    public void userShouldBeAbleToSeeLinkedInIcon() {
        // TODO: implement step
    }

    // ========== FORGOT PASSWORD ==========

    @When("User clicks on forgot your password link")
    public void userClicksOnForgotYourPasswordLink() {
        // TODO: implement step
    }

    @Then("User should navigate to new Page")
    public void userShouldNavigateToNewPage() {
        // TODO: implement step
    }

}
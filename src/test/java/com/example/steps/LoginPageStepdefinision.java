package com.example.steps;

import com.example.app.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageStepdefinision {
    LoginPage loginPage = new LoginPage();
    @Given("I am on login page")
    public void iAmOnLoginPage() {
        loginPage.versionHeaderDisplayed();
    }

    @When("I input valid email")
    public void iInputValidEmail() {
        loginPage.inputValidEmail("retiamelina10@gmail.com");
    }

    @And("I input valid password")
    public void iInputValidPassword() {
        loginPage.inputValidPassword("Retiaah10");
    }

    @And("I click login button")
    public void iClickLoginButton() {
        loginPage.clickLoginBtn();
    }

    @Then("I success login")
    public void iSuccessLogin() {
        loginPage.successLogin();
    }
    
    @Then("I can not login")
    public void iCanNotLogin() {
        loginPage.cantLogin();
    }


    @When("I input invalid email")
    public void iInputInvalidEmail() {
        loginPage.inputInvalidEmail("retiamelina10@upi.edu");
    }

    @And("I input invalid password")
    public void iInputInvalidPassword() {
        loginPage.inputInvalidPassword("retiaah");
    }
}

package com.example.app.pages;


import com.example.app.base.BasePageObject;
import org.openqa.selenium.By;

public class LoginPage extends BasePageObject {

    private By versionHeader = By.xpath("//android.widget.ImageView");
    private By loginBtn = By.id("appCompatButtonLogin");
    private By fieldEmail = By.id("textInputEditTextEmail");
    private By fieldPassword = By.id("textInputEditTextPassword");


    public void versionHeaderDisplayed() {
        isDisplayed(versionHeader);
    }

    public void inputValidEmail(String s) {
        inputText(fieldEmail, s);

    }

    public void inputValidPassword(String retiaah10) {
        inputText(fieldPassword, retiaah10);
    }

    public void clickLoginBtn() {
        click(loginBtn);
    }

    public void successLogin() {
        isDisplayed(versionHeader);
    }

    public void cantLogin() {
        isDisplayed(versionHeader);
    }

    public void inputInvalidEmail(String l) {
        inputText(fieldEmail, l);
    }

    public void inputInvalidPassword(String retiaah) {
        inputText(fieldPassword, retiaah);
    }
}

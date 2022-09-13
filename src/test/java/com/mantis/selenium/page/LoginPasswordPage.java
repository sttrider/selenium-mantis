package com.mantis.selenium.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPasswordPage extends BasePage {
    @FindBy(id = "password")
    WebElement password;


    @FindBy(xpath = "//input[@value='Login']")
    WebElement login;

    public LoginPasswordPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void fillPassword(String username) {
        this.password.sendKeys(username);
    }

    public void doLogin() {
        login.click();
    }
}

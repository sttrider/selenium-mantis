package com.mantis.selenium.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {
    @FindBy(id = "username")
    WebElement username;

    @FindBy(xpath = "//input[@value='Login']")
    WebElement login;

    @FindBy(xpath = "//div[@class='alert alert-danger']/p")
    WebElement loginError;

    public LoginPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
        driver.get("http://localhost:8989");
    }

    public void fillUsername(String username) {
        this.username.sendKeys(username);
    }

    public void doLogin() {
        login.click();
    }

    public boolean hasError() {
        return loginError.getText().equals("Your account may be disabled or blocked or the username/password you entered is incorrect.");
    }
}

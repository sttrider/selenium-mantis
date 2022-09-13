package com.mantis.selenium;

import com.mantis.selenium.page.LoginPage;
import com.mantis.selenium.page.LoginPasswordPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class BaseTest {

    public static final String USERNAME = "administrator";
    public static final String PASSWORD = "administrator";

    WebDriver driver;

    @BeforeEach
    public void setup() {
        driver = new ChromeDriver();
    }

    @AfterEach
    public void cleanup() {
        driver.quit();
    }

    public void doLogin() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.fillUsername(USERNAME);
        loginPage.doLogin();
        LoginPasswordPage loginPasswordPage = new LoginPasswordPage(driver);
        loginPasswordPage.fillPassword(PASSWORD);
        loginPasswordPage.doLogin();
    }
}

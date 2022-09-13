package com.mantis.selenium;

import com.mantis.selenium.page.HeaderPage;
import com.mantis.selenium.page.LoginPage;
import com.mantis.selenium.page.LoginPasswordPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LoginTest extends BaseTest {

    @Test
    public void shouldOpenSuccessfully() {
        login("administrator");

        HeaderPage headerPage = new HeaderPage(driver);
        Assertions.assertTrue(headerPage.isLogged());
    }

    @Test
    public void shouldOpenWithError() {
        LoginPage loginPage = login("error");

        Assertions.assertTrue(loginPage.hasError());
    }

    private LoginPage login(String password) {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.fillUsername("administrator");
        loginPage.doLogin();
        LoginPasswordPage loginPasswordPage = new LoginPasswordPage(driver);
        loginPasswordPage.fillPassword(password);
        loginPasswordPage.doLogin();
        return loginPage;
    }
}

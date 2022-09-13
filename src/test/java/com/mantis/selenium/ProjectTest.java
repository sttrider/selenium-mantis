package com.mantis.selenium;

import com.mantis.selenium.page.HeaderPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProjectTest extends BaseTest {

    public void setup() {
        super.setup();
        doLogin();
    }

    @Test
    public void shouldListProjects() {
        HeaderPage headerPage = new HeaderPage(driver);
        Assertions.assertTrue(headerPage.isLogged());
    }
}

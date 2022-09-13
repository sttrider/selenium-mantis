package com.mantis.selenium.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HeaderPage extends BasePage {

    @FindBy(xpath = "//span[@class='user-info']")
    WebElement userInfo;

    public HeaderPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public boolean isLogged() {
        return userInfo.getText().equals("administrator");
    }
}

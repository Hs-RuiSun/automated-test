package com.cgi.selenium.pom;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
    private static WebDriver webDriver;

    @BeforeAll
    public static void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
        webDriver = new ChromeDriver();
    }

    @Test
    public void login() {
        String url = "http://192.168.1.138:2020/#!/";
        String username = "userGFI";
        String password = "gfi2015";
        boolean rememberMe = true;
        webDriver.get(url);
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.enter(username, password);
        if (rememberMe) {
            loginPage.rememberMe();
        }
        loginPage.login();
    }

}

package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class DriverSetup {
    public WebDriver driver;
    //for first case to execute -> beforesuite
    @BeforeSuite
    public WebDriver setupDriver() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        return driver;
    }
    // for last case to execute -> aftersuite
    @AfterSuite
    public void quitDriver() {
        driver.close();
    }
}

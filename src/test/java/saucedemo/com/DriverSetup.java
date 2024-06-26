package saucedemo.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class DriverSetup {
    public WebDriver driver;
    @BeforeSuite
    public WebDriver driverSetup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        return driver;
    }
    @AfterSuite
    public void quitDriver() {
        driver.close();
    }
}

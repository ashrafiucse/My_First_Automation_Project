package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyFirstWebAutomation extends DriverSetup {

    @Test
    public void testGoogleHomePage() throws InterruptedException {
        // open a browser
        //WebDriver driver = new ChromeDriver();

        // navigate to https://www.google.com/
        driver.get("https://www.google.com/");

        // observe the site
        Assert.assertEquals(driver.getTitle(),"Google");
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.google.com/");
        //Thread.sleep(5000);

        // close the browser
        //driver.close();

    }

    @Test
    public void testFacebookHomePage() {
        driver.get("https://www.facebook.com/");
        Assert.assertEquals(driver.getTitle(),"Facebook – log in or sign up");
    }
}

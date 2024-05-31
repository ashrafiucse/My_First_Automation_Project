package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MyFirstWebAutomation {

    @Test
    public void loadGoogleHomePage() throws InterruptedException {
        // open a browser
        WebDriver driver = new ChromeDriver();

        // navigate to https://www.google.com/
        driver.get("https://www.google.com/");

        // observe the site
        Thread.sleep(5000);

        // close the browser
        driver.close();

    }
}

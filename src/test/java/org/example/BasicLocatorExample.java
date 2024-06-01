package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class BasicLocatorExample extends DriverSetup{
    @Test
    public void testGoogleSearch() throws InterruptedException {
        driver.get("https://www.google.com/");
        //Locate Using id
        //WebElement searchBox = driver.findElement(By.id("APjFqb"));

        //Locate Using name
        //WebElement searchBox = driver.findElement(By.name("q"));

        //Locate Using class name
        //WebElement searchBox = driver.findElement(By.className("gLFyf"));

        //Locate Using class name
        WebElement searchBox = driver.findElement(By.tagName("textarea"));

        searchBox.sendKeys("Test Automation");
        Thread.sleep(2000);
        searchBox.clear();

        Thread.sleep(5000);
        //Locate Using Linktext
        WebElement gmailLink = driver.findElement(By.linkText("Gmail"));
        //click on link
        //gmailLink.click();
        System.out.println(gmailLink.getText());

        //Locate Using Partial Link Text
        WebElement imageLinkText = driver.findElement(By.partialLinkText("Image"));
        //imageLinkText.click();
        System.out.println(imageLinkText.getText());

        //Locate Using CSS Selector
        WebElement countryName = driver.findElement(By.cssSelector("div[class='uU7dJb']"));
        System.out.println(countryName.getText());

        //Locate Using Xpath Selector
        WebElement languageOptionText = driver.findElement(By.xpath("//div[@id='SIvCob']"));
        System.out.println(languageOptionText.getText());

        
    }
}

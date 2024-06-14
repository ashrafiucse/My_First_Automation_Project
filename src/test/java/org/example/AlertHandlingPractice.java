package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AlertHandlingPractice extends DriverSetup{
    @Test
    public void testAlertHandling() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        //Locate First Alert Button
        //driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();

        //Locate Second Alert Button
        //driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();

        //Locate Third Alert Button
        driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();

        //Retrieving Alert message compare with actual message
        Alert alert = driver.switchTo().alert();
        String alertText = alert.getText();
        //String alertText = driver.switchTo().alert().getText();
        Assert.assertEquals(alertText,"I am a JS prompt");
        Thread.sleep(3000);
        //alert.dismiss();
        alert.sendKeys("Hey! Who are you?");
        alert.accept();

        String result = driver.findElement(By.xpath("//p[@id='result']")).getText();
        Assert.assertEquals(result,"You entered: Hey! Who are you?");
        Thread.sleep(3000);
    }
}

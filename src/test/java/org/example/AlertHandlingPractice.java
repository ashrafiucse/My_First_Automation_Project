package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AlertHandlingPractice extends DriverSetup{
    @Test
    public void testAlertHandling() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
        Alert alert = driver.switchTo().alert();
        String message = alert.getText();
        Assert.assertEquals(message,"I am a JS Alert");
        Thread.sleep(1000);
        alert.accept();
        Thread.sleep(1000);
        String result = driver.findElement(By.xpath("//p[@id='result']")).getText();
        Assert.assertEquals(result,"You successfully clicked an alert");

        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
        alert = driver.switchTo().alert();
        message = alert.getText();
        Thread.sleep(1000);
        Assert.assertEquals(message,"I am a JS Confirm");
        alert.accept();
        Thread.sleep(1000);
        result = driver.findElement(By.xpath("//p[@id='result']")).getText();
        Assert.assertEquals(result,"You clicked: Ok");

        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
        alert = driver.switchTo().alert();
        message = alert.getText();
        Thread.sleep(1000);
        Assert.assertEquals(message,"I am a JS Confirm");
        alert.dismiss();
        Thread.sleep(1000);
        result = driver.findElement(By.xpath("//p[@id='result']")).getText();
        Assert.assertEquals(result,"You clicked: Cancel");

        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
        alert = driver.switchTo().alert();
        message = alert.getText();
        Thread.sleep(1000);
        Assert.assertEquals(message,"I am a JS prompt");
        alert.dismiss();
        Thread.sleep(1000);
        result = driver.findElement(By.xpath("//p[@id='result']")).getText();
        Assert.assertEquals(result,"You entered: null");

        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
        alert = driver.switchTo().alert();
        message = alert.getText();
        Thread.sleep(1000);
        Assert.assertEquals(message,"I am a JS prompt");
        alert.sendKeys("Hey Bro! What's up?");
        alert.accept();
        Thread.sleep(1000);
        result = driver.findElement(By.xpath("//p[@id='result']")).getText();
        Assert.assertEquals(result,"You entered: Hey Bro! What's up?");
        Thread.sleep(3000);


    }
}

package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class PerformActions extends DriverSetup{
    @Test
    public void testingActions() throws InterruptedException {
        driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
        Actions actions = new Actions(driver);
        WebElement mouseHoverButton = driver.findElement(By.xpath("//button[@id='mousehover']"));
        actions.clickAndHold(mouseHoverButton).build().perform();
        //driver.findElement(By.xpath("//a[normalize-space()='Top']")).click();
        driver.findElement(By.xpath("//a[normalize-space()='Reload']")).click();
        Thread.sleep(5000);
    }
}

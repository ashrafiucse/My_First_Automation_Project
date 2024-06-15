package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SelectTagHandling extends DriverSetup{

    @Test
    public void testSelectTagHandling() throws InterruptedException {
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        WebElement dropDownMenu = driver.findElement(By.id("dropdown-class-example"));
        dropDownMenu.click();
        Select select = new Select(dropDownMenu);
        select.selectByIndex(3);
        Thread.sleep(2000);
        select.selectByValue("option2");
        Thread.sleep(2000);
        select.selectByVisibleText("Option1");
        //System.out.println(select.getOptions());

        Thread.sleep(2000);

        select.selectByIndex(0);
        Thread.sleep(2000);
        System.out.println(select.getFirstSelectedOption().getText());
    }
}

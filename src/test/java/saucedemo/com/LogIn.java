package saucedemo.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LogIn extends DriverSetup {
    @Test
    public void testLogIn() throws InterruptedException {
        driver.get("https://www.saucedemo.com/");
        WebElement userNameBox = driver.findElement(By.id("user-name"));
        userNameBox.sendKeys("standard_user");
        WebElement passwordBox = driver.findElement(By.id("password"));
        passwordBox.sendKeys("secret_sauce");
        WebElement logInButton = driver.findElement(By.name("login-button"));
        logInButton.click();
        Thread.sleep(2000);
    }
    public void addToCart() throws InterruptedException {
        driver.get("https://www.saucedemo.com/inventory.html");
        Thread.sleep(5000);
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.saucedemo.com/inventory.html");
        System.out.println(driver.getTitle());
    }
}

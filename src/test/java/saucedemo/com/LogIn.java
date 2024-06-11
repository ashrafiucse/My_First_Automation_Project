package saucedemo.com;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LogIn extends DriverSetup {
    @Test
    public void testLogIn() throws InterruptedException {
        //Java faker object creating
        Faker faker = new Faker();
        driver.get("https://www.saucedemo.com/");
        WebElement userNameBox = driver.findElement(By.id("user-name"));
        userNameBox.sendKeys("standard_user");
        WebElement passwordBox = driver.findElement(By.id("password"));
        passwordBox.sendKeys("secret_sauce");
        //Locate Log in Button
        WebElement logInButton = driver.findElement(By.name("login-button"));
        logInButton.click();
        Thread.sleep(2000);
        //Locate Bike Light Product
        //driver.findElement(By.id("item_0_title_link")).click();

        //Locate Add to Cart Button
        //driver.findElement(By.name("add-to-cart")).click();

        //Locate Cart Icon
        driver.findElement(By.className("shopping_cart_link")).click();

        //Locate Bike light Price
        //String lightPrice = driver.findElement(By.className("inventory_item_price")).getText();
        //System.out.println(lightPrice);

        //Locate CheckOut Button and click it
        driver.findElement(By.name("checkout")).click();

        //Locate Delivery Address Text
        WebElement firstName = driver.findElement(By.id("first-name"));
        firstName.sendKeys(faker.name().firstName());

        WebElement lastName = driver.findElement(By.id("last-name"));
        lastName.sendKeys(faker.name().lastName());

        WebElement postCode = driver.findElement(By.id("postal-code"));
        postCode.sendKeys(faker.name().name());

        Thread.sleep(5000);

        //Locate Continue button
        WebElement continueButton = driver.findElement(By.id("continue"));
        continueButton.click();

        Thread.sleep(2000);

        //Locate Finish button

        WebElement finishButton = driver.findElement(By.id("finish"));
        finishButton.click();

        //Locate Menu Icon of left
        driver.findElement(By.id("react-burger-menu-btn")).click();

        //Locate LogOut button
        WebElement logOutButton = driver.findElement(By.id("logout_sidebar_link"));
        logOutButton.click();
        Thread.sleep(1000);
    }

}

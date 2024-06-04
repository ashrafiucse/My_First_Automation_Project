package facebook.com;

import org.example.DriverSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ForgottenAccountPage extends DriverSetup {
    @Test
    public void testForgottenAccountPage() throws InterruptedException {
        driver.get("https://web.facebook.com/login/identify/?ctx=recover&ars=facebook_login&from_login_screen=0");

        //Locate Email or Phone to Log in
        //WebElement emailorPhoneLogin = driver.findElement(By.xpath("//*[@type='email' or @placeholder='Email or phone']"));
        //emailorPhoneLogin.sendKeys("abc");

        //Locate Password Field
        //WebElement passwordFieldLogin = driver.findElement(By.xpath("//*[contains(@placeholder,'Password')]"));
        //passwordFieldLogin.sendKeys("abcd");


        //Locate Log in Button
        WebElement logInButton = driver.findElement(By.xpath("//*[contains(text(),'Log in')]"));
        //logInButton.click();

        //Locate Forgotten Account Link
        //WebElement forgottenAccountLink = driver.findElement(By.linkText("Forgotten account?"));
        //forgottenAccountLink.click();

        //Locate Email or Phone Field to search account
        //WebElement emailOrPhoneFieldSearch = driver.findElement(By.name("email"));
        //emailOrPhoneFieldSearch.sendKeys("abc@xyz.com");

        //Locate Cancel Button
        //WebElement cancelButton = driver.findElement(By.linkText("Cancel"));
        //cancelButton.click();

        //Locate Search Button
        //WebElement searchButton = driver.findElement(By.name("did_submit"));
        //searchButton.click();
        Thread.sleep(5000);
    }
}

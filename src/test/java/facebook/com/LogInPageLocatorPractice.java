package facebook.com;

import org.example.DriverSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

public class LogInPageLocatorPractice extends DriverSetup {
    private static final Logger log = LoggerFactory.getLogger(LogInPageLocatorPractice.class);

    @Test
    public void testFacebookLogInPage() throws InterruptedException {
        driver.get("https://web.facebook.com/");

        //Locate Email Input Text Field
        WebElement emailTextField = driver.findElement(By.id("email"));
        //emailTextField.sendKeys("abc@xyz.com");

        //Locate Password Text Field
        WebElement passwordField = driver.findElement(By.id("pass"));
        //passwordField.sendKeys("abc123");

        //Locate Log In Button
        WebElement logInButton = driver.findElement(By.name("login"));
        //logInButton.click();

        //Locate Forget Password Link
        WebElement forgetPasswordLink = driver.findElement(By.linkText("Forgotten password?"));
        //forgetPasswordLink.click();

        //Locate Create New Account Link
        WebElement createNewAccountLink = driver.findElement(By.linkText("Create new account"));
        //createNewAccountLink.click();

        //Locate Create Page Link
        WebElement createPageLink = driver.findElement(By.linkText("Create a Page"));
        //createPageLink.click();

        //Locate Bangla Language Link
        WebElement BanglaLanguageLink = driver.findElement(By.linkText("বাংলা"));
        //BanglaLanguageLink.click();

        //Locate Bahasa Indonesia Language Link
        WebElement BahasaIndonesialanguageLink = driver.findElement(By.linkText("Bahasa Indonesia"));
        //BahasaIndonesialanguageLink.click();

        //---------------Footer Section-------------
        //Locate Messenger App Link
        WebElement messengerAppLink = driver.findElement(By.linkText("Messenger"));
        //messengerAppLink.click();

        //Locate Facebook Lite App Link
        WebElement facebookLiteAppLink = driver.findElement(By.linkText("Facebook Lite"));
        //facebookLiteAppLink.click();

        //Locate Facebook Video Link
        WebElement facebookVideoLink = driver.findElement(By.linkText("Video"));
        //facebookVideoLink.click();

        //Locate Contact uploading and non-users Link
        WebElement contactUploadingLink = driver.findElement(By.linkText("Contact uploading and non-users"));
        //contactUploadingLink.click();

        Thread.sleep(3000);
    }
}

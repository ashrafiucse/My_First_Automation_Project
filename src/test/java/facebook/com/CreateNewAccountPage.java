package facebook.com;

import org.example.DriverSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class CreateNewAccountPage extends DriverSetup {
    @Test
    public void testCreateNewAccountPage() throws InterruptedException {
        driver.get("https://en-gb.facebook.com/r.php");

        //Locate First Name Field
        WebElement firstNameField = driver.findElement(By.name("firstname"));
        firstNameField.sendKeys("Ashraf");

        //Locate Surname Field
        WebElement surNameField = driver.findElement(By.name("lastname"));
        surNameField.sendKeys("Ali");

        //Locate Mobile or Email Field
        WebElement mobileOrEmailField = driver.findElement(By.name("reg_email__"));
        mobileOrEmailField.sendKeys("abc@xyz.com");

        //Locate Reg Email Confirmation Field
        WebElement regEmailConfirmField = driver.findElement(By.name("reg_email_confirmation__"));
        regEmailConfirmField.sendKeys("abc@xyz.com");

        //Locate Password Field
        WebElement passwordField = driver.findElement(By.name("reg_passwd__"));
        passwordField.sendKeys("abc123");

        //Locate Age Field
        //WebElement ageField = driver.findElement(By.name("birthday_age"));
        //ageField.sendKeys("26");

        //------------Gender Section------------
        //Locate Female Radio Button
        WebElement femaleRadioButton = driver.findElement(By.xpath("//input[@value='1']"));
        //System.out.println(femaleRadioButton.getTagName());
        //femaleRadioButton.click();

        //Locate Male Radio Button
        WebElement maleRadioButton = driver.findElement(By.xpath("//input[@value='2']"));
        //System.out.println(maleRadioButton.getTagName());
        maleRadioButton.click();

        //Locate Custom Radio Button
        WebElement customRadioButton = driver.findElement(By.xpath("//input[@value='-1']"));
        //System.out.println(customRadioButton.getTagName());
        //customRadioButton.click();

        //---------------Some Links Before Sign Up Button---------
        //Locate Learn more Link Text
        WebElement learnMore = driver.findElement(By.linkText("Learn more"));
        //learnMore.click();

        //------Sign Up Button-------------
        //Locate Sign up Button
        WebElement signUpButton = driver.findElement(By.name("websubmit"));
        //signUpButton.click();

        //Locate Already have an account? Link
        WebElement alreadyHaveAnAccLink = driver.findElement(By.linkText("Already have an account?"));
        //alreadyHaveAnAccLink.click();

        Thread.sleep(5000);
    }
}

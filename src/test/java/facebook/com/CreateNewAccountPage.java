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

        //------------Gender Section------------
        //Locate Female Radio Button
        //WebElement femaleRadioButton = driver.findElement(By.xpath("//label[text(),'Female']"));
        //femaleRadioButton.click();

        Thread.sleep(2000);
    }
}

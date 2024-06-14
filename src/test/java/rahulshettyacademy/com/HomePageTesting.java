package rahulshettyacademy.com;

import org.example.DriverSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class HomePageTesting extends DriverSetup {
    @Test
    public void testRahulShettyAcademyHomePage() throws InterruptedException {
        driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");

        //Locate Radio Button 1
        WebElement radioButton1 = driver.findElement(By.xpath("//input[@value='radio1']"));
        radioButton1.click();

        //Locate input Text Box
        WebElement textBox = driver.findElement(By.xpath("//input[@id='autocomplete']"));
        textBox.sendKeys("Ashraf");
        //System.out.println(textBox.getAttribute("placeholder"));
        //System.out.println(textBox.getCssValue("padding"));
        //System.out.println(textBox.isDisplayed());
        //System.out.println(textBox.isEnabled());

        //Locate CheckBox 1
        WebElement checkBox1 = driver.findElement(By.id("checkBoxOption1"));
//        checkBox1.click();
//        Thread.sleep(2000);
//        checkBox1.click();

        //Locate New Tab link
//        WebElement newLinkButton = driver.findElement(By.id("opentab"));
//        newLinkButton.click();

        //Switch to new tab from the current tab
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.qaclickacademy.com");
        Thread.sleep(3000);

        //Switch to new windows from the current window
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.navigate().to("http://www.qaclickacademy.com/");
        //System.out.println(driver.getWindowHandles());

        ArrayList<String> windowHandlers = new ArrayList<String>(driver.getWindowHandles());
        for (int i = 0; i < windowHandlers.size(); i++) {
            System.out.println(windowHandlers.get(i));
        }
        driver.switchTo().
        Thread.sleep(3000);
    }
}

package daraz.com.bd;

import org.example.DriverSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LocatorPractice extends DriverSetup {
    @Test
    public void testLocatorsInHomePage() throws InterruptedException {
        driver.get("https://www.daraz.com.bd/");

        //Locate Become a seller
        WebElement becomeASeller = driver.findElement(By.linkText("Become a Seller"));
        //becomeASeller.click();

        //Locate Daraz Donates
        WebElement darazDonates = driver.findElement(By.linkText("Daraz Donates"));
        //darazDonates.click();

        //Locate Help and Support.It's a hover option that appearing in hovering on it.
        WebElement helpAndSupportOption = driver.findElement(By.id("topActionCustomCare"));
        //System.out.println(helpAndSupportOption.getText());

        //Locate Save More on App Link
        WebElement saveMoreOnApp = driver.findElement(By.linkText("Save More on App"));
        //saveMoreOnApp.click();
        //driver.navigate().back();

        //Locate Logo in Homepage
        WebElement darazLogo = driver.findElement(By.className("lzd-logo-content"));
        //darazLogo.click();

        //Locate Search Box in Homepage
        WebElement searchBox = driver.findElement(By.id("q"));
        //searchBox.sendKeys("Watch");

        //Locate Search Button
        WebElement searchButton = driver.findElement(By.className("search-box__search--2fC5"));
        //searchButton.click();

        //Locate LogIn Button
        WebElement logInButton = driver.findElement(By.linkText("Login"));
        //logInButton.click();

        //Locate Sign up Button
        WebElement signUpButton = driver.findElement(By.linkText("Sign Up"));
        //signUpButton.click();

        //Locate Language Button
        WebElement languageIcon = driver.findElement(By.className("lang-icon"));
        //System.out.println(languageIcon.getText());

        //Locate Cart Icon
        WebElement cartIcon = driver.findElement(By.className("cart-icon"));
        //System.out.println(cartIcon.getTagName());

        //Locate List Hover sub menu Left side
        WebElement leftSideBarSubMenu = driver.findElement(By.id("Level_1_Category_No1"));
        //System.out.println(leftSideBarSubMenu.getText());

        //Locate Slider Button
//        WebElement sliderButton = driver.findElement(By.className("slide-forward-arrow"));
//        sliderButton.click();

        //Locate Slider Image
//        WebElement sliderImage = driver.findElement(By.cssSelector("img[class='main-img']"));
//        System.out.println(sliderImage.getText());
        //Problemmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm


        //Locate Promotional Banner
        WebElement promotionalBanner = driver.findElement(By.className("countdown-content"));
        //promotionalBanner.click();


        //Locate Promotional Banner Bottom Link bar

        WebElement bannerBottomLinkBar = driver.findElement(By.linkText("Safe Payments"));
        //bannerBottomLinkBar.click();


        //---------------Flash Sell Section -------------------

        //Locate Flash Sell Shop More Button
        WebElement shopMoreButton = driver.findElement(By.className("J_ShopMoreBtn"));
        //System.out.println(shopMoreButton.getText());

        //Locate Flash Sell Element
//        WebElement flashSellProduct = driver.findElement(By.className("card-fs-content-body-unit"));
//        System.out.println(flashSellProduct.getText());
        // ---->> Problemmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm


        Thread.sleep(2000);
    }
}

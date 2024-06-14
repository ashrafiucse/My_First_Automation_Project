package daraz.com.bd;

import org.example.DriverSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class HomepageLocatorPractice extends DriverSetup {
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
        //WebElement sliderImage = driver.findElement(By.xpath("//section[@class='J_BannerSlider']//div[2]//div[1]//a[1]"));
        //sliderImage.click();
        //System.out.println(sliderImage.getTagName());

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
//        WebElement flashSellProduct = driver.findElement(By.xpath("//*[contains(@href,'www.daraz.com.bd/products/bioaqua-60g-hz20-i323089497')]"));
//        System.out.println(flashSellProduct.getText());


        //-----------------Categories------------
//        WebElement categoryProduct = driver.findElement(By.cssSelector("//a[@algo_scm='undefined']"));
//        System.out.println(categoryProduct.getText());

        //-----------------Just For You----------------

        //Locate Load More Button
        //WebElement loadMoreButton = driver.findElement(By.xpath("//a[normalize-space()='Load More']"));
        //loadMoreButton.click();
        //System.out.println(loadMoreButton.getTagName());
        //Not Showing Text

        //-------------Customer Care Section------------------
        //Locate Help Center Link Text
        WebElement helpCenter = driver.findElement(By.linkText("Help Center"));
        //helpCenter.click();


        //-----Daraz Column------
        //Locate About Daraz Text
        WebElement aboutDaraz = driver.findElement(By.linkText("About Daraz"));
        //aboutDaraz.click();

        //Locate Digital Payments Link Text
        WebElement digitalPayments = driver.findElement(By.linkText("Digital Payments"));
        //digitalPayments.click();

        //----------Country---------------
        //Locate Pakistan Link Text
        WebElement countryPakistan = driver.findElement(By.linkText("Pakistan"));
        //System.out.println(countryPakistan.getTagName());
        //countryPakistan.click();

        WebElement countrySriLanka = driver.findElement(By.linkText("Sri Lanka"));
        //System.out.println(countryPakistan.getTagName());
        //countrySriLanka.click();

        //---------------App Link Section---------------
        //Locate ios App Link
        WebElement iosAppLink = driver.findElement(By.xpath("//*[contains(@href,'itunes.apple.com/app/id978058048?mt=8&scm=1003.4.icms-zebra-100022982-2874591.OTHER_5436817469_2538051')]"));
        //System.out.println(iosAppLink.getTagName());
        //iosAppLink.click();

        //Locate Android Play Store Link
        WebElement playStoreLink = driver.findElement(By.className("icon-yatra-img-google-play"));
        //playStoreLink.click();
        //System.out.println(playStoreLink.getText());

        //Locate Android Play Store Link
        WebElement huaweiAppStoreLink = driver.findElement(By.xpath("//*[contains(@href,'appgallery.huawei.com')]"));
        //huaweiAppStoreLink.click();
        //System.out.println(huaweiAppStoreLink.getTagName());

        //---------Earn With Daraz-----------
        //Locate Daraz University Link Text
        WebElement darazUniversity = driver.findElement(By.partialLinkText("Daraz University"));
        //darazUniversity.click();
        //System.out.println(darazUniversity.getText());

        //Locate Sell On Daraz Link Text
        WebElement sellOnDaraz = driver.findElement(By.linkText("Sell on Daraz"));
        //sellOnDaraz.click();

        //------------Follow Us Section---------
        //Locate Facebook Icon
        WebElement facebookIcon = driver.findElement(By.xpath("//*[contains(@href,'facebook.com/DarazBangladesh')]"));
        //facebookIcon.click();

        //Locate Daraz Blog Icon
        WebElement darazBlogIcon = driver.findElement(By.xpath("//*[contains(@href,'blog.daraz.com.bd')]"));
        //darazBlogIcon.click();

        //Locate Daraz Youtube Channel Icon
        WebElement youtubeChannelIcon = driver.findElement(By.xpath("//*[contains(@href,'www.youtube.com/c/DarazBangladeshOfficial')]"));
        //youtubeChannelIcon.click();

        //Locate Daraz Twitter Page Icon
        WebElement darazTwitterPageIcon = driver.findElement(By.xpath("//*[contains(@href,'twitter.com/DarazBangladesh')]"));
        //darazTwitterPageIcon.click();


        //Locate Instagram Page Icon
        WebElement darazInstagramPageIcon = driver.findElement(By.xpath("//*[contains(@href,'instagram.com/darazbangladesh')]"));
        //darazInstagramPageIcon.click();


        //------------------Top Categories & Brands--------------------------
        //Locate Mobile Phones Link
        //WebElement mobilePhonesLinkText = driver.findElement(By.linkText("Mobile Phones"));
        //mobilePhonesLinkText.click();


        Thread.sleep(1000);
    }
}

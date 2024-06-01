package daraz.com.bd;

import org.example.DriverSetup;
import org.testng.annotations.Test;

public class LocatorPractice extends DriverSetup {
    @Test
    public void testLocatorsInHomePage() throws InterruptedException {
        driver.get("https://www.daraz.com.bd/");
        Thread.sleep(5000);
    }
}

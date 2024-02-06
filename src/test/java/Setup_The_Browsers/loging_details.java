package Setup_The_Browsers;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static Setup_The_Browsers.Setupbrowser.driver;

public class loging_details {




    public loging_details() throws IOException, InterruptedException {
        Thread.sleep(3000); // Sleep for 3 seconds

        Thread.sleep(1000);
        driver.findElement(By.id("username")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("username")).sendKeys("Roxxya");

        Thread.sleep(1000);
        driver.findElement(By.id("password")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("password")).sendKeys("Roxxy#97");








    }

    public void logingdetails() {
    }
}

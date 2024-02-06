package Booking_ticket;

import Setup_The_Browsers.Setupbrowser;
import Setup_The_Browsers.Submit_check;
import Setup_The_Browsers.loging_details;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.io.IOException;

import static Setup_The_Browsers.Setupbrowser.driver;

public class dayChange {
    @Test ( priority = 1 )
    void SetupBrowserTest() throws IOException, InterruptedException {
        Setupbrowser loginTest = new Setupbrowser();
        loginTest.Setup_browser();
        loginTest.Setupbrowse();
    }

    @Test (priority = 2)
    void signup_shift() throws InterruptedException {
        Thread.sleep(3000); // Sleep for 3 seconds
        driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/div/ul[2]/li[1]/a")).click();
    }

    @Test ( priority = 3 )
    void Loging() throws IOException, InterruptedException {
        loging_details loginTest = new loging_details();
        loginTest.logingdetails();
        loginTest.logingdetails();
    }
    @Test ( priority = 4 )
    void submit() throws IOException, InterruptedException {
        Submit_check loginTest = new Submit_check();
        loginTest.submit();
        loginTest.Setupbrowse();}
    @Test ( priority = 5 )
    void journy() throws IOException, InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/div/ul[1]/li[1]/a")).click();
    }

    @Test ( priority = 6 )
    void select() throws IOException, InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[2]/div[1]/div/div/div[2]/div[2]/div/a")).click();
    }

    @Test ( priority = 7 )
    void select_Seat() throws IOException, InterruptedException {
        Thread.sleep(10000);
        //1st
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/div[1]/div[2]/fieldset/div[1]/div/div[1]/div[1]/div[1]/span")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"genderModal\"]/div/div/div[2]/fieldset/div[1]/label[2]/div[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"selectGenderSeat\"]")).click();

        Thread.sleep(1500);


        //
        driver.findElement(By.id("date_of_journey")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div[2]/span[31]")).click();


        driver.findElement(By.xpath("//*[@id=\"bookingForm\"]/div[1]/div[5]/button")).click();
        driver.findElement(By.id("btnBookConfirm")).click();
    }
    @Test ( priority = 8 )
    void payment() throws IOException, InterruptedException {

        //1st
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/ul/li/div[2]/div/div/a")).click();
        Thread.sleep(1500);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div/form/div[2]/div/button")).click();
        Thread.sleep(1500);
        driver.findElement(By.xpath("/html/body/div/div[3]/div/div/div[2]/div[2]/a")).click();

        driver.findElement(By.xpath("/html/body/div/div[3]/div/div/div/div[2]/form/div[2]/div/button")).click();
    }

    }




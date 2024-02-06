package Create_users;

import Setup_The_Browsers.Setupbrowser;
import Setup_The_Browsers.Submit_check;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static Setup_The_Browsers.Setupbrowser.driver;

public class usercreate {

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

    @Test (priority = 3)
    void signup() throws InterruptedException {
        Thread.sleep(3000); // Sleep for 3 seconds
        driver.findElement(By.xpath("/html/body/div[1]/section/div/div/form/div[5]/div[1]/p/a")).click();
    }




    @Test (priority = 4)

    void Create_user() throws IOException, InterruptedException {
        Thread.sleep(3000); // Sleep for 3 seconds
        String filePath = "data_create"; // Replace with the path to your userdata.txt file

        // Read data from the file and store it in a list

        // Read data from the file and store it in a list
        List<String> userData = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line;
        while (( line = reader.readLine() ) != null) {
            userData.add(line);
        }
        reader.close();
        driver.findElement(By.id("firstname")).click();
        driver.findElement(By.id("firstname")).sendKeys(userData.get(0));
        driver.findElement(By.id("lastname")).click();
        driver.findElement(By.id("lastname")).sendKeys(userData.get(1));
        driver.findElement(By.id("mobile")).click();
        driver.findElement(By.id("mobile")).sendKeys(userData.get(2));
        driver.findElement(By.id("username")).click();
        driver.findElement(By.id("username")).sendKeys(userData.get(3));
        driver.findElement(By.id("email")).click();
        driver.findElement(By.id("email")).sendKeys(userData.get(4));
        driver.findElement(By.id("password")).click();
        driver.findElement(By.id("password")).sendKeys(userData.get(5));
        driver.findElement(By.id("password-confirm")).click();
        driver.findElement(By.id("password-confirm")).sendKeys(userData.get(6));
    }
    @Test (priority = 5)

    void submit() throws IOException, InterruptedException {
        Submit_check loginTest = new Submit_check();
        loginTest.submit();
        loginTest.Setupbrowse();}

    @Test ( priority = 6 )
    void End() throws IOException, InterruptedException {
        driver.quit();
    }
}

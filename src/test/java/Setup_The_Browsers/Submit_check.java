package Setup_The_Browsers;

import org.openqa.selenium.By;

import java.io.IOException;

import static Setup_The_Browsers.Setupbrowser.driver;

public class Submit_check {





    public void submit() throws IOException, InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.id("remember")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div/section/div/div/form/div[4]/button")).click();







    }

    public void logingdetails() {
    }

    public void Setupbrowse() {
    }

    public Submit_check() {
    }
}

